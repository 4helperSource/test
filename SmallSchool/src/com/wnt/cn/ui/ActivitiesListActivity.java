package com.wnt.cn.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.wnt.cn.R;

//活动详细页
public class ActivitiesListActivity extends Activity {
	TextView activiteslist_listview_huodong;
	ImageView activiteslist_imageview;
	Button activiteslist_button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activitieslist_main);
		activiteslist_button = (Button) findViewById(R.id.activiteslist_button);
		activiteslist_imageview = (ImageView) findViewById(R.id.activiteslist_imageview);

		activiteslist_imageview.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent();
				intent.setClass(ActivitiesListActivity.this,
						ActivitiesActivity.class);
				startActivity(intent);
			}
		});
		activiteslist_button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(ActivitiesListActivity.this, "您已经成功报名该活动！",
						Toast.LENGTH_SHORT).show();

			}
		});
	}

}
