package com.toyFactory.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {

	// 필드

	// 입력용 객체
	private Scanner sc = new Scanner(System.in);
	// 중복된 Toy 객체가 없도록 저장할 컬렉션 중 Set
	private Set<Toy> toySet = new HashSet<Toy>();
	// 재료가 저장되어있는 map
	private Map<Integer, String> materialMap = new HashMap<Integer, String>();

	// 기본생성자
	public ToyFactory() {
		// 기본 등록된 재료
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");

		// 현재 제작된 장난감

		// 1. 일반 배열 사용
		// toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805",
		// addMaterials(new int[] {1,4})));

		// 2. List.of() 사용
		// toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805",
		// addMaterials(List.of(1, 4))));

		// 3. Arrays.asList() 사용
		// toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805",
		// addMaterials(Arrays.asList(1, 4))));

		// 4. 가변인자 사용
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(1, 4)));
		toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", addMaterials(1, 2)));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", addMaterials(1, 2)));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", addMaterials(1, 2)));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addMaterials(1, 2, 4)));

	}

	// 가변인자 : 매개변수의 수가 정확히 몇개인지 특정할 수 없을 때 사용
	// 자료형...변수명
	// 가변인자를 통해 들어온 매개변수의 데이터 타입은 배열!

	/**
	 * 매개변수로 전달받은 값들을 재료저장 Map에 있는지 확인하고 Set형태로 반환하는 메서드
	 * 
	 * 가변인자 작성법 : 자료형...변수명 -> 매개변수의 수가 정확히 몇개인지 특정할 수 없을 때 사용
	 * 
	 * @return
	 * @throws UndefinedMaterialsException
	 */
	private Set<String> addMaterials(int... materials) {

		// 1. 매개변수로 전달받은 materials 파악하기 == 배열로 정수형 데이터가 여러개
		// ex) [1,2,4]

		// 2. 재료를 저장하여 반환할 Set객체를 생성
		Set<String> addedMaterials = new HashSet<String>();

		// 3. addedMaterials 에 재료명을 추가해야함
		// -> 단, 재료는 Map에 존재하는 것만 추가 가능
		for (int materialKey : materials) {

			// Map에서 재료 고유 번호(Key)에 대응하는 재료명(Value)를 가져와서
			// addedMaterials 추가
			// map에 없는 key를 입력하여 value를 얻어왔을 때 == null
			String materialValue = materialMap.get(materialKey);

			if (materialValue != null) {
				// 재료 목록에 해당 키(재료)가 있을 때
				addedMaterials.add(materialValue);
			}
		}

		return addedMaterials; // [면직물, 플라스틱]
	}

	public void displayMenu() {

		int menuNum = 0;

		do {
			System.out.println("\n<< 플레이타임 공장 >>\n");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");

			try {

				menuNum = sc.nextInt();

				switch (menuNum) {
				case 1:
					displayAllToys();
					break;

				case 2:
					createNewToy();
					break;

				case 3:
					deleteToy();
					break;

				case 4:
					displayToysByManufactureDate();
					break;
				case 5:
					displayToysByAge();
					break;

				case 6:
					addMaterial();
					break;
				case 7:
					removeMaterialByName();
					break;

				case 0:
					System.out.println("프로그램을 종료합니다");
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요!");

				}

			} catch (Exception e) {
				System.out.println("알맞은 입력을 해라...(경고)..");
				e.printStackTrace();

				sc.nextLine(); // 입력 버퍼에 남은 잘못된 문자 비우기

				menuNum = -1;
				// 첫 반복에서 예외 발생 시 종료되지 않도록 menuNum 값을 임의의 값으로 세팅
			}

		} while (menuNum != 0);

	}

	/**
	 * 전체 장난감 조회하기
	 * 
	 */
	public void displayAllToys() {
		System.out.println("\n<전체 장난감 목록>");

		if (toySet.isEmpty()) {
			System.out.println("생성된 장난감이 없습니다.");
			return;
		}

		int index = 1;
		for (Toy toy : toySet) {
			System.out.println(index + ". " + toy);
			index++;
		}
	}

	/**
	 * 새로운 장난감 만들기
	 * 
	 */
	public void createNewToy() throws Exception {
		System.out.println("\n<새로운 장난감 추가>");

		// 장난감 이름 입력받음
		// -> 이미 존재하는 장난감인지 이름으로 확인
		System.out.print("장난감 이름 : ");
		String name = sc.next();

		for (Toy existingToy : toySet) {

			if (existingToy.getName().equals(name)) {
				System.out.println("이미 같은 이름을 가진 장난감이 존재합니다.");
				return;
			}
		}

		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();

		System.out.print("가격 : ");
		int price = sc.nextInt();

		System.out.print("색상 : ");
		String color = sc.next();

		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
		String manufactureDate = sc.next();

		Set<String> materials = new HashSet<String>(); // 재료 저장할 Set 객체 생성

		System.out.println("사용 가능한 재료 목록");

		// System.out.println(materialMap.entrySet());
		// [1=면직물, 2=플라스틱, 3=유리, 4=고무]
		// Set <Entry<K, V> > Map.entrySet() : key=value 한 쌍으로 이루어진 Entry 객체를
		// Set 객체로 반환

		// Entry.getKey() : Entry 객체의 key 반환
		// Entry.getValue() : Entry 객체의 value 반환
		for (Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			// 1 : 면직물
			// 2 : 플라스틱
			// 3 : 유리
			// 4 : 고무

		}

		while (true) {
			System.out.print("추가할 재료의 번호를 입력하세요 (종료하려면 'q'를 입력하세요) : ");

			try {
				String input = sc.next();

				if (input.equals("q")) { // 종료 시
					break;
				}

				// String 형인 input을 int형 정수값으로 변환(Integer Wrapper 클래스 이용)
				int materialKey = Integer.parseInt(input); // "1" -> 1
				// NumberFormatException 발생 가능성 있음 : 문자열(String)을 숫자로 변환하려고 할 때, 변환이 불가능한 경우 발생
				String material = materialMap.get(materialKey); // "면직물"
				// 입력받은 재료고유번호(key)로
				// map에 저장된 재료명(value)를 얻어옴

				if (material != null) { // 재료명이 null 이 아니라면

					// materials Set객체에 해당 재료명이 존재하는지
					if (materials.contains(material)) {
						System.out.println("이미 추가된 재료입니다. 다른 재료를 선택하세요");

					} else { // Set에 중복된 재료가 없으면 새로 추가
						materials.add(material);
						System.out.println("재료가 추가되었습니다 : " + material);
					}

				} else { // 재료명이 null == 없는 재료고유번호를 입력했다는 의미
					System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				}

			} catch (NumberFormatException e) { // 재료번호 입력 시 숫자나 q 가 아닌 경우 예외처리 바로 함
				System.out.println("숫자를 입력하거나 q를 입력하세요.");
			}

		}

		Toy newToy = new Toy(name, age, price, color, manufactureDate, materials);
		// 추가할 재료 저장된 새로운 Set객체

		toySet.add(newToy);
		System.out.println("새로운 장난감이 추가되었습니다!");

	}

	/**
	 * 장난감 삭제하기
	 * 
	 */
	public void deleteToy() throws Exception {

		System.out.println("\n<장난감 삭제하기>");

		if (toySet.isEmpty()) {
			System.out.println("생성된 장난감이 없습니다.");
			return;
		}

		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String toyName = sc.next();

		boolean flag = false;

		for (Toy toy : toySet) {

			if (toy.getName().equals(toyName)) {
				toySet.remove(toy);
				// Set.remove(Object);
				flag = true;
				break; // java.util.ConcurrentModificationException
				// 1. 효율 향상을 위해 break;
				// 2. 순회중인 컬렉션 객체가 수정되어 충돌한다는 예외 발생
				// -> 예외 방지 및 효율을 위해서 작성
			}

		}

		if (flag) {
			System.out.println("장난감이 삭제되었습니다.");
		} else {
			System.out.println("해당하는 이름의 장난감을 찾을 수 없습니다.");
		}

	}

	/**
	 * 재료 추가하기
	 * 
	 * @throws Exception
	 */
	public void addMaterial() throws Exception {

		System.out.println("\n<재료 추가>");
		System.out.println("---현재 등록된 재료---");

		if (materialMap.isEmpty()) {
			System.out.println("등록된 재료가 없습니다.");
			return;
		}

		for (Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("-------------------------------------");

		System.out.print("재료 고유번호(Key) 입력 : ");
		int key = sc.nextInt();

		System.out.print("재료명 입력 : ");
		String material = sc.next();

		if (materialMap.containsKey(key)) { // materialMap에 이미 존재하는 Key 인지 확인

			System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
			System.out.print("덮어쓰시겠습니까? (Y/N) : ");
			String input = sc.next();

			if (input.equalsIgnoreCase("Y")) {
				// equalsIgnoreCase : 대문자인지 소문자인지 구분하지 않고 문자열 값 자체만 비교
				materialMap.put(key, material); // 같은 key로 추가 시 value 덮어쓰기함
			} else {
				System.out.println("재료 추가가 취소되었습니다.");
			}

		} else {
			materialMap.put(key, material);
			System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
		}

	}

	/**
	 * 재료명으로 재료 삭제하기
	 * 
	 * @throws Exception
	 */
	public void removeMaterialByName() throws Exception {

		System.out.println("\n<재료 삭제>");
		System.out.println("---현재 등록된 재료---");

		if (materialMap.isEmpty()) {
			System.out.println("등록된 재료가 없습니다.");
			return;
		}

		for (Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("-------------------------------------");

		System.out.print("삭제할 재료명 입력 : ");
		String materialName = sc.next();

		boolean flag = false;

		for (Entry<Integer, String> entry : materialMap.entrySet()) {

			if (entry.getValue().equals(materialName)) {
				materialMap.remove(entry.getKey());

				System.out.println("재료 '" + materialName + "' 가 성공적으로 제거되었습니다.");
				flag = true;
				break;
			}

		}

		if (!flag) {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}

	}

	/**
	 * 제조일순으로 장난감 정렬하기
	 * 
	 */
	public void displayToysByManufactureDate() {
		System.out.println("\n<제조일 순으로 장난감을 정렬>");

		if (toySet.isEmpty()) {
			System.out.println("생성된 장난감이 없습니다.");
			return;
		}

		List<Toy> toyList = new ArrayList<Toy>(toySet);

		// 제조일 오름차순으로 정렬하기 위한 Comparator 구현 내부 클래스
		Collections.sort(toyList, new Comparator<Toy>() {
			@Override
			public int compare(Toy o1, Toy o2) {
				// 문자열끼리 비교 compareTo() 사용
				return o1.getManufactureDate().compareTo(o2.getManufactureDate());
			}
		});

		int index = 1;
		for (Toy toy : toyList) {
			System.out.println(index + ". " + toy);
			index++;
		}

	}

	/**
	 * 연령별 사용 가능한 장난감 리스트 조회하기
	 * 
	 */
	public void displayToysByAge() {

		System.out.println("\n<연령별로 사용 가능한 장난감>");

		Map<Integer, List<Toy>> toysByAge = new HashMap<Integer, List<Toy>>();
		// toysByAge라는 이름의 새로운 Map을 생성
		// -> 연령을 key로 지정하고, 해당 연령을 가진 장난감 List를 value 로 가짐
		// { K : V, K : V, K : V... }
		// -> { 5 : ["키시미시", "허기워기"], 8 : ["캣냅", "마미롱레그"] , 12 : ["파피"] }

		for (Toy toy : toySet) {

			int age = toy.getAge(); // 현재 toy 객체가 가진 나이 얻어오기

			// if문에서 boolean containsKey(Key) 대신 사용가능한 로직.
			toysByAge.putIfAbsent(age, new ArrayList<Toy>());
			// putIfAbsent() : Map에서 제공하는 메서드로,
			// 해당 키가 존재하지 않는 경우에만 전달받은 값을 추가함.
			// -> Map에 해당 연령의 리스트가 없는 경우에만 새로운 리스트를 생성하여 추가

			// List<Toy> temp = toysByAge.get(age);
			// temp.add(toy);
			// -> 메서드 체이닝으로 한줄에 작성
			toysByAge.get(age).add(toy);
			// toysByAge.get(age) -> age(K)에 맞는 Value 반환 -> List
			// List.add(toy) -> 전달된 toy 객체를 List에 추가

		}

		/*
		 * toysByAge (Map) : { 5 : ["키시미시", "허기워기"], 8 : ["캣냅", "마미롱레그"] , 12 : ["파피"] }
		 * 
		 * 
		 * toysByAge.entrySet() (Set) :
		 * 
		 * [ {5 : ["키시미시", "허기워기"]}, {8 : ["캣냅", "마미롱레그"]}, {12 : ["파피"] } ]
		 * 
		 * 
		 */
		for (Entry<Integer, List<Toy>> entry : toysByAge.entrySet()) {

			int age = entry.getKey(); // 해당 entry의 key(나이)를 얻어옴
			List<Toy> toyList = entry.getValue(); // 해당 entry의 value(Toy객체가 들어있는 List)를 얻어옴

			System.out.println("[연령 : " + age + "세]");

			int index = 1;
			for (Toy toy : toyList) { // 해당 연령에 대응되는 List를 순회하면서 출력
				System.out.println(index + ". " + toy);
				index++;
			}

		}

	}

}
