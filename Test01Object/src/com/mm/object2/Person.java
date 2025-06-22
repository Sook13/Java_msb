package com.mm.object2;

/**
 * @Author: Sy
 * @Date: 2025/6/11 - 06 - 11 - 20:21
 * @Description: com.mm.object
 * @Version: 1.0
 */
public class Person {
	//属性：
	String name;
	int age;
	double height;
	//空构造器
	public Person(){
	}
	public Person(String name,int age,double height){
		//当形参名字和属性名字重名的时候，会出现就近原则：
		//在要表示对象的属性前加上this.来修饰 ，因为this代表的就是你创建的那个对象
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public Person(String a,int b){
		name = a;
		age = b;
	}
	//方法：
	public void eat(){
		System.out.println("我喜欢吃饭");
	}
}
