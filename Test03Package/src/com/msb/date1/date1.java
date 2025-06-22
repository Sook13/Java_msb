package com.msb.date1;

import java.util.Date;

/**
 * @Author: Sy
 * @Date: 2025/6/22 - 06 - 22 - 20:14
 * @Description: com.msb.date1
 * @Version: 1.0
 */
public class date1 {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println(d.toGMTString());
		System.out.println(d.toLocaleString());
		System.out.println(d.getYear());//year - 1900
		System.out.println(d.getTime());
		System.out.println(System.currentTimeMillis());
	}
}
