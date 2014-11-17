package com.wnt.cn.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;

import com.wnt.cn.R;
//登陆页面
public class LoginActivity extends Activity {
	Spinner spinner;
	TextView logintextview;
	Button loginbutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_main);
		logintextview = (TextView) findViewById(R.id.logintextview);
		logintextview.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(LoginActivity.this, RegistrationActivity.class);
				startActivity(intent);

			}
		});
		loginbutton = (Button) findViewById(R.id.loginbutton);
		loginbutton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(LoginActivity.this, MyBankaccountActivity.class);
				startActivity(intent);

			}
		});
		final String[] CONSTELLATIONS = new String[] { "北京", "" };
		spinner = (Spinner) findViewById(R.id.spinner);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, CONSTELLATIONS);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// 这是设置点击后弹出的样式
		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// txt2.setText(adapter.getItem(position).toString());
			}

			public void onNothingSelected(AdapterView<?> parent) {

			}
		});
		
	}



}
