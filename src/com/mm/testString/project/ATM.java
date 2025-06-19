package com.mm.testString.project;


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
	* return account / null
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
					TransferMoney();
					break;
				case 5:
					UpdatePassword();
					break;
				case 6:
					System.out.println("<"+loginAccount.getName()+">用户已退出账户!");
					return;//退出的是用户界面
				case 7:
					//销户
					if (DeleteAccount()) {
						System.out.println("销户成功!-->将返回用户操作界面");
						return;
					}
					break;
				default:
					System.out.println("输入有误!");
					break;
			}
		}
	}

	private boolean DeleteAccount() {
		System.out.println("==进入销户功能==");
		while (true) {
			System.out.println("请确认是否进行销户: Y or N");
			String choice = sc.next();
			switch (choice){
			case "Y":
				if (loginAccount.getMoney()==0) {
					accounts.remove(loginAccount);
					return true;
				} else{
					System.out.println("余额不为0,不能直接销户!");
					return false;
				}
			case "N":
				System.out.println("好的,保留您的账户!");
				return false;
			default:
			}
		}
	}

	private void UpdatePassword() {
	//修改密码:
	//1.认证用户当前密码是否正确
	//2.开始修改密码:输入两次密码是否一致
	//3.两次相同,成功修改.两次不同,重新修改.
		System.out.println("==欢迎使用密码修改功能==");
		System.out.println("请输入您的密码: ");
		String password = sc.next();
		//校验密码
		if (password.equals(loginAccount.getPassword())) {
			while (true) {
				System.out.println("录入新的密码: ");
				String newPassword = sc.next();
				System.out.println("请再录入一次密码: ");
				String twicePassword = sc.next();
				if(newPassword.equals(twicePassword)) {
					loginAccount.setPassword(twicePassword);
					return;
					}
					else {
					System.out.println("两次密码不一致!");
				}
			}
		}
	}

	private void TransferMoney() {
	//判断系统中是否有其他的账户
	if (accounts.size() < 2){
		System.out.println("当前系统仅有1位账户,无法完成转账操作!");
		return;//停止当前方法
		}
	if (loginAccount.getMoney() == 0){
		System.out.println("该账户存款余额为0,无法完成转账操作!");
		return;
		}
		System.out.println("请输入对方的卡号: ");
		String cardID = sc.next();
		Account ac = isExist(cardID);
		if (ac == null){
			System.out.println("对方账户是空号!");
			}else {
			System.out.println("卡号正确!");
			String name = "**" + ac.getName().substring(ac.getName().length()-1);//获取名字最后一位字与**拼接
			System.out.println("请录入<"+name+">完整姓名: ");
			String PrintName = sc.next();
			if (PrintName.equals(ac.getName())) {
				System.out.println("姓名相符!");
				while (true) {
					System.out.println("请输入您要转账的金额: ");
					double amount = sc.nextDouble();
					if (loginAccount.getMoney() >= amount){
						loginAccount.setMoney(loginAccount.getMoney() - amount);//当前账户扣除转账的金额
						ac.setMoney(ac.getMoney() + amount);//对方账户得到金额
						System.out.println("转账成功!");
						break;
						}else {
						System.out.println("余额不足!"+"\t余额: "+loginAccount.getMoney());
					}
				}
			}else {
				System.out.println("姓名不匹配!");
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
				break;
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
