package cjxy.com.zs;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import cjxy.com.zs.xy.Five1;
import cjxy.com.zs.xy.Four1;
import cjxy.com.zs.xy.One1;
import cjxy.com.zs.xy.Three1;
import cjxy.com.zs.xy.Two1;

public class PersonInfoActivity extends Activity {
	private WebView webview;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.personalinfo_activity);
		webview = (WebView) findViewById(R.id.webView1);
		//设置WebView属性，能够执行Javascript脚本
		webview.getSettings().setJavaScriptEnabled(true);
		//加载需要显示的网页
		webview.loadUrl("file:///android_asset/page3/demo.html");
		//设置Web视图
		webview.setWebViewClient(new HelloWebViewClient ());
		Button goSecondActivityButton = (Button) findViewById(R.id.button1);
		Button goOneActivityButton = (Button) findViewById(R.id.button2);
		Button goThreeActivityButton = (Button) findViewById(R.id.button3);
		Button goFourActivityButton = (Button) findViewById(R.id.button4);
		Button gofiveActivityButton = (Button) findViewById(R.id.button5);
		goSecondActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(PersonInfoActivity.this, One1.class);

				//启动Intent
				startActivity(intent);
			}
		});
		goOneActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(PersonInfoActivity.this, Two1.class);

				//启动Intent
				startActivity(intent);
			}
		});
		goThreeActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(PersonInfoActivity.this, Three1.class);

				//启动Intent
				startActivity(intent);
			}
		});
		goFourActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(PersonInfoActivity.this, Four1.class);

				//启动Intent
				startActivity(intent);
			}
		});
		gofiveActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(PersonInfoActivity.this, Five1.class);

				//启动Intent
				startActivity(intent);
			}
		});
	}

	//Web视图
	private class HelloWebViewClient extends WebViewClient {
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;
		}
	}
}