package edu.kh.exception.model.service;

// 사용자 정의 예외 클래스
public class UserException extends Exception{
	
	public UserException() {}

	public UserException(String message) {
		super(message); 
		// -> 전달한 메세지와 예외에 대한 모든 내용을
		// 콘솔에 출력해주는 역할의 생성자
		// -> Throwable 생성자까지 전달
	}
	
	
	
}
