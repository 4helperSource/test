package com.wnt.cn.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.wnt.cn.R;
//»î¶¯Ò³Ãæ
public class ActivitiesActivity extends Activity {
	TextView activites_listview_huodong;
	ImageView activites_imageview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activities_main);
		activites_listview_huodong = (TextView) findViewById(R.id.activites_listview_huodong);
		activites_imageview = (ImageView) findViewById(R.id.activites_imageview);

		activites_listview_huodong.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent();
				intent.setClass(ActivitiesActivity.this, ActivitiesListActivity.class);
				startActivity(intent);
			}
		});
		activites_imageview.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent();
				intent.setClass(ActivitiesActivity.this, SchoolListActivity.class);
				startActivity(intent);
			}
		});
	}

	
}
