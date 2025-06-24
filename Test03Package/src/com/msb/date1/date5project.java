package com.msb.date1;

//import sun.nio.cs.SingleByte;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @Author: Sy
 * @Date: 2025/6/22 - 06 - 22 - 21:21
 * @Description: com.msb.date1
 * @Version: 1.0
 */
public class date5project {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要查看的日期: YYYY-MM-DD");
		//String date = sc.nextLine();
		String date = "2001-2-26";
		System.out.println(date);
		//String -->Date
		java.sql.Date date1 = java.sql.Date.valueOf(date);
		//Date -->Calendar
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date1);
		//获取最大天数
		int max = calendar.getActualMaximum(Calendar.DATE);
		//获取今天日期
		int today = calendar.get(Calendar.DATE);
		System.out.println();
		//设置本月第一天
		calendar.set(Calendar.DATE,1);
		int firstday = (calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(firstday);
		System.out.println("日\t一\t二\t三\t四\t五\t六\t");

		for (int i = 1; i <= firstday-1 ; i++) {
			System.out.print("\t");
		}
		int count = firstday-1;

		for (int i = 1; i <= max ; i++) {
			if (i == today) {
				System.out.print(i+ "*\t");
			}else {
				System.out.print(i + "\t");
			}
			count++;
			if (count %7 ==0) {
				System.out.println();}
		}
	}
}
