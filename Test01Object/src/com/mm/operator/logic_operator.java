package com.mm.operator;

/**
 * @Author: Sy
 * @Date: 2025/6/5 - 06 - 05 - 20:09
 * @Description: com.mm.test01
 * @Version: 1.0
 */


public class logic_operator {
    public static void main(String[] args) {
        System.out.println(true & false);
        System.out.println(true & true);
        System.out.println(false & false);
        System.out.println(false & true);
        System.out.println("---------");
        //短路与&& 只看第一个条件判断
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);
        // ^异或
        System.out.println(true ^ true);
        System.out.println(false ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        // 或
        System.out.println(true | true);
        System.out.println(false | true);
        // 短路或
        System.out.println(true || false);
        System.out.println(false || true);
        int i = 8;
        System.out.println((5 > 7)&&(i++ ==2));
        System.out.println(i);

    }

}
