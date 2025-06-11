## Arrays工具类

```java
package array;

import java.util.Arrays;

/**
 * @Author: Sy
 * @Date: 2025/6/6 - 06 - 06 - 21:03
 * @Description: array
 * @Version: 1.0
 */
public class array1 {
    public static void main(String[] args) {
       //先定义一个数组
       int[] arr = new int[]{12,34,52,-10,232,426,226};
       //查询数组中的元素
       System.out.println(Arrays.toString(arr));
       //排序 Arrays.sort()
       Arrays.sort(arr);//升序
       System.out.println(Arrays.toString(arr));
//     查找指定元素 binarySearch(int[],key)
       int index = Arrays.binarySearch(arr,232);
       System.out.println(index);
       //数组的复制
       int [] newArr = Arrays.copyOf(arr, arr.length);
       System.out.println(Arrays.toString(newArr));
       //数组的比较
       System.out.println(Arrays.equals(arr, newArr));
       //数组的填充
       Arrays.fill(newArr,0);
       System.out.println(Arrays.toString(newArr));
    }
}
```

## 二维数组

```java
package com.msb.array;

/**
 * @Author: Sy
 * @Date: 2025/6/6 - 06 - 06 - 21:03
 * @Description: com.msb.array
 * @Version: 1.0
 */
public class array2 {
//二维数组练习
public static void main(String[] args) {
    int [][] arr = new int[3][];
    System.out.println(arr.length);//本质上仍然是一维数组
    int [] a = new int[]{12,6,8};
    arr[0] = a;
	arr[1] = new int[]{5,7,8};
	// 第二种
	int [][] arr2 = new int[3][2];
    /*长度为3的int类型的二维数组 每个元素都是int类型的数组
    其中每个int类型的数组 初始长度为2
    (有点嵌套的逻辑在里边)
    */
	System.out.println(arr2[0][0]);
	int [] b = new int[]{4,2,9,7};
	arr2[0] = b;
	System.out.println(arr2[0][3]);
	/*也可以静态化定义二维数组
	*/
}
}
```

```java
package array;

import java.util.Arrays;

/**
 * @Author: Sy
 * @Date: 2025/6/6 - 06 - 06 - 21:03
 * @Description: array
 * @Version: 1.0
 */
public class array2 {
    public static void main(String[] args) {
    //定义一个二维数组
    int[][] arr = new int[][]{{12, 88, 93}, {23, 45, 20}, {6}};
    //普通for循环
    for (int i = 0; i < arr.length; i++) {
       for (int j = 0; j < arr[i].length; j++) {
          System.out.print(arr[i][j]+"\t");}
    }
    System.out.println("\n"+"-------------------------");
    //外for内增强
    for (int i = 0; i < arr.length; i++) {
       for (int num : arr[i]) {
          System.out.print(num + "\t");
          }
       }
    System.out.println("\n"+"-------------------------");
    //内外都是for增强
    for (int[] a : arr){
       for (int num : a){
          System.out.print(num + "\t");
       }
    }
    System.out.println("\n"+"-------------------------");
    //外部for增强内部普通for
    for (int[] a : arr){
       for (int i = 0; i < a.length; i++) {
       System.out.print(a[i] + "\t");
       } }
    }
}
```

## 综合应用-双色球彩票

