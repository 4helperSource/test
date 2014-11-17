package com.wnt.cn.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.wnt.cn.R;
import com.wnt.cn.ui.LoginActivity;
import com.wnt.cn.ui.MyBankaccountActivity;
import com.wnt.cn.ui.SchoolListActivity;
import com.wnt.cn.ui.SearchActivity;
import com.wnt.cn.ui.TeacherActivity;

public abstract class AppActivity extends Activity {
	protected LinearLayout shouyetextview;
	protected LinearLayout paihangtextview;
	protected LinearLayout huodongtextview;
	protected LinearLayout zhanghaotextview;
	protected Spinner spinner;
	protected ImageView imagebutton;

	String tetlename;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.app_main);
		try {
			initView();
			setData();
			setListener();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initView() {
		try {
			shouyetextview = (LinearLayout) findViewById(R.id.shouyetextview);
			paihangtextview = (LinearLayout) findViewById(R.id.paihangtextview);
			huodongtextview = (LinearLayout) findViewById(R.id.huodongtextview);
			zhanghaotextview = (LinearLayout) findViewById(R.id.zhanghaotextview);
			spinner = (Spinner) findViewById(R.id.spinner);
			imagebutton = (ImageView) findViewById(R.id.imagebutton);

			tetlename = "";

			setButtonMenu();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void setData() {
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressLint("ClickableViewAccessibility")
	private void setListener() {
		try {
			imagebutton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					Intent intent = new Intent();
					intent.setClass(AppActivity.this, SearchActivity.class);
					startActivity(intent);
				}
			});
			if (isShowtoolbar()) {
				shouyetextview.setOnTouchListener(new OnTouchListener() {

					@SuppressLint("ClickableViewAccessibility")
					@Override
					public boolean onTouch(View v, MotionEvent event) {
						AppUtil.setButton_flag(1);
						Intent intent = new Intent(AppActivity.this,
								SchoolListActivity.class);
						startActivity(intent);
						return false;
					}
				});
				paihangtextview.setOnTouchListener(new OnTouchListener() {

					@SuppressLint("ClickableViewAccessibility")
					@Override
					public boolean onTouch(View v, MotionEvent event) {
						AppUtil.setButton_flag(2);
						Intent intent = new Intent(AppActivity.this,
								TeacherActivity.class);
						startActivity(intent);
						return false;
					}
				});
				huodongtextview.setOnTouchListener(new OnTouchListener() {

					@Override
					public boolean onTouch(View v, MotionEvent event) {
						AppUtil.setButton_flag(2);
						Intent intent = new Intent(AppActivity.this,
								TeacherActivity.class);
						startActivity(intent);
						return false;
					}
				});
				zhanghaotextview.setOnTouchListener(new OnTouchListener() {

					@Override
					public boolean onTouch(View v, MotionEvent event) {
						if (isLogin()) {
							AppUtil.setButton_flag(4);
							Intent intent = new Intent(AppActivity.this,
									MyBankaccountActivity.class);
							startActivity(intent);
						}
						return false;
					}
				});
			} else {
				View menuLinearLayout = findViewById(R.id.button_main_id);
				menuLinearLayout.setVisibility(View.GONE);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void setButtonMenu() {
		try {
			shouyetextview.setBackgroundDrawable(getResources().getDrawable(
					R.drawable.liebiao1));
			paihangtextview.setBackgroundDrawable(getResources().getDrawable(
					R.drawable.liebiao1));
			huodongtextview.setBackgroundDrawable(getResources().getDrawable(
					R.drawable.liebiao1));
			zhanghaotextview.setBackgroundDrawable(getResources().getDrawable(
					R.drawable.liebiao1));
			zhanghaotextview.setBackgroundDrawable(getResources().getDrawable(
					R.drawable.liebiao1));
			switch (AppUtil.getButton_flag()) {
			case 1:
				shouyetextview.setBackgroundDrawable(getResources()
						.getDrawable(R.drawable.liebiao));
				break;
			case 2:
				paihangtextview.setBackgroundDrawable(getResources()
						.getDrawable(R.drawable.liebiao));
				break;
			case 3:
				huodongtextview.setBackgroundDrawable(getResources()
						.getDrawable(R.drawable.liebiao));
				break;
			case 4:
				zhanghaotextview.setBackgroundDrawable(getResources()
						.getDrawable(R.drawable.liebiao));
				break;
			}
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
	}

	protected void setTitleName(String title) {
		try {
			this.tetlename = title;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void addContentView(View view) {
		try {
			LinearLayout addlayout = (LinearLayout) findViewById(R.id.app_Layout);
			addlayout.addView(view);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// protected abstract boolean isShowToolBar();
	protected abstract boolean isShowtoolbar();

	protected boolean isLogin() {
		boolean result = false;
		try {
			SharedPreferences sp = getSharedPreferences("mbni_login",
					MODE_PRIVATE);
			String userName = sp.getString("username", "");
			if (userName.equals("")) {
				new AlertDialog.Builder(AppActivity.this)
						.setTitle("提示")
						.setMessage("请先登录")
						.setPositiveButton("确定",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										Intent it = new Intent(
												AppActivity.this,
												LoginActivity.class);
										startActivity(it);
										AppActivity.this.finish();

									}
								})
						.setNegativeButton("关闭",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
									}
								}).create().show();
				result = false;
			} else {
				result = true;
			}
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}
}
