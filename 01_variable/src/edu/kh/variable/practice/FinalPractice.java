package edu.kh.variable.practice;

public class FinalPractice {
	
	public static void main(String[] args) {
		
	//	문제 1) 정수형 변수 age 에 자신의 나이를 저장하고, 
	// System.out.println() 을 이용해 "나는 25살입니다." 
	// 형식으로 출력하시오.
	int age = 25;
	System.out.println("나는 " + age + "살입니다.");
		
	//	문제 2) int score = 90; 으로 시작하여 점수를 10점 더 올린 뒤, 
	// "최종 점수: 100" 이 출력되도록 프로그램을 작성하시오.
	int score = 90;
	score = score + 10;
	// score += 10;
	System.out.println("최종 점수 : " + score);
	
	//	문제 3) 자동 형변환
	//	정수형 변수 a 를 선언하고 값 10 을 저장한 뒤, 
	// double 타입 변수 b 에 a 를 대입하여 출력하시오.
	int a = 10;
	double b = a;
	System.out.println("a = " + a);
	System.out.println("b = " + b);
		
	//	문제 4) 강제 형변환
	//	실수형 변수 pi 에 3.14159 를 저장한 뒤, 
	// 이를 int 로 변환하여 출력하시오.
	//	단, printf 를 이용하여 소수 둘째 자리까지 pi 와 
	// 변환된 정수를 함께 출력하시오.
	double pi = 3.14159;
	int num = (int)pi;
	System.out.printf("pi = %.2f, num = %d\n", pi, num);
		
	//	문제 5) 문자와 정수 변환
	//	문자형 변수 ch 에 'A' 를 저장하고, 
	// 이를 정수형 변수에 변환하여 출력하시오.
	//	출력은 "문자: A, 코드값: 65" 형식으로 나타내시오.
	char ch = 'A';
	int code = ch; // 자동형변환 char -> int
	System.out.printf("문자: %c, 코드값: %d\n", ch, code);
		
	//	문제 6) 상수(final)와 계산
	//	상수 PRICE = 5000 (물건 가격)을 선언하고,
	//	변수 count = 3 (구매 개수)일 때,
	//	총 금액을 계산하여 "물건 가격: 5000원, 개수: 3개, 총액: 15000원" 
	// 형식으로 출력하시오.
	final int PRICE = 5000;
	int count = 3;
	int total = PRICE * count;
	System.out.printf("물건 가격: %d원, 개수: %d개, 총액: %d원\n", 
								PRICE,      count,       total   );
		
	//	문제 7) printf로 출력 서식 맞추기
	//	국어 95 , 영어 87 , 수학 90 점수를 저장한 뒤,
	//	총점과 평균을 구하여 아래와 같은 형식으로 출력하시오.
	//	(평균은 소수 둘째 자리까지 표시)
	//	국어: 95, 영어: 87, 수학: 90
	//	총점: 272, 평균: 90.67
	int kor = 95, eng = 87, math = 90;
	int sum = kor + eng + math;
	double avg = sum / 3.0;
	System.out.printf("국어: %d, 영어: %d, 수학: %d\n", kor, eng, math);
	System.out.printf("총점: %d, 평균: %.2f\n", sum, avg);
		
	
	//	문제 1) 출연자 정보 변수 만들기
	//	이름(name): 문자열 "영숙" Hint : 문자열은 String 자료형 사용
	//	나이(age2): 정수 28
	//	키(height): 실수 165.7
	//	위 세 가지 정보를 각각 알맞은 타입의 변수에 저장하시오.
	String name = "영숙";
	int age2 = 28;
	double height = 165.7;
	
	
	//	문제 2) 출력하기
	//	printf 를 사용하여 아래와 같이 출력되도록 작성하시오.
	//	출연자 이름: 영숙
	//	나이: 28세
	//	키: 165.7cm
	System.out.printf("출연자 이름: %s\n", name);
	System.out.printf("나이: %d세\n", age2);
	System.out.printf("키: %.1fcm\n", height);
	
	System.out.printf("출연자 이름: %s\n나이: %d세\n키: %.1fcm\n", 
			name, age2, height);
	
	//	문제 3) 자동 형변환
	//	나이(age2)를 double 타입 변수에 저장한 뒤 출력하시오.
	//	(출력 예: 자동 형변환된 나이(double): 28.0 )
	double doubleAge = age2; // 자동형변환
	System.out.println("자동 형변환된 나이(double): " + doubleAge);
	
	//	문제 4) 강제 형변환
	//	키(height)를 int 타입으로 변환하여 출력하시오.
	//	(출력 예: 강제 형변환된 키(int): 165 )
	int intHeight = (int)height; // double -> int 강제형변환
	System.out.println("강제 형변환된 키(int): " + intHeight);
	
	//	문제 5) 매칭 점수 평균
	//	점수(score1=87, score2=92)를 int 변수에 저장하시오.
	//	두 점수의 평균을 double 타입으로 계산하여 출력하시오.
	//	(출력 예: 영숙님의 매칭 점수 평균은 89.5점입니다! )
	int score1 = 87, score2 = 92;
	double avgScore = (score1 + score2) / 2.0;
	System.out.printf("%s님의 매칭 점수 평균은 %.1f점입니다!",
						name, avgScore);
	
	
	
	
	}
}
