package com.mm.operator;

import java.util.Scanner;

/**
 * @Author: Sy
 * @Date: 2025/6/5 - 06 - 05 - 20:32
 * @Description: com.mm.test01
 * @Version: 1.0
 */


public class command_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //男孩的选择
        System.out.println("男:1.火锅2.烧烤3.日料");
        int boy_choice = sc.nextInt();
        //女孩的选择
        System.out.println("女:1.火锅2.烧烤3.日料");
        int girl_choice = sc.nextInt();
        //比较
        System.out.println(boy_choice==girl_choice?"听男孩的":"听女孩的");

    }
}
