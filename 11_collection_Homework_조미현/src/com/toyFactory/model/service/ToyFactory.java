package com.toyFactory.model.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(1, 4)));
		toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", addMaterials(1, 2)));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", addMaterials(1, 2)));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", addMaterials(1, 2)));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addMaterials(1, 2, 4)));

	
	}

	
	// 가변인자 : 매개변수의 수가 정확히 몇개인지 특정할 수 없을 때 사용
	// 자료형...변수명
	// 가변인자를 통해 들어온 매개변수의 데이터 타입은 배열!
	
	/** 매개변수로 전달받은 값들을 재료를 저장한 Map에 
	 *  있는지 확인하고 Set형태로 반환하는 메서드
	 * @param materials
	 * @return
	 */
	private Set<String> addMaterials(int...materials) {
		
		// 1. 매개변수로 전달받은 materials 파악하기 == 배열로 정수형 데이터가 여러개 
		//  ex) [1,2,4]
		
		// 2. 재료를 저장하여 반환할 Set객체를 생성
		Set<String> addedMaterials = new HashSet<String>();
		
		// 3. addedMaterials 에 재료명을 추가해야함 
		// -> 단, 재료는 Map에 존재하는 것만 추가 가능
		for(int materialKey : materials) {
			
			// Map에서 재료 고유 번호(Key)에 대응하는 재료명(Value)를 가져와서
			// addedMaterials 추가
			// map에 없는 key를 입력하여 value를 얻어왔을 때 == null
			String materialValue = materialMap.get(materialKey);
			
			if(materialValue != null) {
				// 재료 목록에 해당 키(재료)가 있을 때
				addedMaterials.add(materialValue);
			}
		}
		
		
		return addedMaterials; // [면직물, 플라스틱]
	}
	
	
	
}
