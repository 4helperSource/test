package com.wnt.cn.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.wnt.cn.R;
//联系方式页面
public class ContactWayActivity extends Activity {
	ImageView contactway_imageview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contactway_main);
		contactway_imageview = (ImageView) findViewById(R.id.contactway_imageview);

		contactway_imageview
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent intent = new Intent();
						intent.setClass(ContactWayActivity.this,
								MyBankaccountActivity.class);
						startActivity(intent);
					}
				});
	}

	

}
