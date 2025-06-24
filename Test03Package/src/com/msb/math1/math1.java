package com.msb.math1;
import static java.lang.Math.*;
/**
 * @Author: Sy
 * @Date: 2025/6/24 - 06 - 24 - 17:15
 * @Description: com.msb.math1
 * @Version: 1.0
 */
 //[1]java.lang 无需导包
 //[2]final修饰类 不能继承
 //[3]构造器私有化
 //[4]都被static修饰 可以直接用
 //[5]静默导入
public class math1 {
	public static void main(String[] args) {
		//random
		System.out.println("零到壹的随机数: "+ Math.random());//[0.0,1.0)
		//abs
		System.out.println("绝对值: "+ abs(-20));
		//上下取值
		System.out.println("向上取值: "+ Math.ceil(1.2));//天花板
		System.out.println("向下取值: "+ Math.floor(1.2));//地板
		System.out.println("四舍五入: "+ Math.round(1.53));
		//取大取小
		System.out.println("取大: "+Math.max(2, 332L));
		System.out.println("取小: "+Math.min(2L, 1.22f));

	}
}
