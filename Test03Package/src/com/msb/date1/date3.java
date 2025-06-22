package com.msb.date1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: Sy
 * @Date: 2025/6/22 - 06 - 22 - 20:50
 * @Description: com.msb.date1
 * @Version: 1.0
 */
public class date3 {
	public static void main(String[] args) {/*
		//日期控件
		//[1]String -->java.sql.Date
		java.sql.Date date1 = java.sql.Date.valueOf("2018/03/15");
		java.util.Date date2 = date1;
		System.out.println(date2.toString());
		字符串格式有误,只能为 - -*/
		//[2]DateFormat 抽象类
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			System.out.println(df.parse("2018-03-15 12:32:22"));
		}catch (ParseException e) {
			e.printStackTrace();
		}
		//[3] Date -->String
		try {
			Date date = df.parse("2018-03-15 12:32:22");
			String datestr = df.format(date);
			System.out.println(datestr);
		} catch (ParseException e1) {
			throw new RuntimeException(e1);
		}
	}
}
