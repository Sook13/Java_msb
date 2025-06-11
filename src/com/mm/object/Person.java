package com.mm.object;

/**
 * @Author: Sy
 * @Date: 2025/6/10 - 06 - 10 - 17:39
 * @Description: com.mm.test03.object
 * @Version: 1.0
 */
public class Person {
	//名词---》属性---》成员变量---》放在类中方法外（注意：我们只把有需要的内容写到代码里，不相关的东西不要放在代码中）
	int age ;//年龄
	String name;//姓名
	double height;//身高
	double weight;//体重
	String hobby;//爱好
	String gender;//性别
	//动词---》方法
	//吃饭
	public void eat(){
		int num = 10;//局部变量：放在方法中 必须有初始值
		System.out.println("我喜欢吃饭");
	}
	//睡觉：
	public void sleep(String address){
		System.out.println("我在"+address+"睡觉");
	}
	//自我介绍：
	public String introduce(){
		return "我的名字是："+name+"，我的年龄是："+age+",我的身高是："+height+",我的体重是："+weight+",我的性别是: "+gender+",我的爱好是: "+hobby;
	}
}
