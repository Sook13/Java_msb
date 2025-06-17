package com.mm.testString;

/**
 * @Author: Sy
 * @Date: 2025/6/17 - 06 - 17 - 13:52
 * @Description: com.mm.testString
 * @Version: 1.0
 */
public class Person {
	private String name;
	private int age;
	private String address;
	private double height;
	private double weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age, String address, double height, double weight) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.height = height;
		this.weight = weight;
	}
}
