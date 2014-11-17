package com.wnt.cn.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.wnt.cn.R;
//Á¢¼´Ô¤Ô¼Ò³
public class MyReservationActivity extends Activity {
	ImageView myreservation_imageview;
	Button myreservation_button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myreservation_main);
		myreservation_imageview = (ImageView) findViewById(R.id.myreservation_imageview);
		myreservation_imageview.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MyReservationActivity.this, TeacherListActivity.class);
				startActivity(intent);
			}
		});
		myreservation_button = (Button) findViewById(R.id.myreservation_button);
		myreservation_button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MyReservationActivity.this, TeacherListActivity.class);
				startActivity(intent);
			}
		});
	}

	

}
