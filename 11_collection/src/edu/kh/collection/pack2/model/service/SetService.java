package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import edu.kh.collection.pack2.model.dto.Person;

public class SetService {

	/* Set(집합, 주머니)
	 * - 기본적으로 순서를 유지하지 않음
	 *   (index 없음!)
	 *   
	 * - 중복 데이터 저장 X
	 * 
	 * Set 인터페이스의 자식 클래스
	 * 1. HashSet(대표) : 처리 속도가 빠른 Set
	 * 2. LinkedHashSet : 순서를 유지하는 Set
	 * 3. TreeSet : 자동 정렬되는 Set
	 * 
	 * */
	
	public void method1() {
		// HashSet 객체 생성
		Set<String> set = new HashSet<>();
		
		// 1. boolean add(E e) : 추가
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		
		System.out.println( set );
		
		// 중복 저장 확인 -> 중복 저장 X 확인
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		
		System.out.println( set );
		
		// null 도 중복 X 확인
		set.add(null); 
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		// TreeSet은 null 저장 지원 안함 
		// (자동정렬을 위해 내부적으로 compareTo() 라는 메서드 이용 시
		// NullPointerException 발생하기 때문 )
		
		System.out.println( set );
		
		// 2. int size() : Set에 저장된 객체의 수 반환
		System.out.println( "set의 size() : " + set.size() );
		
		// 3. boolean remove(E e) : 
		// 전달받은 인자 e를 Set에서 제거
		// 제거 성공 true, 없으면 false
		System.out.println( set.remove("배달의민족") );
		System.out.println( set );
		System.out.println( set.remove("유플러스") );
		
		// 4. boolean contains(E e) : 
		// 전달받은 e가 Set에 있으면 true, 없으면 false
		System.out.println( "쿠팡 있는지 검사 : " + set.contains("쿠팡") );
		System.out.println( "삼성 있는지 검사 : " + set.contains("삼성") );
		
		// 5. void clear() : Set에 있는 내용을 모두 삭제
		set.clear();
		
		// 6. boolean isEmpty() : 비어있으면 true, 아니면 false
		System.out.println( set.isEmpty() );
		System.out.println( set );
		
	}
	
	
	/**
	 * Set에 저장된 요소(객체)를 꺼내는 방법
	 * 
	 * 1. Iterator(반복자) 이용
	 * 2. List 로 변환
	 * 3. 향상된 for문 이용
	 * 
	 */
	public void method2() {
		
		Set<String> set = new HashSet<>();
		
		set.add("몽쉘");
		set.add("꼬북칩");
		set.add("쿠쿠다스");
		set.add("빈츠");
		set.add("포카칩");
		
		// 1. Iterator(반복자)
		// - 컬렉션 객체에 저장된 요소를
		// 	하나씩 순차 접근하는 객체
		System.out.println("[Iterator 이용방법]");
		// Iterator set.iterator() : 
		// - 현재 Set 을 순차접근 할 수 있는 Iterator 객체 반환
		Iterator<String> it = set.iterator();
		
		// boolean Iterator.hasNext() : 
		// 다음 순차 접근할 요소가 있으면 true, 없으면 false
		while(it.hasNext()) {
			// 다음 요소가 있으면 반복, 없으면 멈춤
			
			// E Iterator.next() : 다음 요소를 꺼내와 반환
			String temp = it.next();
			System.out.println( temp );
		}
		
		System.out.println("---------------------------");
		
		System.out.println("[List로 변환]");
		
		// Set에 저장된 객체를 이용해서 List를 생성
		List<String> list = new ArrayList<>(set);
		// Set -> List로 변환
		
		// 일반 for문
		for(int i = 0; i < list.size(); i++) {
			System.out.println( list.get(i) );
		}
		
		System.out.println("---------------------------");
		
		System.out.println("[향상된 for문 이용]");
		
		for(String snack : set) {
			System.out.println( snack );
		}
		
		
		
	}
	
	
	/**
	 * 직접 만든 클래스(Person)를 이용해 만든 객체를
	 * Set에 저장 (중복 제거 확인)
	 */
	public void method3() {
		
		// *******************************************
		// Hash 라는 단어가 포함된 컬렉션 이용 시
		// hashCode(), equals() 오버라이딩 필수적으로 진행되어야 함!!!
		// *******************************************
		
		Person p1 = new Person("홍길동", 25, '남');
		Person p2 = new Person("홍길동", 25, '남');
		Person p3 = new Person("홍길동", 30, '남');
		Person p4 = new Person("김길순", 20, '여');
		
		// Set 객체 생성 후 p1 ~ p4 추가
		Set<Person> personSet = new HashSet<Person>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		
		for(Person p : personSet) {
			System.out.println(p);
		}
		
		// - 같은 필드 값을 가진 객체는 해시코드 번호가 같다!
		System.out.println("p1 : " + p1.hashCode());
		System.out.println("p2 : " + p2.hashCode());
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());
		
		// - A.equals(B) : A와 B가 가지고있는 필드값이 전부 같으면 true
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		
		
	}
	
	
	
	
	
	
	
}
