package cjxy.com.zs;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;

import cjxy.com.zs.page1.Five6;
import cjxy.com.zs.page1.Four6;
import cjxy.com.zs.page1.One6;
import cjxy.com.zs.page1.Six6;
import cjxy.com.zs.page1.Three6;
import cjxy.com.zs.page1.Two6;
import cjxy.com.zs.page4.Five4;
import cjxy.com.zs.page4.Four4;
import cjxy.com.zs.page4.One4;
import cjxy.com.zs.page4.Three4;
import cjxy.com.zs.page4.Two4;

public class One extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xxgk);
        Button goSecondActivityButton = (Button) findViewById(R.id.button1);
        Button goOneActivityButton = (Button) findViewById(R.id.button2);
        Button goThreeActivityButton = (Button) findViewById(R.id.button3);
        Button goFourActivityButton = (Button) findViewById(R.id.button4);
        Button gofiveActivityButton = (Button) findViewById(R.id.button5);
        Button gosixActivityButton = (Button) findViewById(R.id.button6);
        ImageButton gobackActivityButton = (ImageButton) findViewById(R.id.imageButton10);
        gobackActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent();
                myIntent = new Intent(One.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
        goSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                Intent intent = new Intent(One.this, One6.class);

                //启动Intent
                startActivity(intent);
            }
        });
        goOneActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                Intent intent = new Intent(One.this, Two6.class);

                //启动Intent
                startActivity(intent);
            }
        });
        goThreeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                Intent intent = new Intent(One.this, Three6.class);

                //启动Intent
                startActivity(intent);
            }
        });
        goFourActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                Intent intent = new Intent(One.this, Four6.class);

                //启动Intent
                startActivity(intent);
            }
        });
        gofiveActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                Intent intent = new Intent(One.this, Five6.class);

                //启动Intent
                startActivity(intent);
            }
        });
        gosixActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                Intent intent = new Intent(One.this, Six6.class);

                //启动Intent
                startActivity(intent);
            }
        });
    }

    @Override
    //设置回退
    //覆盖Activity类的onKeyDown(int keyCoder,KeyEvent event)方法
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Intent myIntent = new Intent();
            myIntent = new Intent(One.this, MainActivity.class);
            startActivity(myIntent);
            this.finish();
        }
        return super.onKeyDown(keyCode, event);
    }

}