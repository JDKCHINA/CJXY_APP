package cjxy.com.zs.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

import cjxy.com.zs.One;
import cjxy.com.zs.R;
import cjxy.com.zs.Second;

/**
 * @author yangyu
 *	����������������ҳActivityҳ��
 */
@SuppressWarnings("deprecation")
public class HomeActivity extends Activity {
	private WebView webview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_activity);
		webview = (WebView) findViewById(R.id.webView1);
		//设置WebView属性，能够执行Javascript脚本
		webview.getSettings().setJavaScriptEnabled(true);
		//加载需要显示的网页
		webview.loadUrl("file:///android_asset/dtt/page1.html");
		//设置Web视图
		webview.setWebViewClient(new HelloWebViewClient ());
		ImageButton goSecondActivityButton = (ImageButton) findViewById(R.id.imageButton3);
		ImageButton goOneActivityButton = (ImageButton) findViewById(R.id.imageButton1);
		ImageButton goThreeActivityButton = (ImageButton) findViewById(R.id.imageButton2);
		ImageButton goFourActivityButton = (ImageButton) findViewById(R.id.imageButton4);
		ImageButton gofiveActivityButton = (ImageButton) findViewById(R.id.imageButton5);
		ImageButton gosixActivityButton = (ImageButton) findViewById(R.id.imageButton6);
		ImageButton gosevenActivityButton = (ImageButton) findViewById(R.id.imageButton7);
		ImageButton goeightActivityButton = (ImageButton) findViewById(R.id.imageButton8);
		ImageButton gonineActivityButton = (ImageButton) findViewById(R.id.imageButton9);

		goSecondActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(HomeActivity.this, Second.class);

				//启动Intent
				startActivity(intent);
			}
		});
		goOneActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(HomeActivity.this, One.class);

				//启动Intent
				startActivity(intent);
			}
		});
		goThreeActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(HomeActivity.this, Three.class);

				//启动Intent
				startActivity(intent);
			}
		});
		goFourActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(HomeActivity.this, Four.class);

				//启动Intent
				startActivity(intent);
			}
		});
		gofiveActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(HomeActivity.this, Five.class);

				//启动Intent
				startActivity(intent);
			}
		});
		gosixActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(HomeActivity.this, Six.class);

				//启动Intent
				startActivity(intent);
			}
		});
		gosevenActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(HomeActivity.this, Seven.class);

				//启动Intent
				startActivity(intent);
			}
		});
		goeightActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(HomeActivity.this, DD8.class);

				//启动Intent
				startActivity(intent);
			}
		});
		gonineActivityButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//新建一个Intent(当前Activity, SecondActivity)=====显示Intent
				Intent intent = new Intent(HomeActivity.this, Nina.class);

				//启动Intent
				startActivity(intent);
			}
		});
	}

	private class HelloWebViewClient extends WebViewClient {
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;
		}
	}
	@Override
	protected void onResume() {
		super.onResume();
		webview.loadUrl("file:///android_asset/dtt/page1.html");
	}

	@Override
	protected void onPause() {
		super.onPause();
		webview.onPause();
	}
}