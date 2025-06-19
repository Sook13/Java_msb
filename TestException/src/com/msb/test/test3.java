package com.msb.test;

import java.util.Scanner;
//测试异常

/**
 * @Author: Sy
 * @Date: 2025/6/19 - 06 - 19 - 11:11
 * @Description: com.msb.test1
 * @Version: 1.0
 */
public class test3 {
	public static void main(String[] args) {
		try {
			//键入两个数字: 求商
			System.out.println("请录入第一个数: ");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			System.out.println("请录入第二个数: ");
			Scanner sc1 = new Scanner(System.in);
			int b = sc1.nextInt();
			System.out.println("两数之商为: "+a/b);
		} catch (Exception e) {
			System.out.println("出错");
		}
		System.out.println();
		System.out.println("请重新运行!");
	}
}
//把可能出现异常的代码放入try代码块中，然后将异常封装为对象，被catch后面的()中的那个异常对象接收，
// 接收以后：执行catch后面的{}里面的代码，然后try-catch后面的代码，该怎么执行就怎么执行。
