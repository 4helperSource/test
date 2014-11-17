package com.wnt.cn.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.wnt.cn.R;

//¶©µ¥Ò³ÃæÏêÏ¸Ò³
public class MyOrderListActivity extends Activity {
	ImageView myorderlist_imageview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myorderlist_main);
		myorderlist_imageview = (ImageView) findViewById(R.id.myorderlist_imageview);

		myorderlist_imageview.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent();
				intent.setClass(MyOrderListActivity.this,
						MyBankaccountActivity.class);
				startActivity(intent);
			}
		});
	}

}
