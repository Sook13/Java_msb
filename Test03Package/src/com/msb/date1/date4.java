package com.msb.date1;

import sun.util.resources.cldr.nn.CalendarData_nn_NO;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Author: Sy
 * @Date: 2025/6/22 - 06 - 22 - 21:12
 * @Description: com.msb.date1
 * @Version: 1.0
 */
public class date4 {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		Calendar cal2 = Calendar.getInstance();
		cal.set(Calendar.MONTH,6);
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.getActualMaximum(Calendar.DATE));
	}
}
