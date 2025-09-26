package com.hw1.model.vo;

public class Person {
	
	protected String name; // 이름
	// 상속받은 후손클래스에서 직접 접근 가능
	private int age; // 나이
	private double height; // 키
	private double weight; // 몸무게
	
	public Person() {}

	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

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
	
	public String information() {
		return String.format("이름 : %s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f", 
								name, age, height, weight);
		// 이름 : 홍길동 / 나이 : 20 / 신장 : 180.0 / 몸무게 : 70.0
	}
	
	
	
	
	
	
	
}
