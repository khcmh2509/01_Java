package edu.kh.variable2;

import java.util.Scanner;

public class ScannerExample4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// nextInt(), nextDouble(), next() 공백은 수집하지 않는다!
		// -> 위 기능을 사용한 후 nextLine() 사용 시 문제점
		System.out.print("nextInt() 입력 : ");
		int intNum = sc.nextInt(); // 정수값 입력 
		// -> 정수값과 공백문자가 입력버퍼에 들어감
		// -> nextInt()는 정수값부분만 수집 
		// -> 입력버퍼에는 공백문자가 남은상태
		
		// 입력버퍼에 남은 개행문자 제거!
		sc.nextLine();
		
		System.out.print("nextLine() 입력 : ");
		String word = sc.nextLine(); // 공백까지 포함(개행 포함)
		
		
		
		
		
		
	}
}
