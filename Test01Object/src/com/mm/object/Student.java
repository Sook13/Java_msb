package com.mm.object;

/**
 * @Author: Sy
 * @Date: 2025/6/11 - 06 - 11 - 17:28
 * @Description: com.mm.object
 * @Version: 1.0
 */
public class Student {
	byte e;
	short s;
	int c ;//成员变量：在类中方法外
	long num2;
	float f ;
	double d;
	char ch;
	boolean bo;
	String name;// 引用数据类型
	public void study(){
		int num = 10 ; //局部变量：在方法中
		System.out.println(num);//10
		//int num ;重复命名，出错了
		{
			int a;//局部变量   在代码块中
		}
		int a;
		if(1 == 3){
			int b;
		}
		System.out.println(c);
	}
	public void eat(){
		System.out.println(c);
	}
	//这是一个main方法，是程序的入口：
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.c);
		System.out.println(s.bo);
		System.out.println(s.ch);
		System.out.println(s.d);
		System.out.println(s.e);
		System.out.println(s.f);
		System.out.println(s.name);
		System.out.println(s.num2);
		System.out.println(s.s);
		s.d = 10.4;
	}
}
