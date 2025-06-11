package com.mm.object2;

/**
 * @Author: Sy
 * @Date: 2025/6/11 - 06 - 11 - 23:08
 * @Description: com.mm.object2
 * @Version: 1.0
 */
public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		p.name  = "Lily";
		p.age = 18;
		Person p2 = new Person("Wang", 18);
		Person p3 = new Person("Lucy",22,182.2);
	}
}

