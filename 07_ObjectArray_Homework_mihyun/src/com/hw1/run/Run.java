package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		// 1. 객체 배열의 크기를 3으로 할당
		Employee emp[] = new Employee[3]; 
		
		// 할당 한 뒤 3개의 생성자를 이용하여 각각 생성
		emp[0] = new Employee(); // 기본생성자
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000,
							0.01, "01011112222", "서울 마곡");
		
		// 생성한 후 출력
		for(int i = 0; i < emp.length; i++) {
			System.out.println("emp[" + i + "] : " + emp[i].information());
		}
		
		System.out.println("========================================================");
		
		// 2. 3개의 객체 중 값이 없는 필드에 각각 값을 넣고 출력
		emp[0].setEmpNo(0);
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("전라도 광주");
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		System.out.println("emp[0] : " + emp[0].information());
		System.out.println("emp[1] : " + emp[1].information());
		
		System.out.println("========================================================");
		
		// 3. 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		//		연봉 = ( 급여 + (급여 * 보너스포인트) ) * 12
		
		int sum = 0; // 3명의 연봉을 누적해줄 변수
		
		for( int i = 0; i < emp.length; i++ ) {
			
			int sumSalary = (int)(emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint())) * 12; 
			System.out.println(emp[i].getEmpName() + "의 연봉 : " + sumSalary + "원");
			
			sum += sumSalary;
			
		}
		
		System.out.println("========================================================");
		
		// 4. 세 직원의 연봉 평균을 구하여 출력
		//	위의 3번에서 sum 변수를 이용하여 평균을 냄
		
		System.out.println("직원들의 연봉의 평균 : " + sum / emp.length + "원");
		
		
		

	}

}
