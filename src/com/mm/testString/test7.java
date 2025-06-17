package com.mm.testString;

import java.util.ArrayList;

/**
 * @Author: Sy
 * @Date: 2025/6/17 - 06 - 17 - 13:56
 * @Description: com.mm.testString
 * @Version: 1.0
 */
public class test7 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		Person p1 = new Person("yoo",23,"西海岸",213.2,234);
		list.add(p1);
		//匿名对象
		list.add(new Person("sk"));
		for (Person p: list){
			System.out.println(p.getName()+"\t年龄: "+p.getAge()+"\t地址: "+p.getAddress()+"\t身高: "+p.getHeight()+"\t体重: "+p.getWeight());
		}
	}
}
