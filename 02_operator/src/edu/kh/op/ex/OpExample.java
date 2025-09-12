package edu.kh.op.ex;

import java.util.Scanner;

// 예제 코드 작성용 클래스 (기능용/메서드용)
public class OpExample {
	
	// 기능들만.. == 메서드
	// ex1() method 
	public void ex1() {
		System.out.println("안녕!");
	}
	
	public void ex2() {
		System.out.println("점심뭐먹지~");
	}
	
	public void testEx1() {
		
		// 증감(증가, 감소) 연산자 : ++ , --
		// 1 을 더하거나 감소시키는 연산자
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		System.out.println("iNum1 : " + iNum1);
		System.out.println("iNum2 : " + iNum2);
		
		// 전위 연산
		int temp1 = 5;
		
		System.out.println( ++temp1 + 5 ); // 11
							// 6 + 5 -> 11
		
		// 후위 연산
		int temp2 = 3;
		
		System.out.println( temp2-- + 2 ); // 5
						// 3-- + 2 -> 5
						// 3-- -> 2
		System.out.println(temp2); // 2
		
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		//      3++ + --5
		//      3++ +   4 (b)
		//      c = 7 
		//      3++ -> 4 (a)
		
		
		// 최종적으로 a,b,c는 각각 얼마로 출력될까?
		System.out.printf("%d / %d / %d", a, b, c);
						// 4 / 4 / 7
			
	}
	
	public void testEx2() {
		
		// 비교 연산자 : >  <  >=  <=  ==  !=
		// - 비교 연산자의 결과는 항상 논리값(true/false)
		
		int a = 10;
		int b = 20;
		
		System.out.println( (a == b) == false );
						// (false) == false
						// -> true
		
		int c = 4;
		int d = 5;
		
		System.out.println( (++c != d) == (--c != d) );
		//					++c != d
		//					++4(5) != 5 -> false
		//									--c != d
		//									--5(4) != 5 -> true
		//					false == true 
		//					-> false
		
		System.out.println(100 > 99); // true
		System.out.println(100 >= 100); // true
		System.out.println(99 < 64); // false
		System.out.println(99 <= 100); // true
		
	}
	
	public void testEx3() {
		// 논리 연산자 : &&(AND), || (OR)
		// || -> shift + 백슬래시(\)
		
		// &&(AND) : 둘 다 true 면 true, 나머지 false
		// ~와, 그리고, ~면서, ~부터 ~까지, ~사이
		
		int a = 101;
		// a는 100 이상이면서 짝수인가?
		System.out.println( (a >= 100) && (a % 2 == 0) );
		// false
		
		int b = 5;
		// b는 1부터 10까지 숫자범위에 포함되어 있는가?
		// 1 ~ 10 -> b는 1보다 크거나 같으면서, 10보다 작거나 같다
		System.out.println( (b >= 1) && (b <= 10) );
		
		// || (OR) : 둘 다 false 면 false, 나머지 true
		// 또는, 혹은, ~거나
		
		int c = 10;
		// c는 10을 초과하거나 짝수인가?
		System.out.println( (c > 10) || (c % 2 == 0) );
		// true
		
		
	}
	
	public void testEx4() {
		// 삼항 연산자 :  
		// 조건식 ? true일때 수행될값 : false일때 수행될값
		// * 조건식 : 연산결과가 true/false 인 식
		
		int num = 30;
		
		// num 이 30보다 크면(초과) "num은 30보다 큰수이다" 
		// 아니면 "num은 30 이하의 수이다" 출력하라.
		
		String result = num > 30 ? "num은 30보다 큰 수이다" 
								: "num은 30 이하의 수이다";
	
		System.out.println(result);
		
		// -----------------------------------------
		
		// 입력받은 정수가 음수인지 양수인지 구분
		// 단, 0은 양수로 처리
		
		// ex) 
		// 정수 입력 : 4
		// 양수 입니다.
		// ----------------
		// 정수 입력 : -5
		// 음수 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 조건식 ? true수행될값 : false수행될값;
		String result2 = 
				input >= 0 ? "양수 입니다." : "음수 입니다.";
		
		System.out.println(result2);
		
	}
	
	public void testEx5() {
		// 복합대입 연산자
		// +=  -=  *=  /=  %=
		int a = 10;
		// a = a + 10; 
		a += 10;
		System.out.println(a); // 20
		
		
		int b = 20;
		// b = b - 10;
		b -= 10;
		System.out.println(b);
		
		
		// 부정 연산자 : !논리값
		// 논리값을 반대로 적용하는 것.
		
		System.out.println( !true ); // false
		
		System.out.println( !(10 != 10) ); // true
		//                      !(false) -> true
		
		// 참고~!
		// 비트 단위 부정(NOT) 연산자
		int c = 5;
		System.out.println(~c);
		// 32bit
		// 00000000 00000000 00000000 00000101
		// 11111111 11111111 11111111 11111010 -> -6
		
	}
	
	
	
	
}
