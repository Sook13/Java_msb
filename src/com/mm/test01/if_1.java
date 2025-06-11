package com.mm.test01;

import java.util.Scanner;

/**
* @Author: Sy
* @Date: 2025/6/5 - 06 - 05 - 20:58
* @Description: com.mm.test01
* @Version: 1.0
*/ 


public class if_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小朋友的年龄: ");
        int age = sc.nextInt();
        //判断条件
        if (age >= 3 && age<=6) {
            System.out.println("入学");
        }else{
            System.out.println("不入学");
        }
    }
}
