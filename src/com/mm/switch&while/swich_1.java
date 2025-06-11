package com.mm.test02;

/**
 * @Author: Sy
 * @Date: 2025/6/5 - 06 - 05 - 22:03
 * @Description: com.mm.test01
 * @Version: 1.0
 */


public class swich_1 {
    public static void main(String[] args) {
    int score = 72;
    // switch 匹配case后面的数值 执行相应分支
    switch (score / 10) {
        case 10: System.out.println("A");
        case 9:
            System.out.println("A");
            break;// 防止代码穿透
        case 8:
        System.out.println("A");
        case 7:
            System.out.println("B");
            break;
        case 6:
        System.out.println("B");
        case 5:
        System.out.println("C");
    }
    }
}
