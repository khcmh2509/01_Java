package edu.kh.basic;

// 초록색 글씨

// 한 줄 주석 : 컴파일러가 해석하지 않는 부분(메모)
/* 범위 주석
 * 주석
 * 주석
 * 주석
 * */
public class JavaTest {
	
	// main 메서드 : 자바 프로그램(애플리케이션)을 
	//				실행하기 위해서 반드시 필요한 구문
	
	// main 작성 후 ctrl + space -> Enter 자동완성
	public static void main(String[] args) {
		
		// main 메서드 안에 작성한 코드를 실행시키는 방법
		// 단축키 : ctrl + F11
		// 상단에 초록색 재생 버튼
		System.out.println("Hello World!!!");
		// syso 작성 후 ctrl + space -> Enter 자동완성
		
		// 저장 단축키 ctrl + s
		System.out.println("hi");
		System.out.println(); // 개행만
		System.out.println("저녁 뭐먹지");
		System.out.println("1234");
		System.out.println(1234);
		
		// ctrl + alt + 위아래 방향키 
		// : 방향키 방향으로 해당 줄 복사
		System.out.println();
		
		// 숫자 연산
		System.out.println("1 + 2"); // 1 + 2
		System.out.println(1 + 2); // 3
		
		// "" 안에 작성된 코드는 단순 문자열로 인식
		// "" 안에 작성되지 않은 코드는 숫자, 변수로 인식
		
		System.out.println(50 - 23);
		System.out.println(12 * 13);
		System.out.println(300 / 5);
		System.out.println(12 % 2); // 모듈러(modulo) : 나머지
		
		// "" (문자열) + 숫자 함께 작성 : 이어쓰기
		// 숫자 + 숫자 : 더하기 연산
		System.out.println("14 * 19 = " + 14 * 19);
		
		// 자바는 사칙연산의 우선 순위를 그대로 따름
		// -> 우선 계산을 원하면 () 괄호 사용
		
		System.out.println("90 + 70 + 65 = " + ( 90 + 70 + 65 ));
		
		System.out.println("A" + "B" + "형" ); // AB
		
		
		
		
		
	}
}

