package com.wnt.cn.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.wnt.cn.R;

//ÎÒµÄµØÖ·
public class MyAddressActivity extends Activity {
	Button myaddress_button;
	ImageView myaddress_imageview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myaddress_main);
		myaddress_button = (Button) findViewById(R.id.myaddress_button);
		myaddress_button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MyAddressActivity.this,
						MyAddressListActivity.class);
				startActivity(intent);
			}
		});
		myaddress_imageview = (ImageView) findViewById(R.id.myaddress_imageview);
		myaddress_imageview.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MyAddressActivity.this, MyOrderActivity.class);
				startActivity(intent);
			}
		});
	}

}
