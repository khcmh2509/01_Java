package edu.kh.io.pack3.model.dto;

import java.io.Serializable;

// Serializable 인터페이스
// - 추상메서드가 하나도 없는 인터페이스
// - 상속만 받아도 입/출력 시 직렬화가 가능하다는 의미(표시)만 제공
// --> 마커 인터페이스
public class Member implements Serializable{
	
	private static final long serialVersionUID = 1L;
	// serialVersionUID
	// 직렬화된 객체를 다시 복원할 때(역직렬화)
	// 원래 클래스와 현재 클래스가 동일한 버전인지 확인하기 위한 식별번호
	// 없으면 JVM이 자동으로 생성해주지만, 명시적으로 작성하는것을 권장.
	
	// 필드
	private String id;
	private String pw;
	private String name;
	private int age;
	
	// 메서드
	public Member() {}
	
	public Member(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
