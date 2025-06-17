package com.mm.testString;

import java.util.ArrayList;

/**
 * @Author: Sy
 * @Date: 2025/6/17 - 06 - 17 - 13:29
 * @Description: com.mm.testString
 * @Version: 1.0
 */
public class test6 {
	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();//泛型提高java的类型安全
	//add
	list.add("烧烤00");
	list.add("失望00");
	list.add("思考00");
//	list.add(true);
	for (int i = 0; i < list.size(); i++) {
	System.out.println(list.get(i));
		}
	System.out.println("==============");

	for (String s : list) {
	System.out.println(s);
		}

	}
}
