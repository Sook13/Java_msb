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
		list.add(new Person("sk",23,"西海岸",213.2,234));
		for (Person p: list){
			System.out.println(p.getName()+"\t年龄:\t"+p.getAge()+"\t地址:\t"+p.getAddress()+"\t身高:\t"+p.getHeight()+"\t体重:\t"+p.getWeight());
		}
	}
}
