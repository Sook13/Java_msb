package com.msb.test;

/**
 * @Author: Sy
 * @Date: 2025/6/19 - 06 - 19 - 14:58
 * @Description: com.msb.test
 * @Version: 1.0
 */
public class test4 {
	public static void main(String[] args) {
		int[] arr ={1,2,3};
		System.out.println(arr.length);
		// 数组越界异常 ArrayIndexOutOfBoundsException
		System.out.println(arr[10]);
		int[] arr2 =null;
		// 空指针异常 NullPointerException
		System.out.println(arr2.length);
	}
}
