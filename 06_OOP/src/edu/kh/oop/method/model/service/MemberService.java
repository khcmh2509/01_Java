package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService {

	// 속성 (필드)
	private Scanner sc = new Scanner(System.in);
	
	// 가입한 회원의 정보를 저장할 변수
	private Member memberInfo = null; 
	
	// 로그인한 회원의 정보를 저장할 변수
	private Member loginMember = null;
	
	
	// 기능 (생성자, 메서드)
	
	// 메뉴 화면 출력 기능
	public void displayMenu() {
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		// 무조건 한번은 수행
		do {
			System.out.println("======회원 정보 관리 프로그램======");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine(); // 입력버퍼에 있는 개행문자 제거용
			
			switch(menuNum) {
			case 1 : /* signUp() */ break;
			case 2 : /* login() */ break;
			case 3 : /* selectMember() */ break;
			case 4 : /* updateMember() */ break;
			case 0 : System.out.println("프로그램 종료..."); break;
			default : System.out.println("메뉴에 있는 번호만 입력하세요!");
			}
			
			
		} while(menuNum != 0); // menuNum이 0이되면 반복 종료
		
	}
	
	
	
	
	
}
