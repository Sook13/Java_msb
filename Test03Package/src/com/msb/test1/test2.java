package com.msb.test1;

/**
 * @Author: Sy
 * @Date: 2025/6/19 - 06 - 19 - 17:25
 * @Description: com.msb.test1
 * @Version: 1.0
 */
public class test2 {
	public static void main(String[] args) {
		//自动装箱: int -->Integer
		Integer i1 = 12;
		System.out.println(i1);
		//自动拆箱: Integer --> int
		Integer i2 = new Integer(12);
		int num1 = i2;
		System.out.println(num1);
		Integer i3 = new Integer("12");
		int num2 = i3;
		System.out.println(num2);
	}
}
