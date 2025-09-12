package edu.kh.variable2;

import java.util.Scanner;

// ctrl + shift + o : 현재 클래스에서 import 되지 않은 클래스를
// 자동으로 import, 
// 그리고 사용되지 않는 클래스도 자동으로 import 삭제

// import : 다른 패키지에 존재하는 클래스를 얻어오는 구문
// import java.util.Scanner : java.util 패키지에서
// Scanner Class(설계도) 수입

public class ScannerExample {

	public static void main(String[] args) {
		
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할
		
		// Scanner 객체 생성
		// -> 내 프로그램 안에 스캐너라는 기계를 새로 만드는 것.
		Scanner sc = new Scanner(System.in);
		// import 구문 없으면 설계도가 없는 것과 같아서
		// 기계를 만들 수 없음!
		// -> 오류 확인될 시 적절히 import 작성하여 오류 해결!
		
		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt(); // 정수를 입력받는 것
		
		//System.out.println(input1);
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d", input1, input2, input1 + input2);
		
		
		
	}

}
