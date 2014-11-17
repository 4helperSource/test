package com.wnt.cn.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.wnt.cn.R;
//我的钱包页面
public class MyWalletActivity extends Activity {
	ImageView mywallet_imageview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mywallet_main);
		mywallet_imageview = (ImageView) findViewById(R.id.mywallet_imageview);

		mywallet_imageview
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent intent = new Intent();
						intent.setClass(MyWalletActivity.this,
								MyBankaccountActivity.class);
						startActivity(intent);
					}
				});
	}

	

}
