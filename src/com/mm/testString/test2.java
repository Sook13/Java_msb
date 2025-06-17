package com.mm.testString;

import java.util.Arrays;

/**
 * @Author: Sy
 * @Date: 2025/6/16 - 06 - 16 - 21:51
 * @Description: com.mm.testString
 * @Version: 1.0
 */
public class test2 {
	public static void main(String[] args) {
	String s1 = "23jfsss";
	//length
	System.out.println(s1.length());
	//is empty
	String s2 = "";
	System.out.println(s2.isEmpty());
	//charAt
	System.out.println(s1.charAt(0));
	//equals
	String s3 = "";
	System.out.println(s3.equals(s2));
	//compareTo
	String s4 = "sadgbc";
	String s5 = "sadgbj";
	System.out.println(s4.compareTo(s5));
	System.out.println("***");//返回ASCII差值或者长度差值
	//substring
	String s6 = "hello,my new world.";
	System.out.println(s6.substring(2));
	System.out.println(s6.substring(2,5));
	//toUpperCase
	String s7 = "three pigs ";
	System.out.println(s7.toUpperCase());
	//toLowerCase
	String s8 = "APPLE EATEN BY BIRDS";
	System.out.println(s8.toLowerCase());
	//trim 去除首尾的空格
	String s9 = "  pink-dog-is-a-dog red dog  ";
	System.out.println(s9.trim());
	//split ->String[]
	String[] strArr = s9.split("-");
	System.out.println(Arrays.toString(strArr));
	//valueOf int -> Str
	System.out.println(String.valueOf(226));
	}
}
