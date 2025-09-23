package edu.kh.oop.cls.model.vo;

public class User {
	
	// 속성 (필드)
	// 아이디, 비밀번호, 이름, 나이, 성별 (추상화 진행)
	// 클래스 외부에서 데이터에 직접접근 불가 원칙 
	// -> 필드의 접근제한자를 모두 private 작성 (캡슐화 진행)
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	// 기본생성자 자동완성 단축키 : ctrl + space -> enter
	// 기본생성자 (기본생성자 -> 매개변수 없는 생성자)
	public User() {
		System.out.println("기본생성자로 User 객체 생성");
		
		// 필드 초기화
		userId = "user01";
		userPw = "pass01";
		userName = "홍길동";
		userAge = 20;
		userGender = '남';
	}
	
	
	// 매개변수 생성자
	// ** 매개변수 : 생성자나 메서드 호출 시 () 안에 작성되어
	// 				전달되는 값을 저장하고 있는 변수
	public User(String userId, 
			String userPw) {
		
		// 필드 초기화
		this.userId = userId;
		this.userPw = userPw;
		
		// this 참조변수
		// - 객체가 자기 자신을 참조할 수 있도록 하는 변수
		// 왜 사용?
		// -> 필드명과 매개변수명이 같은 경우
		//    이를 구분하기 위해서 사용한다.
	}
	
	// 매개변수 생성자 자동완성
	// alt + s -> Generate Constructor using Fields... 
	// -> generate 클릭
	
	// 필드를 전부 초기화하는 목적의 매개변수 생성자
	public User(String userId, 
				String userPw, 
				String userName, 
				int userAge, 
				char userGender) {
		
		// this() 생성자
		// 같은 클래스의 다른 생성자를 호출할 때 사용
		// 왜 사용하는가?
		// 중복 코드 제거, 코드 길이 감소, 재사용성 증가.
		// 단점 : 가독성이 좀 떨어지는 경우가 있다.
		// 주의할 점 : 반드시 생성자 내에서 첫번째 줄에 작성해야함!
		this(userId, userPw);
//		this.userId = userId;
//		this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}

	// 기능 (메서드)
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public char getUserGender() {
		return userGender;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	// 자바는 기본적으로 필드명, 생성자명, 메서드명, 변수명 의
	// 중복을 허용하지 않음.
	
	// private String userId; // Duplicate field User.userId
	// public User() {}
	
	// ** 오버로딩 (Overloading) **
	// - 클래스 내에 동일한 이름의 메서드(생성자도 포함)를
	// 여러개 작성하는 기법
	
	// [오버로딩 조건]
	// 1) 메서드(생성자)명 동일할 것
	// 2) 매개변수의 개수, 타입(자료형), 순서 중 1개라도 달라야함.
	
	// public User() {}
	
	public User(String userId) {} 
	// 매개변수의 개수가 같은 생성자 없음
	// -> 오버로딩 성립
	
	public User(int userAge) {} 
	// 매개변수의 갯수가 같은것은 있으나 타입이 다름
	// -> 오버로딩 성립
	
	public User(String userId, int userAge) {}
	// 매개변수의 개수와 동일한것이 있으나, 하나의 타입이 다름
	// -> 오버로딩 성립
	
	public User(int userAge, String userId) {}
	// 매개변수의 개수, 타입은 같지만 순서가 다름
	// -> 오버로딩 성립
	
	// public User(int age, String name) {}
	// 매개변수의 개수, 타입, 순서가 모두 같아서 불가
	// -> 변수명은 신경쓰지 않는다.
	
	
	/* 생성자(Constructor)
	 * 
	 * - new 연산자를 통해서 객체를 생성할 때
	 * 생성된 객체의 필드값 초기화 + 지정된 기능을 수행하는 역할
	 * 
	 * - 생성자 작성 규칙
	 * 1) 생성자의 이름은 반드시 클래스명과 같아야 한다.
	 * 2) 반환형이 존재하지 않는다.
	 * 
	 * - 생성자 종류
	 * 1) 기본 생성자 
	 * 2) 매개변수 생성자
	 * 
	 * *** 생성자가 하나도 없을 때 컴파일러가 기본생성자 생성해줌 ***
	 * 
	 * */
	
	
}
