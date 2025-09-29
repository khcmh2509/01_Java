package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {

	private Employee[] employees; // 직원 객체 배열
	private int employeeCount; // 직원수

	public Company(int size) {
		employees = new Employee[size];
		employeeCount = 0;
	}

	@Override
	public void addPerson(Person person) { // 업캐스팅
		// 매개변수로 들어온 person이 Employee인지 체크
		// employees 객체 배열 공간이 있는지 체크
		if (person instanceof Employee && employeeCount < employees.length) {
			employees[employeeCount++] = (Employee) person; // 다운캐스팅
			System.out.println("직원이 추가되었습니다 - " + person.getInfo());
			// 동적바인딩
		} else {
			System.out.println("인원이 모두 충원되어 더 이상 추가 못함");
		}

	}

	@Override
	public void removePerson(String id) {

		for (int i = 0; i < employeeCount; i++) { // 현재 등록된 직원 수 만큼만 반복

			if (employees[i].getId().equals(id)) {
				System.out.println("직원이 삭제되었습니다 - " + employees[i].getInfo());
				employees[i] = null; // 삭제

				for (int j = i; j < employeeCount - 1; j++) {
					// 삭제한 요소가 있는 i번째 인덱스부터 배열에 존재하는 직원 마지막 요소까지 순차접근
					employees[j] = employees[j + 1];
					// 배열 내 모든 후속 요소를 왼쪽으로 한칸씩 이동함
				}

				employees[--employeeCount] = null;
				// employeeCount 변수를 감소시켜 배열의 마지막 요소를 null로 설정하여 직원수 줄이기
				return;
			}

		}

		System.out.println("ID : " + id + "인 직원을 찾을 수 없습니다.");

	}

	@Override
	public void displayAllPersons() {

		System.out.println("전체 직원 명단 : ");
		for (int i = 0; i < employeeCount; i++) {
			System.out.println(employees[i].getInfo());
		}

	}

}
