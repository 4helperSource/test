package com.wnt.cn.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.wnt.cn.R;
//×¢²áÒ³Ãæ
public class RegistrationActivity extends Activity {
	/** Called when the activity is first created. */
	Spinner spinner;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.registration_main);
		final String[] CONSTELLATIONST = new String[] { "±±¾©","" };
		spinner = (Spinner) findViewById(R.id.spinner);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, CONSTELLATIONST);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {

			}
			public void onNothingSelected(AdapterView<?> parent) {

			}
			
		});

	}
//	@Override
//	protected boolean isShowtoolbar() {
//		// TODO Auto-generated method stub
//		return false;
//	}
}