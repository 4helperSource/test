package com.wnt.cn.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.wnt.cn.R;
//�ҵ�ԤԼҳ
public class MyReservationListActivity extends Activity {
	ImageView myreservationlist_imageview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myreservationlist_main);
		myreservationlist_imageview = (ImageView) findViewById(R.id.myreservationlist_imageview);

		myreservationlist_imageview
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent intent = new Intent();
						intent.setClass(MyReservationListActivity.this,
								MyBankaccountActivity.class);
						startActivity(intent);
					}
				});
	}

	

}
