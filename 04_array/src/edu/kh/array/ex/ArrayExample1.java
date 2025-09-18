package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	
	/*
	 * 배열(Array)
	 * 
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 * - 묶여진 변수들은 하나의 배열명으로 불려지고
	 *   구분은 index를 이용함 (index는 0부터 시작하는 정수)
	 * 
	 * */

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		// 변수 vs 배열
		
		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는 
		// 공간 4byte를 할당하고 그 공간에 num이라는 이름을 부여
		
		// 변수 대입
		num = 10;
		// 생성된 num이라는 변수공간에 10 이라는 정수값 대입
		
		// 변수 사용
		System.out.println("num에 저장된 값 : " + num);
		
		// --------------------
		
		// 배열 선언
		int[] arr;
		// int arr[];
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr 이라는 이름을 부여
		// ** 해당 변수는 참조형으로 주소값만을 저장할 수 있다 **
		
		// 배열 할당
		arr = new int[3];
		// new : "new 연산자" 라고하며
		//       Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당
		
		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		
		// new int[3] : Heap 영역에 int형 변수 3칸짜리 int[]을 생성(할당)
		
		System.out.println("arr : " + arr); // 주소값 출력
		
		System.out.println( arr[0] );
		System.out.println( arr[1] );
		System.out.println( arr[2] );
		// -> Heap 영역에 생성된 공간은 절대 비어있을 수 없다
		// -> JVM 기본값이 들어가져 있다
		// boolean : false
		// 나머지 : 0
		// 참조형 : null
		
		// 배열 요소 값 대입
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 100;
		// arr[3] = 500; // 런타임 에러 발생!
		// 배열 범위 벗어나 예외 발생
		
		System.out.println( arr[0] );
		System.out.println( arr[1] );
		System.out.println( arr[2] );
		
		// [10, 50, 100] 출력하고 싶을 때
		// 실제로 배열이 가진 모든 요소의 값을 알고 싶을 때
		// Arrays.toString(배열명); -> String 형
		 // "[10, 50, 100]"
		System.out.println( Arrays.toString(arr) );
		
	}
	
	public void ex2() {
		// 배열 선언 및 할당
		int[] arr = new int[4];
		
		// arr[0~3] 전부 JVM에 의해 0으로 초기화 되어있는 상태
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		//arr[4] = 500;
		// java.lang.ArrayIndexOutOfBoundsException: 
		// Index 4 out of bounds for length 4
		// 배열의 인덱스 범위를 벗어남 : 
		// 길이를 4칸짜리로 만든 배열인데,
		// 없는 인덱스번호인 4에 접근했다
		
		// 배열과 for문
		// 배열의 길이(몇 칸 인가) : 배열명.length
		System.out.println( "배열의 길이 : " + arr.length );
		
		for(int i = 0; i < arr.length; i++) {
			// i -> 0 1 2 3 
			arr[i] = i * 100; // for을 이용한 초기화 방법
			
			// for을 이용한 배열 요소 출력 방법 
			System.out.printf("arr[%d]에 저장된 값: %d\n", 
								i, arr[i]);
			// arr[0]에 저장된값 : 100
			// arr[1]에 저장된값 : 200
			// .. 
			
		}
		
		// 선언과 동시에 초기화
		int[] arr2 = {1, 2, 3, 4, 5};
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr2 라는 이름 부여
		// Heap 메모리 영역에 int 5칸짜리 배열을 생성하고
		// 0번 인덱스부터 각 요소에 1~5까지 정수값을 대입.
		// int[] 주소값을 arr2 참조변수가 참조함.
		
		System.out.println( Arrays.toString(arr2) );
		
		
	}
	
	public void ex3() {
		// 5명의 키(cm)를 입력받고 평균 구하기
		
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 163.7
		// ...
		// 5번 키 입력 : 167.2
		// 평균 : 177.02cm
		
		
		double[] height = new double[5];
		double sum = 0; // 합계 누적할 용도의 변수
		
		// 배열의 각 요소에 값 대입하는 용도의 반복문
		for(int i = 0; i < height.length; i++) {
			// 0 1 2 3 4
			System.out.print((i+1) + "번 키 입력 :"); // 1 2 3 4 5
			height[i] = sc.nextDouble();
			// height[0] = 170.2;
			// height[1] = 163.2;
			// height[2] = 158.3;
			// height[3] = 180.2;
			// height[4] = 140.8;
			sum += height[i]; 
			// sum = sum + height[i]
			// 	             170.2;
			//               163.2
			// ...
		}
		
		System.out.printf("\n평균 : %.2f cm", 
						sum / height.length );
		
		
		
	}
	
	public void ex4() {
		// 입력 받은 인원 수 만큼의 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계, 평균 출력
		
		// ex) 
		// 입력 받을 인원 수 : 4
		// 1번 점수 입력 : 100
		// 2번 점수 입력 : 80
		// 3번 점수 입력 : 50
		// 4번 점수 입력 : 60
		
		// 합계 : 290
		// 평균 : 72.5
		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();
		
		// 배열 선언 및 할당
		// 할당할 배열의 크기는 입력받은 인원수 크기만큼(input)
		int[] score = new int[input];
		
		// 합계 저장용 변수
		int sum = 0;
		
		// score 배열의 각 요소에 입력하는 값 대입 & 합계 누적 
		for(int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "번 점수 입력 : ");
			score[i] = sc.nextInt(); // 배열 인덱스에 입력한 값을 대입
			sum += score[i]; // 합계 누적
		}
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n", 
					(double)sum / score.length);
		
	}
	
	public void ex5() {
		// 점심 메뉴 뽑기 프로그램
		String[] arr = {"김밥", "서브웨이", "햄버거", 
						"백반", "국밥", "짜장면" };
		
		System.out.println( "오늘 점심 메뉴 : " +  
						arr[ (int)(Math.random() * 6) ] );
		// Math.random() : 0.0 ~ 1.0
		// 0.0 <= x < 1.0
		// 0.0 <= x < 6.0
		// 0 <= x < 6 
		// 0 1 2 3 4 5 
		
		
	}
	
	public void ex6() {
		// 배열을 이용한 검색
		
		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력
		
		// ex)
		// 정수 입력 : 200
		// 1번째 인덱스에 존재
		
		// 정수 입력 : 5
		// 존재하지 않음
		
		int[] arr = {100, 200, 300, 400, 500,
					600, 700, 800, 900, 1000};
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 찾음 여부를 표시하기 위한 (신호를 나타내기 위한) 변수
		boolean flag = true; // 검사전에는 못찾았다고 가정
		
		for(int i = 0; i < arr.length; i++) {
			
			if(input == arr[i]) {
				System.out.println(i + "번째 인덱스에 존재");
				flag = false; // 일치하는 값을 찾았으므로 true로 변경
			} 
			
		}
		
		if( flag ) {
			System.out.println("존재하지 않음");
		}
		
		
	}
	
	public void ex7() { 
		// 입력받은 값과 일치하는 값이 있으면 인덱스 번호 출력
		// 없으면 "존재하지 않음" 출력
		
		// 과일 입력 : 아보카도
		// 5번 인덱스에 존재
		
		// 과일 입력 : 수박
		// 존재하지 않음
		
		String[] arr = {"사과", "딸기", "바나나", 
						"키위", "멜론", "아보카도"};
		
		System.out.print("과일 입력 : ");
		String input = sc.next();
		
		boolean flag = true;
		
		for(int i = 0; i < arr.length; i++) {
			
			if( input.equals(arr[i]) ) { 
				// String 비교시 equals() 사용!
				System.out.println(i + "번째 인덱스에 존재");
				flag = false; // 찾았다고 표시
			}
		}
		
		if( flag ) {
			System.out.println("존재하지 않음");
		}
	
		
		
	}
	
	public void ex8() {
		// ex)
		// 문자열 입력 : hello
		// [h, e, l, l, o]
		// 검색할 문자 입력 : l
		// 2개 있음 / 존재하지 않음
		
		// 1. 문자열을 입력받아 한 글자씩 잘라내어 
		// 		char 배열에 순서대로 저장
		// 2. 문자 하나를 입력받아 일치하는 문자가 char 배열에
		// 		몇 개 존재하는지 확인
		// 3. 단, 일치하는 문자가 없을 경우 "존재하지 않습니다" 출력
		
		// 사용해야하는 기술, 기능
		// 1) 배열 검색
		// 2) 문자열의 길이 구하기 : String.length()
		//   ex)  "hello".length() -> 5 반환
		// 3) String.charAt(index) : 문자열에서 특정 index 에
		//    위치한 문자 하나를 얻어옴.
		//   ex) "hello".charAt(1) -> 'e' 반환
		//		  01234
		// 4) count (숫자세기)
		
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine(); 
		// hello world -> [h,e,l,l,o, ,w,o,r,l,d]
		
		// 1. 입력받은 문자열을 한글자씩 잘라내어
		//   char 배열에 순서대로 저장
		// 1-1) 입력받은 문자열 길이만큼의 
		//      char 배열 선언 및 할당하기
		char[] arr = new char[input.length()];
		
		// 1-2) 입력한 문자열을 한글자씩 잘라내어 char 배열의
		//   모든 요소에 순서대로 값 대입하기
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			// arr[0] = 'h';
			// arr[1] = 'e'; 
			// arr[2] = 'l';
			// arr[3] = 'l';
			// arr[4] = 'o';
		}
		
		System.out.println( Arrays.toString(arr) );
		
		// 2. 문자 하나를 입력받아 일치하는 
		// 문자가 char 배열에 몇 개 존재하는지 확인
		System.out.print("검색할 문자 입력 : ");
		char ch = sc.next().charAt(0);
		// String.charAt(index) -> 문자형 ''
		// "e".charAt(0); -> 'e'
		// -> Scanner에는 char 형태를 입력받을 수 있는 
		//    메서드가 없다 
		// -> String으로 우선 입력받고, 입력받은 String에서
		// charAt(index) 메서드를 이용하여 해당 index 번째 존재하는
		// 문자 하나를 떼어 char 자료형 형태로 반환함.
		
		// arr이라는 배열에 입력한 문자가 몇개 존재하는지 
		// 0번 index부터 마지막 index까지 순회하며 검색하기 위함
		// [h,e,l,l,o]
		int count = 0; // 내가 찾는 글자 개수를 세기 위한 변수
		
		for(int i = 0; i < arr.length; i++) {
			if(ch == arr[i]) {
				count++;
				// arr[i] 값과 검색할 문자 ch가 같은 경우
				// 카운트를 늘려라!
			}
		}
		
		// 결과 출력
		if( count > 0 ) { // 일치하는 값 있을때
			System.out.println(count + "개 있음");
			
		} else { // 일치하는 문자가 없는 경우
			// 3. 단, 일치하는 문자 없을 경우 "존재하지 않음" 출력
			System.out.println("존재하지 않음");
		}
		
		
		
	}
	
	
	

}
