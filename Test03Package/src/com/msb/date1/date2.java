package com.msb.date1;

import java.sql.Date;

/**
 * @Author: Sy
 * @Date: 2025/6/22 - 06 - 22 - 20:34
 * @Description: com.msb.date1
 * @Version: 1.0
 */
public class date2 {
	public static void main(String[] args) {
	// java.sql.Date 年月日
		Date date = new Date(1750595504408L);
		System.out.println(date);
		//public class Date extends java.util.Date 继承自util.Date
		//转型 util-->sql
		java.util.Date date2 = new Date(1750595504408L);
		Date date3 = (Date) date;
		//sql -->util
		java.util.Date date4 = date;
		//String-->sql
		Date date5 = Date.valueOf("2043-06-22");
		System.out.println(date5);
	}
}
