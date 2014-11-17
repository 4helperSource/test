package com.wnt.cn.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.wnt.cn.R;

//认证信息页面
public class AuthenTicationActivity extends Activity {
	ImageView authentication_imageview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.authentication_main);
		authentication_imageview = (ImageView) findViewById(R.id.authentication_imageview);

		authentication_imageview.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent();
				intent.setClass(AuthenTicationActivity.this,
						MyBankaccountActivity.class);
				startActivity(intent);
			}
		});
	}

}
