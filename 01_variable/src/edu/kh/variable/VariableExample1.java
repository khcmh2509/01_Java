package edu.kh.variable;

// class : 코드를 작성하는 곳
public class VariableExample1 {
	
	public static void main(String[] args) {
		
		// 변수 미사용
		System.out.println(2 * 3.141592653589793 * 5); // 원의 둘레
		System.out.println(3.141592653589793 * 5 * 5); // 원의 넓이
		System.out.println(3.141592653589793 * 5 * 5 * 20); 
		// 원기둥의 부피
		System.out.println(4 * 3.141592653589793 * 5 * 5); // 구의 겉넓이
		
		// 변수 사용
		double pi = 3.141592653589793; // 원주율
		int r = 5; // 반지름(radius)
		int h = 20; // 높이(height)
		
		System.out.println(2 * pi * r); // 원의 둘레
		System.out.println(pi * r * r); // 원의 넓이
		System.out.println(pi * r * r * h); // 원기둥의 부피
		System.out.println(4 * pi * r * r); // 구의 겉넓이
		
		/* 변수 (Variable)
		 * - 메모리(RAM)에 값을 기록하는 공간
		 * -> 공간에 기록되는 값(Data)이 변할 수 있어서 변수라고 한다.
		 * 
		 * - 변수는 여러 종류 존재 (저장되는 값의 형태, 크기가 다름)
		 * 
		 * 변수 사용의 장점
		 * 1. 가독성 증가
		 * 2. 재사용성 증가(한번 만든 변수를 계속 사용)
		 * 3. 코드 길이 감소
		 * 4. 유지보수성 증가(코드 수정이 간단해짐)
		 * 
		 * */
		
		
		
		
	}
}
