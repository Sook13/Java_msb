package com.mm.object;

/**
 * @Author: Sy
 * @Date: 2025/6/11 - 06 - 11 - 15:03
 * @Description: com.mm.object
 * @Version: 1.0
 */

public class ikun {
	public static void main(String[] args) {
	Person kunkun = new Person();
	//名词--》静态特性--》属性
	kunkun.name = "蔡徐坤";
	kunkun.age = 27;
	kunkun.height = 183.3;//cm
	kunkun.weight = 60.0;//kg
	kunkun.gender = "man";//一个真正的鳗
	kunkun.hobby =  "music";//唱跳rap篮球
	//动词--》动态特性--》方法
	kunkun.eat();
	kunkun.sleep("家里");
	}
}