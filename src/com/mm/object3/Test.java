package com.mm.object3;

import java.sql.SQLOutput;

/**
 * @Author: Sy
 * @Date: 2025/6/13 - 06 - 13 - 09:22
 * @Description: com.mm.object3
 * @Version: 1.0
 */
public class Test {
	public static void main(String[] args) {
		Person p = new Person(10,"msb");//确认this 指代的对象 当前正在构建的对象
		System.out.println(p);
		p.eat();
	}
}
