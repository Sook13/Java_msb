package com.msb.test1;

import java.util.Scanner;
/*
* 基于if-else处理异常Exception*/
/**
 * @Author: Sy
 * @Date: 2025/6/19 - 06 - 19 - 11:32
 * @Description: com.msb.test1
 * @Version: 1.0
 */
public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入第一个数：");
		if (sc.hasNextInt()) {
			int num1 = sc.nextInt();
			System.out.println("请录入第二个数：");
			if (sc.hasNextInt()) {
				int num2 = sc.nextInt();
				if (num2 == 0) {
					System.out.println("对不起，除数不能为0");
				} else {
					System.out.println("商：" + num1 / num2);
				}
			} else{
				System.out.println("对不起,输入的数字不为int");
			}
		}
	}
}