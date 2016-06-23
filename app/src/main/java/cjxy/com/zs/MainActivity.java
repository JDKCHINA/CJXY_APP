package cjxy.com.zs;

import android.app.AlertDialog;
import android.app.TabActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.TabHost;

import cjxy.com.zs.home.HomeActivity;


/**
 * @author yangyu
 *	������������Activity���������
 */
public class MainActivity extends TabActivity implements OnCheckedChangeListener {
	//����Tabѡ���ʾ��
	private static final String HOME_TAB = "home_tab";
	private static final String MENTION_TAB = "mention_tab";
	private static final String PERSON_TAB = "person_tab";
	private static final String MORE_TAB = "more_tab";

	//����Intent����
	private Intent mHomeIntent,mMentionIntent,mPersonIntent,mMoreIntent;

	//����TabHost����
	private TabHost mTabHost;

	//���嵥ѡ��ť����
	private RadioButton homeRb,mentionRb,personRb,moreRb;
	
	//������Ϣ��ʾ�ı�����
private Intent intent;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		initView();
		initData();
	}
	
	/**
	 * ��ʼ�����
	 */
	private void initView(){
		//�õ�TabHost
		mTabHost = getTabHost();
		
		//�õ�Intent����
		mHomeIntent = new Intent(this, HomeActivity.class);
		mMentionIntent = new Intent(this, MentionActivity.class);
		mPersonIntent = new Intent(this, PersonInfoActivity.class);
		mMoreIntent = new Intent(this, MoreActivity.class);

		//�õ���Ϣ��ʾ�ı�����

		
		//�õ���ѡ��ť����
		homeRb = ((RadioButton) findViewById(R.id.radio_home));
		mentionRb = ((RadioButton) findViewById(R.id.radio_mention));
		personRb = ((RadioButton) findViewById(R.id.radio_person_info));
		moreRb = ((RadioButton) findViewById(R.id.radio_more));
	}
	
	/**
	 * ��ʼ������
	 */
	private void initData(){
		//����ѡ��ť���ü���
		homeRb.setOnCheckedChangeListener(this);
		mentionRb.setOnCheckedChangeListener(this);
		personRb.setOnCheckedChangeListener(this);
		moreRb.setOnCheckedChangeListener(this);
		
		//����Ϣ��ʾ�ı���������

		//��ӽ�Tabѡ�
		mTabHost.addTab(buildTabSpec(HOME_TAB, mHomeIntent));
		mTabHost.addTab(buildTabSpec(MENTION_TAB, mMentionIntent));
		mTabHost.addTab(buildTabSpec(PERSON_TAB, mPersonIntent));
		mTabHost.addTab(buildTabSpec(MORE_TAB, mMoreIntent));

		//���õ�ǰĬ�ϵ�Tabѡ�ҳ��
		if(getIntent().getExtras()!=null){
			intent=getIntent();
			if(intent.getExtras().getInt("name")==50){
				personRb.setChecked(true);
				mTabHost.setCurrentTabByTag(PERSON_TAB);
			}
			if(intent.getExtras().getInt("name")==60){
				moreRb.setChecked(true);
				mTabHost.setCurrentTabByTag(MORE_TAB);
			}
		}else {
			homeRb.setChecked(true);
			mTabHost.setCurrentTabByTag(HOME_TAB);
		}

	}						

	private TabHost.TabSpec buildTabSpec(String tag, Intent intent) {
		TabHost.TabSpec tabSpec = mTabHost.newTabSpec(tag);
		tabSpec.setContent(intent).setIndicator("");
		
		return tabSpec;
	}

	/**
	 * Tab��ťѡ�м����¼�
	 */
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if (isChecked) {
			switch (buttonView.getId()) {
			case R.id.radio_home:
				mTabHost.setCurrentTabByTag(HOME_TAB);
				break;
			case R.id.radio_mention:
				mTabHost.setCurrentTabByTag(MENTION_TAB);
				//VISIBLE:0  ��˼�ǿɼ���;INVISIBILITY:4 ��˼�ǲ��ɼ��ģ�����ռ��ԭ���Ŀռ�;GONE:8  ��˼�ǲ��ɼ��ģ���ռ��ԭ���Ĳ��ֿռ�
				break;
			case R.id.radio_person_info:
				mTabHost.setCurrentTabByTag(PERSON_TAB);
				break;
			case R.id.radio_more:
				mTabHost.setCurrentTabByTag(MORE_TAB);
				break;
			default:
				break;
			}
		}
	}

	@Override
	public boolean dispatchKeyEvent(KeyEvent event) {
		if ((event.getAction() == KeyEvent.ACTION_DOWN) && (event.getKeyCode() == KeyEvent.KEYCODE_BACK)) {
			quitDialog();
		}
		return super.dispatchKeyEvent(event);
	}
	/**
	 * �˳��Ի���
	 */
	private void quitDialog() {
		new AlertDialog.Builder(this)
				.setTitle(R.string.alerm_title)
				.setIcon(null)
				.setCancelable(false)
				.setMessage(R.string.alert_quit_confirm)
				.setPositiveButton(R.string.alert_yes_button,
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,int which) {
								MainActivity.this.finish();
							}
						})
				.setNegativeButton(R.string.alert_no_button,
						new DialogInterface.OnClickListener() {

							public void onClick(DialogInterface dialog,
									int which) {
								dialog.dismiss();
							}
						}).create().show();
	}


}
