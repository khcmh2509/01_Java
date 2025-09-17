package edu.kh.control.practice;

import java.util.Scanner;

public class ATMPractice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int balance = 10000; // 초기 잔액
		boolean running = true; // 프로그램 실행 여부

		System.out.println("=== ATM 프로그램 시작 ===");

		while (running) {
			System.out.println("\n현재 잔액: " + balance + "원");
			System.out.println("메뉴를 선택하세요:");
			System.out.println("1. 입금하기");
			System.out.println("2. 출금하기");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print(">> ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1: // 입금
				System.out.print("입금할 금액을 입력하세요: ");
				int deposit = sc.nextInt();
				if (deposit > 0) {
					balance += deposit;
					System.out.println("입금 완료! 현재 잔액: " + balance + "원");
				} else {
					System.out.println("잘못된 금액입니다.");
				}
				break;

			case 2: // 출금
				System.out.print("출금할 금액을 입력하세요: ");
				int withdraw = sc.nextInt();
				if (withdraw > balance) {
					System.out.println("잔액 부족! 현재 잔액은 " + balance + "원입니다.");
				} else if (withdraw <= 0) {
					System.out.println("잘못된 금액입니다.");
				} else {
					balance -= withdraw;
					System.out.println("출금 완료! 현재 잔액: " + balance + "원");
				}
				break;

			case 3: // 잔액 조회
				System.out.println("현재 잔액은 " + balance + "원입니다.");
				break;

			case 4: // 종료
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다!");
				running = false;
				break;

			default: // 잘못된 입력
				System.out.println("잘못된 입력입니다. 1~4번 중에서 선택하세요.");
			}
		}

	}

}
