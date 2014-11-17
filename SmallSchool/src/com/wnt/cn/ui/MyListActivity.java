package com.wnt.cn.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.wnt.cn.R;
//ÎÒµÄÏêÏ¸Ò³Ãæ
public class MyListActivity extends Activity {
	ImageView mylist_imageview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mylist_main);
		mylist_imageview = (ImageView) findViewById(R.id.mylist_imageview);

		mylist_imageview
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent intent = new Intent();
						intent.setClass(MyListActivity.this,
								MyBankaccountActivity.class);
						startActivity(intent);
					}
				});
	}

	

}
