package com.wnt.cn.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.wnt.cn.R;

//����ҳ��
public class SearchActivity extends Activity {
	Spinner spinner;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search_main);
		final String[] CONSTELLATIONST = new String[] { "����","" };
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
