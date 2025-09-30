package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;

public class StudentService {
	// java.util.List 인터페이스 : List에 반드시 필요한 필수 기능을 모아둔 인터페이스
	// * 인터페이스 객체 생성 X, 부모 참조변수 O
	
	// java.util.ArrayList : 배열 형태 List (가장 대표적인 List 자식 클래스)
	// -> 검색(조회) 효율적
	// java.util.Vector : 동기화 제공하여 List 중 성능이 가장 좋지 않음
	// java.util.LinkedList : 추가, 수정, 삭제 효율적
	
	// <E> : 제네릭
	// 타입을 제한하는 문법
	// 제네릭은 객체(Reference Type)만 허용 
	// Java 7 이상에서는 우변 제네릭 타입을 생략 가능
	// 다이아몬드 연산자 : 컴파일러가 좌변 부분을 보고 우변의 타입을 추론
	private List<Object> testList = new ArrayList<>();
	
	// 학생 정보를 저장할 List 생성
	private List<Student> studentList = new ArrayList<>();
	
	private Scanner sc = new Scanner(System.in);
	
	// new ArrayList() : 기본생성자 -> 기본 크기 10짜리 리스트 생성
	// 하지만 리스트의 크기는 늘었다 줄었다 하기때문에 큰 의미는 없음
	public void ex() { // List 테스트용 메서드
		
		// List.add(Object e) : 리스트에 객체를 추가
		// 매개변수 타입 Object == 모든 객체 타입을 매개변수로 전달할 수 있음
		testList.add("문자열");
		testList.add(new Scanner(System.in));
		testList.add(100); // AutoBoxing (자동으로 기본자료형을 객체형태로 변환함)
		testList.add(new Object());
		
		// 컬렉션 특징 : 여러 타입의 데이터를 저장할 수 있다.
		
		// Object List.get(int index) : 리스트에서 index번째에 있는 객체를 반환
		// 반환형이 Object == 모든 객체를 반환할 수 있다.
		
		System.out.println( testList.get(0) );
		System.out.println( testList.get(1) );
		System.out.println( testList.get(2) );
		System.out.println( testList.get(3) );
		
		for(Object e : testList) {
			System.out.println( e );
		}
		
		
		
	}

	/**
	 * 메뉴 출력용 메서드
	 * 
	 * alt + shift + j : 메서드 설명용 주석
	 * 
	 * @author 조미현(mihyun@iei.or.kr)
	 */
	public void displayMenu() {
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		do {
			try {
				System.out.println("\n=========학생 관리 프로그램==========");
				System.out.println("1. 학생 정보 추가");
				System.out.println("2. 학생 정보 전체 조회");
				System.out.println("3. 학생 정보 수정");
				System.out.println("4. 학생 정보 제거");
				System.out.println("5. 이름으로 검색(완전일치)");
				System.out.println("6. 이름으로 검색(포함)");
				System.out.println("0. 프로그램 종료");
				
				System.out.print("메뉴 번호 선택 : ");
				menuNum = sc.nextInt();
				sc.nextLine(); // 입력버퍼 개행문자 제거용
				
				switch (menuNum) {
				case 1: System.out.println( addStudent() ); break;
				case 2: /* selectAll(); */ break;
				case 3: /* updateStudent(); */ break;
				case 4: /* removeStudent(); */ break;
				case 5: /* searchName1(); */ break;
				case 6: /* searchName2(); */ break;
				case 0: System.out.println("프로그램 종료..."); break;
 				default: System.out.println("메뉴에 작성된 번호만 입력하세요!");
				}
				
				
			} catch (InputMismatchException e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다."
						+ "다시 시도해주세요.");
				
				sc.nextLine(); // 입력버퍼 남아있는 잘못된 코드 + 개행문자 제거
				
				menuNum = -1; // 첫 반복 시 잘못 입력하는 경우
				// menuNum이 초기값인 0을 가지고있어 반복문이 종료됨.
				// 이를 방지하기 위해서 임의값 -1 대입
				
			}
			
		} while(menuNum != 0);
		
		
	}
	
	
	/** 
	 * 1. 학생 정보 추가 메서드
	 * 
	 * @return 삽입 성공 시 "성공" , 실패 시 "실패" 문자열 반환
	 */
	public String addStudent() {
		// CheckedException : 반드시 throws 구문이나 try-catch 처리 강제
		// IOException, SQLException..
		
		// UncheckedException : 강제 처리 X, 예외 발생하면 
		// 자동으로 상위 호출 메서드로 예외가 전파됨.
		// InputMismatchException, NullPointerException...
		
		System.out.println("=========학생 정보 추가==========");
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine(); // 입력 버퍼 개행문자 제거
		
		System.out.print("사는 곳 : ");
		String region = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0); // 'M' or 'F'
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		/*
		Student std = new Student(name, age, region, gender, score);
		boolean result = studentList.add(std);
		if(result) {
			
		} else {
			
		}*/
		
		// Student 새 객체 생성 후 studentList에 추가
		if(studentList.add(new Student(name, age, region, gender, score))) {
			return "성공";
			
		} else {
			return "실패";
				
		}
		
		
		
	}
	
	
	
	
	
	
	
	
}
