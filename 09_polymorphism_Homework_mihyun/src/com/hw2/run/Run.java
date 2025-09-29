package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;
import com.hw2.model.service.Prison;

public class Run {
	public static void main(String[] args) {
		
		ManagementSystem company = new Company(10);
		ManagementSystem prison = new Prison(10);
		// 부모타입 참조변수 = 자식객체 (업캐스팅)
		
		// 직원 새로 등록하기 2명
		company.addPerson(new Employee("EMP001", "유재석", "기획팀")); // 다형성 업캐스팅 사용
		company.addPerson(new Employee("EMP002", "정형돈", "개발팀")); // 다형성 업캐스팅 사용
		
		// 등록된 직원 모두 조회
		company.displayAllPersons(); // 동적바인딩
		
		System.out.println("===========================================");
		
		// 수감자 새로 등록하기 2명
		prison.addPerson(new Prisoner("1205", "정준하", "밥도둑"));
		prison.addPerson(new Prisoner("0705", "박명수", "웃음연쇄살인"));
		
		// 등록된 수감자 모두 조회
		prison.displayAllPersons();
		
		System.out.println("===========================================");
		
		// EMP001 id를 가진 직원 삭제
		company.removePerson("EMP001");
		
		// 1205 id를 가진 수감자 삭제
		prison.removePerson("1205");
		
		System.out.println("===========================================");
		
		// 현재 남은 직원 모두 조회
		company.displayAllPersons(); // 동적바인딩
		// 현재 남은 수감자 모두 조회
		prison.displayAllPersons(); // 동적바인딩
		
		
		
		
	}
}
