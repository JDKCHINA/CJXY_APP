package cjxy.com.zs;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import cjxy.com.zs.xq.Dxq;
import cjxy.com.zs.xq.Lxq;
import cjxy.com.zs.xq.Xxq;

public class MentionActivity extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mention_activity);

		TabHost tabHost=getTabHost();
		// no need to call TabHost.Setup()

		//First Tab
		TabHost.TabSpec spec1=tabHost.newTabSpec("Tab 1");
		spec1.setIndicator("Tab 1",getResources().getDrawable(R.drawable.arrow));
		Intent in1=new Intent(this, Lxq.class);
		spec1.setContent(in1);

		TabHost.TabSpec spec2=tabHost.newTabSpec("Tab 2");
		spec2.setIndicator("Tab 2",getResources().getDrawable(R.drawable.arrow));
		Intent in2=new Intent(this,Dxq.class);
		spec2.setContent(in2);

		TabHost.TabSpec spec3=tabHost.newTabSpec("Tab 3");
		spec3.setIndicator("Tab 3",getResources().getDrawable(R.drawable.arrow));
		Intent in3=new Intent(this,Xxq.class);
		spec3.setContent(in3);

		tabHost.addTab(spec1);
		tabHost.addTab(spec2);
		tabHost.addTab(spec3);
	}
}