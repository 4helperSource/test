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

//老师详细页
public class TeacherListActivity extends Activity {
	ImageView list_imageview_fanhui;
	ImageView list_imageview_fenxiang;
	ImageView list_imageview_shoucang;
	TextView teacherlisthaoping;
	TextView teacherlistzhongping;
	TextView teacherlistchaping;
	Button list_button_yuyue;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teacherlist_main);
		list_imageview_fanhui = (ImageView) findViewById(R.id.list_imageview_fanhui);
		list_imageview_fanhui.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(TeacherListActivity.this, TeacherActivity.class);
				startActivity(intent);
			}
		});

		list_imageview_fenxiang = (ImageView) findViewById(R.id.list_imageview_fenxiang);
		list_imageview_fenxiang.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});
		list_imageview_shoucang = (ImageView) findViewById(R.id.list_imageview_shoucang);
		list_imageview_shoucang.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(TeacherListActivity.this, "收藏成功！",
						Toast.LENGTH_SHORT).show();

			}
		});
		teacherlisthaoping = (TextView) findViewById(R.id.teacherlisthaoping);
		teacherlistzhongping = (TextView) findViewById(R.id.teacherlistzhongping);
		teacherlistchaping = (TextView) findViewById(R.id.teacherlistchaping);
		list_button_yuyue = (Button) findViewById(R.id.list_button_yuyue);
		list_button_yuyue.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(TeacherListActivity.this, MyOrderActivity.class);
				startActivity(intent);
			}
		});

	}

}
