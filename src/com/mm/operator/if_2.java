package com.mm.operator;

import java.util.Scanner;

/**
 * @Author: Sy
 * @Date: 2025/6/5 - 06 - 05 - 21:27
 * @Description: com.mm.test01
 * @Version: 1.0
 */


public class if_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小朋友的年龄: ");
        int age = sc.nextInt();
        if (age > 7){
            System.out.println("yes");
        }else if (age >= 5){
        System.out.println("请输入小朋友的性别:男 or 女");
        char gender = sc.next().charAt(0);
        //判断性别
        if (gender == '男'){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        }
    }
}
