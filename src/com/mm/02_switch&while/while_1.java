package com.mm.test02;

/**
 * @Author: Sy
 * @Date: 2025/6/5 - 06 - 05 - 22:24
 * @Description: com.mm.test02
 * @Version: 1.0
 */


public class while_1 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        //简单求和
        int sum1 = num1 + num2 + num3;
        System.out.println(sum1);
        int num = 1;
        int sum2 = 0;
        while (num <= 3) {
        sum2 += num;
        num++;
        }
        System.out.println(sum2);
    }
}
