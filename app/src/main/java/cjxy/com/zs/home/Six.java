package cjxy.com.zs.home;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import cjxy.com.zs.MainActivity;
import cjxy.com.zs.R;


public class Six extends Activity {
    private WebView webview;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.six);
        Toast.makeText(Six.this, "如果你想退出，请点击多次！",Toast.LENGTH_SHORT).show();
        webview = (WebView) findViewById(R.id.webView3);
        //设置WebView属性，能够执行Javascript脚本
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setLoadWithOverviewMode(true);

        webview.getSettings().setBuiltInZoomControls(true);

        webview.getSettings().setSupportZoom(true);
        //加载需要显示的网页
        webview.loadUrl("http://ca.cjxy.edu.cn/zfca/login");
        //设置Web视图
        webview.setWebViewClient(new HelloWebViewClient ());
    }

    @Override
    //设置回退
    //覆盖Activity类的onKeyDown(int keyCoder,KeyEvent event)方法
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webview.canGoBack()) {
            webview.goBack();
            //goBack()表示返回WebView的上一页面
            return true;
        }
        else
        { Intent myIntent = new Intent();
            myIntent = new Intent(Six.this, MainActivity.class);
            startActivity(myIntent);
            super.finish();
        }
        return super.onKeyDown(keyCode, event);
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