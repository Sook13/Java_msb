package com.msb.date1;

import sun.nio.cs.SingleByte;

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
		String date = sc.nextLine();
		System.out.println(date);
		//String -->Date
		java.sql.Date date1 = java.sql.Date.valueOf(date);
		//Date -->Calendar
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date1);
		int firstday = calendar.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(firstday);
		for (int i = 1; i <= firstday ; i++) {
			System.out.print("\t");
		}
		System.out.println();
		System.out.println("日\t一\t二\t三\t四\t五\t六\t");
		int max = calendar.getActualMaximum(Calendar.DATE);
		int count = firstday;
		int today = calendar.get(Calendar.DATE);
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
