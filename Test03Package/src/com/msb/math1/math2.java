package com.msb.math1;

import java.util.Random;

/**
 * @Author: Sy
 * @Date: 2025/6/24 - 06 - 24 - 17:46
 * @Description: com.msb.math1
 * @Version: 1.0
 */
public class math2 {
	public static void main(String[] args) {
		Random r1 = new Random(System.currentTimeMillis());//当前时间-1990
		int a = r1.nextInt(10);
		System.out.println(a);
		//空参构造器 实际上还是调用的带参构造器
		Random r2 = new Random();
		int b = r2.nextInt(10);
		System.out.println(b);
		double c = r2.nextDouble();
		System.out.println(c);

	}
}
