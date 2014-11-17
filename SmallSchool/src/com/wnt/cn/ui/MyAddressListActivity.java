package com.wnt.cn.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.wnt.cn.R;

public class MyAddressListActivity extends Activity {
	Button myaddresslist_button;
	ImageView myaddresslist_imageview;
	TextView myaddresslist_textview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myaddresslist_main);
		myaddresslist_button = (Button) findViewById(R.id.myaddresslist_button);
		myaddresslist_button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		myaddresslist_imageview = (ImageView) findViewById(R.id.myaddresslist_imageview);
		myaddresslist_imageview.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		myaddresslist_textview = (TextView) findViewById(R.id.myaddresslist_textview);
		myaddresslist_textview.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MyAddressListActivity.this, MyAddressActivity.class);
				startActivity(intent);
			}
		});

	}
}
