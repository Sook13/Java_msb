package com.mm.while0;

import java.util.Scanner;

/**
 * @Author: Sy
 * @Date: 2025/6/5 - 06 - 05 - 22:30
 * @Description: com.mm.test02
 * @Version: 1.0
 */


public class switch_1 {
	public static void main(String[] args) {
		System.out.println("请输入你的数值:");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		// switch 匹配case后面的数值 执行相应分支
		switch (score % 10) {
			case 9:
				System.out.println("A");
				break;// 防止代码穿透
			case 8:
				System.out.println("B");
				break;// 防止代码穿透
			case 7:
				System.out.println("C");
				break;// 防止代码穿透
			case 6:
				System.out.println("D");
				break;// 防止代码穿透
			case 5:
				System.out.println("E");// 防止代码穿透
		}
	}
}
