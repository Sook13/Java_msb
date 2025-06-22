package com.msb.test2;

/**
 * @Author: Sy
 * @Date: 2025/6/19 - 06 - 19 - 15:32
 * @Description: com.msb.test2
 * @Version: 1.0
 */
public class Student {
	private String name;
	private int age;
	private int score;
	private String gender;

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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) throws Exception {
		if (gender.equals("男")||gender.equals("女")) {
			this.gender = gender;
		} else {
//		throw new RuntimeException("Man! What can I say?");
		throw new Exception();
		}
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				", score=" + score +
				", gender='" + gender + '\'' +
				'}';
	}
}
