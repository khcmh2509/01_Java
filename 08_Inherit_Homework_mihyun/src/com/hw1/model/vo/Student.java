package com.hw1.model.vo;

public class Student extends Person {
	
	private int grade; // 학년
	private String major; // 전공
	
	public Student() {}

	public Student(String name, int age, double height, double weight, 
			int grade, String major) {
		super(age, height, weight);
		this.name = name; // 부모 protected 필드
		this.grade = grade;
		this.major = major;
	}
	
	@Override
	public String information() {
		return super.information();
	}
	
	
	
}
