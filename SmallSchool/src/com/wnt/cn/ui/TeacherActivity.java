package com.wnt.cn.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import com.wnt.cn.R;
import com.wnt.cn.util.AppActivity;

public class TeacherActivity extends AppActivity {
	TextView teacherlistview;
	Spinner dengjispinner;
	Spinner kemuspinner;
	Spinner xingbiespinner;
	Spinner jiagespinner;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		try {
			initView();
			setData();
			setListener();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressLint("InflateParams")
	private void initView() {
		try {
			View view = LayoutInflater.from(this).inflate(
					R.layout.teacher_main, null);
			addContentView(view);

			kemuspinner = (Spinner) view.findViewById(R.id.kemuspinner);
			xingbiespinner = (Spinner) view.findViewById(R.id.xingbiespinner);
			jiagespinner = (Spinner) view.findViewById(R.id.jiagespinner);
			dengjispinner = (Spinner) view.findViewById(R.id.dengjispinner);
			teacherlistview = (TextView) view
					.findViewById(R.id.teacherlistview);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void setData() {
		try {
			final String[] CONSTELLATIONST = new String[] { "地图" };

			ArrayAdapter<String> adapterT = new ArrayAdapter<String>(this,
					android.R.layout.simple_spinner_item, CONSTELLATIONST);
			adapterT.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinner.setAdapter(adapterT);

			final String[] CONSTELLATIONSD = new String[] { "等级", "从高到低",
					"从低到高" };

			ArrayAdapter<String> adapterD = new ArrayAdapter<String>(this,
					android.R.layout.simple_spinner_item, CONSTELLATIONSD);
			adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			dengjispinner.setAdapter(adapterD);

			final String[] CONSTELLATIONSK = new String[] { "科目", "语文", "数学",
					"英语", "物理", "化学", "艺术", "其他学科" };

			ArrayAdapter<String> adapterK = new ArrayAdapter<String>(this,
					android.R.layout.simple_spinner_item, CONSTELLATIONSK);
			adapterK.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			kemuspinner.setAdapter(adapterK);

			final String[] CONSTELLATIONS2 = new String[] { "性别", "男", "女",
					"不限" };

			ArrayAdapter<String> adapterX = new ArrayAdapter<String>(this,
					android.R.layout.simple_spinner_item, CONSTELLATIONS2);
			adapterX.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			xingbiespinner.setAdapter(adapterX);

			final String[] CONSTELLATIONSJ = new String[] { "价格", "从高到低",
					"从低到高" };

			ArrayAdapter<String> adapterJ = new ArrayAdapter<String>(this,
					android.R.layout.simple_spinner_item, CONSTELLATIONSJ);
			adapterJ.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			jiagespinner.setAdapter(adapterJ);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void setListener() {
		try {
			kemuspinner.setOnItemSelectedListener(new OnItemSelectedListener() {
				public void onItemSelected(AdapterView<?> parent, View view,
						int position, long id) {

				}

				public void onNothingSelected(AdapterView<?> parent) {

				}
			});
			dengjispinner
					.setOnItemSelectedListener(new OnItemSelectedListener() {
						public void onItemSelected(AdapterView<?> parent,
								View view, int position, long id) {

						}

						public void onNothingSelected(AdapterView<?> parent) {

						}
					});
			jiagespinner
					.setOnItemSelectedListener(new OnItemSelectedListener() {
						public void onItemSelected(AdapterView<?> parent,
								View view, int position, long id) {

						}

						public void onNothingSelected(AdapterView<?> parent) {

						}
					});
			xingbiespinner
					.setOnItemSelectedListener(new OnItemSelectedListener() {
						public void onItemSelected(AdapterView<?> parent,
								View view, int position, long id) {

						}

						public void onNothingSelected(AdapterView<?> parent) {

						}
					});
			teacherlistview.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					Intent intent = new Intent();
					intent.setClass(TeacherActivity.this,
							TeacherListActivity.class);
					startActivity(intent);

				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected boolean isShowtoolbar() {
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}