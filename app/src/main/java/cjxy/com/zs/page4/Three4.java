package cjxy.com.zs.page4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cjxy.com.zs.MainActivity;
import cjxy.com.zs.R;
import cjxy.com.zs.gywm.One5;
import cjxy.com.zs.gywm.Two5;


public class Three4 extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three4);
        Button goSecondActivityButton = (Button) findViewById(R.id.button1);
        Button goOneActivityButton = (Button) findViewById(R.id.button2);
        Button goThreeActivityButton = (Button) findViewById(R.id.button3);
        goSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                Intent intent = new Intent(Three4.this, One5.class);

                //启动Intent
                startActivity(intent);
            }
        });
        goOneActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                Intent intent = new Intent(Three4.this, Two5.class);

                //启动Intent
                startActivity(intent);
            }
        });
        goThreeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Three4.this, "已是最新版本，敬请期待V 2.0",Toast.LENGTH_SHORT).show();
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
            myIntent = new Intent(Three4.this, MainActivity.class);
            myIntent.putExtra("name",60);
            startActivity(myIntent);
            this.finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}
