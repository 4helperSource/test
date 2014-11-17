package com.wnt.cn.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.wnt.cn.R;
//老师评价列表页
public class TeacherEvaluationActivity extends Activity {
	ImageView teacherevaluation_imageview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teacherevaluation_main);
		teacherevaluation_imageview = (ImageView) findViewById(R.id.teacherevaluation_imageview);

		teacherevaluation_imageview
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent intent = new Intent();
						intent.setClass(TeacherEvaluationActivity.this,
								MyBankaccountActivity.class);
						startActivity(intent);
					}
				});
	}

	

}
