package com.mm.testString.project;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author: Sy
 * @Date: 2025/6/17 - 06 - 17 - 14:43
 * @Description: com.mm.testString.project
 * @Version: 1.0
 */
	public class ATM {
	//  存储账户
	//  数组长度有限->选择ArrayList
		private ArrayList<Account> accounts = new ArrayList<>();
		private Scanner sc = new Scanner(System.in);
	//  声明登录账户
		Account loginAccount;
	/*
	* 展示首页
	* */
	public void showHomePage(){
		while(true){
			System.out.println("--欢迎您进入用户操作界面--");
			System.out.println("1.用户登录");
			System.out.println("2.用户开户");
			//接受录入int
			System.out.println("请录入您要选择的功能: ");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("进入登录功能");
					Login();

					break;
				case 2:
					System.out.println("进入开户功能");
					createAccount();
					break;
				default:
					System.out.println("没有对应的功能,请查看是否录入错误");
					break;
				}
			}
		}
	private void createAccount(){
		//信息封装为具体的账户
		Account ac = new Account();
		//录入各项信息
		//姓名录入
		System.out.println("请录入您的姓名: ");
		//身份证号码录入
		String name = sc.next();
		while(true){
			System.out.println("请录入您的身份证号码: ");
			String IDNumber = sc.next();
			if (IDNumber.length() == 18){
				ac.setIDNumber(IDNumber);
				break;
			}else {
				System.out.println("输入的身份证号码有误!");
			}}
		//密码录入
		while (true){
			System.out.println("请录入账户的密码: ");
			String password = sc.next();
			System.out.println("请再次确认您的密码: ");
			String twice = sc.next();
			if (twice.equals(password)){
				ac.setPassword(twice);
				break;
			}
			else {
				System.out.println("两次输入的密码不一致!");
			}
		}
		System.out.println("请输入限额: ");
		double limit = sc.nextDouble();
		String cardID = createCardID();
		ac.setCardID(cardID);
		ac.setName(name);
		ac.setLimit(limit);
		//封装好的对象放入集合
		accounts.add(ac);
		System.out.println("恭喜VIP<"+ac.getName()+">用户开户成功,已成为银行用户,您的卡号为: "+ac.getCardID());
		}

	private Account isExist(String cardID){
	/*
	* 判断卡号是否与已有的重复
	* @param cardID
	* */
		for (int i = 0; i < accounts.size(); i++) {
			Account account = accounts.get(i);
			if (account.getCardID().equals(cardID)){
			return account;
				}
			}
			return null;//无卡号返回null
		}

//生成卡号
	private String createCardID() {
		while (true) {
			String cardID = "";
			for (int i = 0; i <= 8 ; i++) {
				int rand_num = (int)(Math.random()*10);
				cardID += rand_num;
			}
			Account ac = isExist(cardID);
			if (ac == null){
				return cardID;
				}
			}
		}
	private void Login(){
	//登录账号
		System.out.println("欢迎登录!");
		System.out.println("输入您的卡号: ");
		String cardID = sc.next();
		Account ac = isExist(cardID);
		if (ac == null) {
			System.out.println("您还未创建账户!");
			}else {
			while (true) {
				System.out.println("请输入密码: ");
				String password = sc.next();
				if (ac.getPassword().equals(password)) {
					System.out.println("密码正确,成功登录!");
					loginAccount = ac;
					//用户UI
					UserInterface();
					break;
					}else {
					System.out.println("密码有误,请重登!");
				}
			}
		}
	}
	private void UserInterface() {
		while (true) {
			System.out.println("-欢迎您进入用户界面-");
			System.out.println("1 - 查询账户功能");
			System.out.println("2 - 存款功能");
			System.out.println("3 - 取款功能");
			System.out.println("4 - 转账功能");
			System.out.println("5 - 密码修改功能");
			System.out.println("6 - 退出功能");
			System.out.println("7 - 注销当前账户");
			System.out.println("请选择您想要执行的功能序号：");
			int choice = sc.nextInt();
			switch (choice){
				case 1:
					showLoginAccount();
					break;
				case 2:
					SaveMoney();
					break;
				case 3:
					WithdrawMoney();
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					System.out.println("<"+loginAccount.getName()+">用户已退出账户!");
					return;//退出的是用户界面
				case 7:
					break;
				default:
					System.out.println("输入有误!");
					break;
			}
		}
	}

	private void WithdrawMoney() {
		System.out.println("-->进入取款系统");
		while (true) {
			System.out.println("请录入您要取款的金额");
			double money = sc.nextDouble();
			if (money <= loginAccount.getMoney()) {
				if (money > loginAccount.getLimit()) {
					System.out.println("您一次性取钱超过限额,无法取款!");}
				loginAccount.setMoney(loginAccount.getMoney() - money);
				System.out.println("余额充足,可以取钱!您取了"+money+"元.您的余额为:"+loginAccount.getMoney());
				break;
			}else {
				System.out.println("您的余额为: "+loginAccount.getMoney()+",不能取出"+money);

			}
		}

	}

	private void SaveMoney() {
		System.out.println("-->进入存款系统");
		System.out.println("请录入您要存款的金额: ");
		double amount = sc.nextDouble();
		loginAccount.setMoney(loginAccount.getMoney()+amount);
		System.out.println("您已存入"+amount+"元,当前账户余额为: " + loginAccount.getMoney());
	}

	private void showLoginAccount() {
		System.out.println("==用户信息展示：==");
		System.out.println("卡号：" + loginAccount.getCardID());
		System.out.println("姓名：" + loginAccount.getName());
		System.out.println("身份证号：" + loginAccount.getIDNumber());
		System.out.println("余额：" + loginAccount.getMoney());
		System.out.println("取款限额：" + loginAccount.getLimit());
	}


}
