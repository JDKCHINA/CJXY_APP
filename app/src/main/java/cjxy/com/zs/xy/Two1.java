package cjxy.com.zs.xy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import cjxy.com.zs.MainActivity;
import cjxy.com.zs.R;
import cjxy.com.zs.luxian.Five2;
import cjxy.com.zs.luxian.Four2;
import cjxy.com.zs.luxian.One2;
import cjxy.com.zs.luxian.Three2;
import cjxy.com.zs.luxian.Two2;


public class Two1 extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two1);
        Button goSecondActivityButton = (Button) findViewById(R.id.button1);
        Button goOneActivityButton = (Button) findViewById(R.id.button2);
        Button goThreeActivityButton = (Button) findViewById(R.id.button3);
        Button goFourActivityButton = (Button) findViewById(R.id.button4);
        Button gofiveActivityButton = (Button) findViewById(R.id.button5);
        goSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                Intent intent = new Intent(Two1.this, One2.class);

                //启动Intent
                startActivity(intent);
            }
        });
        goOneActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                Intent intent = new Intent(Two1.this, Two2.class);

                //启动Intent
                startActivity(intent);
            }
        });
        goThreeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                Intent intent = new Intent(Two1.this, Three2.class);

                //启动Intent
                startActivity(intent);
            }
        });
        goFourActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                Intent intent = new Intent(Two1.this, Four2.class);

                //启动Intent
                startActivity(intent);
            }
        });
        gofiveActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                Intent intent = new Intent(Two1.this, Five2.class);

                //启动Intent
                startActivity(intent);
            }
        });
    }

    @Override
    //设置回退
    //覆盖Activity类的onKeyDown(int keyCoder,KeyEvent event)方法
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK))
        {
            Intent myIntent = new Intent();
            myIntent = new Intent(Two1.this, MainActivity.class);
            myIntent.putExtra("name",50);
            startActivity(myIntent);
            this.finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}