```java
package array;

import java.util.Arrays;
import java.util.Scanner;
//双色球彩票实现过程:
/**
 * @Author: Sy
 * @Date: 2025/6/10 - 06 - 10 - 14:31
 * @Description: array
 * @Version: 1.0
 */
public class CWL {
    public static void main(String[] args) {
       int[] ball_num = new int[7];
       int count = 0;
       while (true) {
          System.out.println("----欢迎进入双色球彩票系统----");
          System.out.println("1.购买彩票");
          System.out.println("2.查看开奖");
          System.out.println("3.退出");
          System.out.println("请选择你要完成的功能:");
          Scanner sc = new Scanner(System.in);
          //给出三种选项,作为选择
          int choice = sc.nextInt();
          switch (choice) {
             case 1:
                System.out.println("双色球系统>>购买彩票");
                System.out.println("请选择你要购买几注:");
                count = sc.nextInt();
                for (int i = 0; i < 7; i++) {
                   if (i != 6) {
                      System.out.println("请输入第" + (i + 1) + "个红球: (红球的数字是1-33)");
                      int red_num = sc.nextInt();
                      ball_num[i] = red_num;
                   } else {
                      System.out.println("请输入第" + (i + 1) + "个蓝球: (蓝球的数字是1-16)");
                      int blue_num = sc.nextInt();
                      ball_num[i] = blue_num;
                   }
                }
                System.out.println("您购买了" + count + "注彩票," + "一共消费了" + count * 2 + "元钱,"
                      + "您购买的彩票号码为: ");
                for (int num : ball_num) {
                   System.out.print(num + "\t");
                }
                System.out.println();
                break;
             case 2:
                System.out.println("双色球系统>>查看开奖");
                //获取中奖号码
                int[] luck_num = getLuckBall();
                System.out.println("中奖号码为: "+Arrays.toString(luck_num));//查看中奖号码
                //购买的号码

                //进行比较得出结果
                int level = getLevel(ball_num, luck_num);
                switch (level) {
                   case 1:
                      System.out.println("恭喜你，中了1等奖，每注中奖金额是：100万元，您的奖金是：" + count * 100 + "万元");
                      break;
                   case 2:
                      System.out.println("恭喜你，中了2等奖，每注中奖金额是：30万元，您的奖金是：" + count * 30 + "万元");
                      break;
                   case 3:
                      System.out.println("恭喜你，中了3等奖，每注中奖金额是：10万元，您的奖金是：" + count * 10 + "万元");
                      break;
                   case 4:
                      System.out.println("恭喜你，中了4等奖，每注中奖金额是：2万元，您的奖金是：" + count * 2 + "万元");
                      break;
                   case 5:
                      System.out.println("恭喜你，中了5等奖，每注中奖金额是：3000元，您的奖金是：" + count * 3000 + "元");
                      break;
                   case 6:
                      System.out.println("恭喜你，中了6等奖，每注中奖金额是：5元，您的奖金是：" + count * 5 + "元");
                      break;
                   case 7:
                      System.out.println("您为福彩事业做了巨大的贡献！");
                      break;
                }
                break;
             case 3:
                System.out.println("退出系统");
                return;
          }
       }
    }
/*
* 获得中奖号码
* @return 7个随机数存入一个luck_num数组
* Math.random()
* */
    public static int[] getLuckBall() {
       int[] luck_num = new int[7];
       //生成7个随机数并放入数组中
       for (int i = 0; i < 7; i++) {
          if (i != 6) {
             luck_num[i] = (int) (Math.random() * 33 + 1);
          } else {
             luck_num[i] = (int) (Math.random() * 16 + 1);
          }
       }
       return luck_num;
    }
/*
 * 比较购买号码和中奖号码
 * @param ball_num 购买号码
 * @param Luck_num 中奖号码
 * */
    public static int getLevel(int[] ball_num, int[] Luck_num) {
       int level = 0;
       int red_count = 0; //红球计数器
       int blue_count = 0; //蓝球计数器
       for (int i = 0; i <= 6; i++) {
          if (i!=6){
             for (int j = 0; j <= 5; j++) {
                if (ball_num[i] == Luck_num[j]) {
                red_count++;}//遍历红球的号码
             }
          }else {
             if (ball_num[i] == Luck_num[6]) {
             blue_count++;}//遍历蓝球的号码
          }
       }
       if (red_count==6 && blue_count==1){
       level = 1;}
       else if (red_count==6 && blue_count==0){
       level = 2;}
       else if (red_count==5 && blue_count==1){
       level = 3;}
       else if (red_count==5 && blue_count==0 || red_count==4 && blue_count==1){
       level = 4;}
       else if (red_count==4 && blue_count==0 || red_count==3 && blue_count==1){
       level = 5;}
       else if (red_count<3 &&  blue_count==1){
       level = 6;}
       else {
       level = 7;}
       return level;
    }
}
```

## 面向对象

```java
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
		System.out.println("我喜欢唱跳rap篮球");
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
```

```java
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
```

## 变量类型

成员变量：类中方法外定义的变量
局部变量：方法中定义的变量  代码块中定义的变量

```
package com.mm.object;

/**
 * @Author: Sy
 * @Date: 2025/6/11 - 06 - 11 - 17:28
 * @Description: com.mm.object
 * @Version: 1.0
 */
public class Student {
    byte e;
    short s;
    int c ;//成员变量：在类中方法外
    long num2;
    float f ;
    double d;
    char ch;
    boolean bo;
    String name;// 引用数据类型
    public void study(){
       int num = 10 ; //局部变量：在方法中
       System.out.println(num);//10
       //int num ;重复命名，出错了
       {
          int a;//局部变量   在代码块中
       }
       int a;
       if(1 == 3){
          int b;
       }
       System.out.println(c);
    }
    public void eat(){
       System.out.println(c);
    }
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
       Student s = new Student();
       System.out.println(s.c);
       System.out.println(s.bo);
       System.out.println(s.ch);
       System.out.println(s.d);
       System.out.println(s.e);
       System.out.println(s.f);
       System.out.println(s.name);
       System.out.println(s.num2);
       System.out.println(s.s);
       s.d = 10.4;
    }
}
```
