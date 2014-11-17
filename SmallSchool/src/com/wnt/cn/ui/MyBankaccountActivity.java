package com.wnt.cn.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.wnt.cn.R;

//我的账号
public class MyBankaccountActivity extends Activity {
	ImageView mybankacccount_imageview_fanhuijiantou;
	ImageView mybankacccount_imageview_laoshipingjia;
	ImageView mybankacccount_imageview_mydingdan;
	ImageView mybankacccount_imageview_myshoucang;
	ImageView mybankacccount_imageview_myqianbao;
	ImageView mybankacccount_imageview_myxinxi;
	ImageView mybankacccount_imageview_queren;
	ImageView mybankacccount_imageview_myyuyue;
	ImageView mybankacccount_imageview_lianxifangshi;
	Button mybankacccountbutton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mybankaccount_main);
		mybankacccount_imageview_fanhuijiantou = (ImageView) findViewById(R.id.mybankacccount_imageview_fanhuijiantou);

		mybankacccount_imageview_fanhuijiantou
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent intent = new Intent();
						intent.setClass(MyBankaccountActivity.this,
								SchoolListActivity.class);
						startActivity(intent);
					}
				});
		mybankacccount_imageview_laoshipingjia = (ImageView) findViewById(R.id.mybankacccount_imageview_laoshipingjia);

		mybankacccount_imageview_laoshipingjia
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent intent = new Intent();
						intent.setClass(MyBankaccountActivity.this,
								TeacherEvaluationActivity.class);
						startActivity(intent);
					}
				});
		mybankacccount_imageview_mydingdan = (ImageView) findViewById(R.id.mybankacccount_imageview_mydingdan);

		mybankacccount_imageview_mydingdan
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent intent = new Intent();
						intent.setClass(MyBankaccountActivity.this,
								MyOrderListActivity.class);
						startActivity(intent);
					}
				});
		mybankacccount_imageview_myshoucang = (ImageView) findViewById(R.id.mybankacccount_imageview_myshoucang);

		mybankacccount_imageview_myshoucang
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent intent = new Intent();
						intent.setClass(MyBankaccountActivity.this,
								MyCollectionListActivity.class);
						startActivity(intent);
					}
				});
		mybankacccount_imageview_myqianbao = (ImageView) findViewById(R.id.mybankacccount_imageview_myqianbao);

		mybankacccount_imageview_myqianbao
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent intent = new Intent();
						intent.setClass(MyBankaccountActivity.this,
								MyWalletActivity.class);
						startActivity(intent);
					}
				});
		mybankacccount_imageview_myxinxi = (ImageView) findViewById(R.id.mybankacccount_imageview_myxinxi);

		mybankacccount_imageview_myxinxi
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent intent = new Intent();
						intent.setClass(MyBankaccountActivity.this,
								MyListActivity.class);
						startActivity(intent);
					}
				});
		mybankacccount_imageview_queren = (ImageView) findViewById(R.id.mybankacccount_imageview_queren);

		mybankacccount_imageview_queren
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent intent = new Intent();
						intent.setClass(MyBankaccountActivity.this,
								AuthenTicationActivity.class);
						startActivity(intent);
					}
				});
		mybankacccount_imageview_myyuyue = (ImageView) findViewById(R.id.mybankacccount_imageview_myyuyue);

		mybankacccount_imageview_myyuyue
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent intent = new Intent();
						intent.setClass(MyBankaccountActivity.this,
								MyReservationListActivity.class);
						startActivity(intent);
					}
				});
		mybankacccount_imageview_lianxifangshi = (ImageView) findViewById(R.id.mybankacccount_imageview_lianxifangshi);

		mybankacccount_imageview_lianxifangshi
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						Intent intent = new Intent();
						intent.setClass(MyBankaccountActivity.this,
								ContactWayActivity.class);
						startActivity(intent);
					}
				});
		mybankacccountbutton = (Button) findViewById(R.id.mybankacccountbutton);
		mybankacccountbutton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				new AlertDialog.Builder(MyBankaccountActivity.this)
						.setTitle("提示")
						.setMessage("您确定要注消吗?")
						.setPositiveButton("确定",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {

									}
								})
						.setNegativeButton("取消",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {

									}
								}).create().show();

			}
		});
	}

}
