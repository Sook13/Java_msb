package com.mm.object3;

/**
 * @Author: Sy
 * @Date: 2025/6/13 - 06 - 13 - 09:20
 * @Description: com.mm.object3
 * @Version: 1.0
 */
public class Person {
	int age;
	String name;
	public Person(int a, String b) {
		System.out.println(this); //确认this 指代的对象 当前正在构建的对象
		age = a;
		name = b;
	}
	public void eat() {
		System.out.println(this); //确认this 指代的对象 当前正在构建的对象
		System.out.println("I have lunch.");}
}
