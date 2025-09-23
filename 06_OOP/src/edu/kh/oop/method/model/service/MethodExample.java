package edu.kh.oop.method.model.service;

public class MethodExample {
	
	// 메서드가 호출될 때 마다 
	// Stack 자료구조에 메서드를 실행한 이력이 쌓인다
	
	// main -> method1 -> method2 
	// 그리고 제일 마지막에 쌓인 순서대로 스택에서 나감
	// -> Last - Input - First - out (LIFO)
	// : 마지막에 들어온애가 첫번째로 나간다 == 후입선출
	// method2 -> method1 -> main

	public void method1() {
		int result = method2(3, 5);
		System.out.println(result);
		// return; 생략된 상태(컴파일러가 없으면 자동생성)
		// 해당 메서드를 종료하고 호출한 곳으로 되돌아감.
	}
	
	public int method2(int a, int b) {
		int sum = a + b;
		return sum;
		// return 값; (반환값이 있는 상태)
		// 해당 메서드를 종료하고 호출한 곳으로
		// 값을 가지고 되돌아감.
		
	}
	
	
}
