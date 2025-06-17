package com.mm.testString.project;

/**
 * @Author: Sy
 * @Date: 2025/6/17 - 06 - 17 - 14:20
 * @Description: com.mm.testString.sytem
 * @Version: 1.0
 */
public class Account {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 身份证号
	 */
	private String IDNumber;
	/**
	 * 卡号
	 */
	private String cardID;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 账户余额
	 */
	private double money;
	/**
	 * 限额
	 */
	private double limit;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String IDNumber) {
		this.IDNumber = IDNumber;
	}

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	public Account() {
	}

	public Account(String name, String IDNumber, String cardID, String password, double money, double limit) {
		this.name = name;
		this.IDNumber = IDNumber;
		this.cardID = cardID;
		this.password = password;
		this.money = money;
		this.limit = limit;
	}
}