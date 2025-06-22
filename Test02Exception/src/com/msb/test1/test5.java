package com.msb.test1;

import java.util.Scanner;

/**
 * @Author: Sy
 * @Date: 2025/6/19 - 06 - 19 - 15:20
 * @Description: com.msb.test
 * @Version: 1.0
 */
public class test5 {
	public static void main(String[] args) {
		devide();
	}
	public static void devide() {
		//键入两个数字: 求商
		System.out.println("请录入第一个数: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("请录入第二个数: ");
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		if (b == 0){
			throw new RuntimeException();
		}
		System.out.println("两数之商为: " + a / b);}
}