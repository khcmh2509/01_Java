package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	
	/* while 문
	 * 
	 * - 별도의 초기식, 증감식이 존재하지 않고
	 *   반복 종료 조건을 자유롭게 설정하는 반복문
	 *   
	 * ** 확실히 얼마만큼 반복한 후에 끝날지는 모르지만
	 * 언젠가 반복조건이 false가 되는 경우 반복을 종료함.
	 *  
	 * */
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		int input = 9;
		
		while(input != 0) { // input이 0이 아니면 반복,
							// 0이면 멈춤
			System.out.println("-------메뉴선택--------");
			System.out.println("1. 떡볶이");
			System.out.println("2. 쫄면");
			System.out.println("3. 김밥");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println("떡볶이를 주문했다"); break;
			case 2 : System.out.println("쫄면을 주문했다"); break;
			case 3 : System.out.println("김밥을 주문했다"); break;
			case 0 : System.out.println("프로그램을 종료합니다"); break;
			default : System.out.println("메뉴에 있는 번호만 선택해주세요!");
			}
			
		}
		
	}
	
	public void ex2() {
		// 입력되는 모든 정수의 합 구하기
		// 단, 0이 입력되면 반복 종료 후 결과 출력
		// -> 0 이 입력되지 않으면 계속 반복
		
		/*
		 * do {
		 * 	  반복 수행할 코드;
		 * 	  -> 무조건 한번은 수행
		 * } while(조건식);
		 * 
		 * 
		 * */
		
		int input = 0; // 입력받은 값을 저장할 변수
		int sum = 0; // 합계를 저장할 변수
		
		do {
			// 수행될 코드
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			sum += input;
			// sum = sum + input; // 누적
			
		} while(input != 0);
		
		System.out.println("합계 : " + sum);
		
		
	}
	
	
	
	
}
