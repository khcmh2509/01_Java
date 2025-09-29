package com.hw2.model.dto;

public class Employee extends Person{

	private String position; // 직책

	public Employee(String id, String name, String position) {
		super(id, name);
		this.id = id;
		this.position = position;
	}

	@Override
	public String getInfo() {
		return String.format("ID : %s, 이름 : %s , 직책 : %s", id, name, position);
		// id와 name을 Person에서 protected로 만들었기 때문에
		// 후손클래스에서 직접 접근 가능!
	}
	
	
}
