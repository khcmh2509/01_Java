package edu.kh.collection.pack2.model.dto;

import java.util.Objects;

public class Person {
	
	private String name;
	private int age;
	private char gender;
	
	public Person() {}

	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, gender, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && gender == other.gender && Objects.equals(name, other.name);
	}

	// 객체가 같다(동일, 동등) 를 어떻게 비교할까?
	// - 동일 : 가리키고 있는 것이 같다
	// - 동등 : 값이 같음
	
	// 동일 객체 : 메모리 주소가 같은 객체
	//			  hashCode()는 주로 이런 객체를 식별하는데 사용
	
	// 동등 객체 : 메모리 주소가 다르더라도, 각 객체의 내부 값들이 같다면
	//			같은 객체로 간주하는 경우를 말함
	//			equals() 메서드는 이러한 객체가 같은지 판단할때 사용
	
	
	
	
	
	
	
	
}
