package cjxy.com.zs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cjxy.com.zs.page4.Five4;
import cjxy.com.zs.page4.Four4;
import cjxy.com.zs.page4.One4;
import cjxy.com.zs.page4.Three4;
import cjxy.com.zs.page4.Two4;
import cjxy.com.zs.xy.Five1;
import cjxy.com.zs.xy.Four1;
import cjxy.com.zs.xy.One1;
import cjxy.com.zs.xy.Three1;
import cjxy.com.zs.xy.Two1;


public class MoreActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.more_activity);
		Button goSecondActivityButton = (Button) findViewById(R.id.button1);
		Button goOneActivityButton = (Button) findViewById(R.id.button2);
		Button goThreeActivityButton = (Button) findViewById(R.id.button3);
		Button goFourActivityButton = (Button) findViewById(R.id.button4);
		Button gofiveActivityButton = (Button) findViewById(R.id.button5);
		goSecondActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(MoreActivity.this, One4.class);

				//启动Intent
				startActivity(intent);
			}
		});
		goOneActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(MoreActivity.this, Two4.class);

				//启动Intent
				startActivity(intent);
			}
		});
		goThreeActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(MoreActivity.this, Three4.class);

				//启动Intent
				startActivity(intent);
			}
		});
		goFourActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(MoreActivity.this, Four4.class);

				//启动Intent
				startActivity(intent);
			}
		});
		gofiveActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(MoreActivity.this, Five4.class);

				//启动Intent
				startActivity(intent);
			}
		});
	}		

}
