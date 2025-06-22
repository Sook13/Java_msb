package com.msb.test1;

import java.util.Scanner;
//测试异常
/**
 * @Author: Sy
 * @Date: 2025/6/19 - 06 - 19 - 11:11
 * @Description: com.msb.test1
 * @Version: 1.0
 */
public class test1 {
	public static void main(String[] args) {
		//键入两个数字: 求商
		System.out.println("请录入第一个数: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("请录入第二个数: ");
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		System.out.println("两数之商为: "+a/b);
	}
}
