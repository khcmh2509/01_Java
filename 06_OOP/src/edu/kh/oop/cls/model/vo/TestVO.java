package edu.kh.oop.cls.model.vo;

class TestVO {
	// 접근제한자 (default) : 같은 패키지내에서만 사용 가능함.
	// 접근제한자 자리에 아무것도 안쓰면 default 클래스라는 뜻.
	
	public void ex() {
		Student std = new Student();
		
		System.out.println( std.v1 );
		System.out.println( std.v2 );
		System.out.println( std.v3 );
		
	}
}
