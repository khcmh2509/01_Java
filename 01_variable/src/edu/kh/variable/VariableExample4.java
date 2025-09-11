package edu.kh.variable;

public class VariableExample4 {

	public static void main(String[] args) {
		
		/* 강제 형변환
		 * - 기존 자료형을 원하는 자료형으로 강제 변환 시키는 것
		 * 
		 * 1) 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환할 때
		 * 2) 출력되는 데이터의 표기법을 변환시키고 싶을 때
		 *  
		 * * 강제 형변환 방법
		 * - 자료형을 변환시키고 싶은 값 또는 변수 앞에 (자료형) 을 작성
		 * 
		 * */
		
		double temp = 3.14;
		// double -> int 강제 형변환 시 소수점 아래자리 손실(데이터 손실)
		int num = (int)temp;
		
		System.out.println(num);
		
		// int -> byte 강제형변환
		int iNum = 290;
		byte bNum = (byte)iNum;
		System.out.println(bNum);
		
		// 같은 정수형끼리의 변환시에도 
		// 값의 범위 차이 때문에 데이터 손실이 발생!
		
		// char -> int 강제형변환
		char ch = 'A';
		System.out.println( (int)ch );
		
		// int -> char 강제형변환
		// 44085은 어떤 글자?
		int iNum3 = 44085;
		System.out.println( (char)iNum3 );
		
		// 오버플로우 현상은 컴퓨터가 미리 예측할수 없다!
		// -> 개발자가 미리 예측해야함.
		int i6 = 2147483647; // int 형의 최대값
		int result2 = i6 + 1;
		System.out.println( result2 );
		
		
		

	}

}
