package com.mm.testString;

import java.util.ArrayList;

/**
 * @Author: Sy
 * @Date: 2025/6/17 - 06 - 17 - 13:29
 * @Description: com.mm.testString
 * @Version: 1.0
 */
public class test4 {
	public static void main(String[] args) {
	ArrayList list = new ArrayList();
	//add
	list.add("烧烤00");
	list.add("烧烤00");
	list.add("烧烤00");
	list.add("烧烤00");
	list.add("烧烤00");
	//增加指定位置
	list.add(0,"我要吃");
	//remove
	list.remove("烧烤00");
	list.remove(0);
	//set
	list.set(0,"ccb0");
	//get
	System.out.println(list.get(0));
	System.out.println(list);
	}
}
