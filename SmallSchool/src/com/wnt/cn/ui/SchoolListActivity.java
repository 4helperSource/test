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

import com.wnt.cn.R;
import com.wnt.cn.util.AppActivity;

//首页（学校详细页）
public class SchoolListActivity extends AppActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
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
			View view = LayoutInflater.from(this).inflate(R.layout.school_main,
					null);
			addContentView(view);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void setData() {
		try {
			final String[] CONSTELLATIONS = new String[] { "北京", "夹皮沟", "云南",
					"刀哥" };

			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
					android.R.layout.simple_spinner_item, CONSTELLATIONS);
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			// 这是设置点击后弹出的样式
			spinner.setAdapter(adapter);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void setListener() {
		try {
			spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
				public void onItemSelected(AdapterView<?> parent, View view,
						int position, long id) {
					// txt2.setText(adapter.getItem(position).toString());
				}

				public void onNothingSelected(AdapterView<?> parent) {

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
