package com.wnt.cn.util;

import android.content.Context;
import android.content.SharedPreferences;

public class AppUtil {

	private static int button_flag = 1;

	public static int getButton_flag() {
		return button_flag;
	}

	public static void setButton_flag(int button_flag) {
		AppUtil.button_flag = button_flag;
	}

	public static String Sp_userName(Context context) {
		SharedPreferences sp = context.getSharedPreferences("mbni_login",
				Context.MODE_PRIVATE);
		String loginUserName = sp.getString("username", "");
		return loginUserName;

	}

	/*
	 * public static String timeToFormatTime(String time) {
	 * 
	 * String year = time.substring(0, 4); String mouth = time.substring(4, 6);
	 * String day = time.substring(6, 8); String hour = time.substring(8, 10);
	 * String minite = time.substring(10, 12); String second =
	 * time.substring(12, 14); String newtime = year + "-" + mouth + "-" + day +
	 * "-" + hour + "-" + minite + "-" + second; return newtime;
	 * 
	 * }
	 * 
	 * public static String Sp_userName(Context context) { SharedPreferences sp
	 * = context.getSharedPreferences("mbni_login", context.MODE_PRIVATE);
	 * String loginUserName = sp.getString("username", ""); return
	 * loginUserName;
	 * 
	 * }
	 * 
	 * 
	 * public static String Sp_userId(Context context) { SharedPreferences sp =
	 * context.getSharedPreferences("mbni_login", context.MODE_PRIVATE); String
	 * loginUserId = sp.getString("userId", ""); return loginUserId; }
	 */
}
