package com.mm.CWL;

import java.util.Arrays;
import java.util.Scanner;
//双色球彩票实现过程:
/**
 * @Author: Sy
 * @Date: 2025/6/10 - 06 - 10 - 14:31
 * @Description: com.mm.test03
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


