package com.wnt.cn.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.wnt.cn.R;
//Œ“µƒ ’≤ÿœÍœ∏“≥
public class MyCollectionListActivity extends Activity {
	ImageView mycollectionlist_imageview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mycollectionlist_main);
		mycollectionlist_imageview = (ImageView) findViewById(R.id.mycollectionlist_imageview);

		mycollectionlist_imageview
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent intent = new Intent();
						intent.setClass(MyCollectionListActivity.this,
								MyBankaccountActivity.class);
						startActivity(intent);
					}
				});	
	}



}
