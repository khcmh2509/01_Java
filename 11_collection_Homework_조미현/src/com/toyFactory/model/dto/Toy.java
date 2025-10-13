package com.toyFactory.model.dto;

import java.util.Objects;
import java.util.Set;

public class Toy {

	// 필드
	private String name; // 장난감 이름
	private int age; // 사용 가능 연령
	private int price; // 가격
	private String color; // 색상
	private String manufactureDate; // 제조일(문자열로 표현- 20240925)
	private Set<String> materials; // 재료(중복되지 않는 값으로 저장)

	// 메서드
	public Toy() {}

	public Toy(String name, int age, int price, String color, String manufactureDate, Set<String> materials) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.manufactureDate = manufactureDate;
		this.materials = materials;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Set<String> getMaterials() {
		return materials;
	}

	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, color, manufactureDate, materials, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color)
				&& Objects.equals(manufactureDate, other.manufactureDate) && Objects.equals(materials, other.materials)
				&& Objects.equals(name, other.name) && price == other.price;
	}
	
	/** 아래 toString() 에서 재료명 표기 시 사용함
	 * materials 안에 있는 모든 재료를 문자열 형태로 만들어 반환하는 메서드
	 * @return
	 */
	public String getMaterialsAsString() {
		StringBuilder sb = new StringBuilder(); // 가변 문자열 객체(비동기)
		
		if(materials.size() == 0) {
			return "없음";
		}
		
		//  ex )   [고무, 면직물]
		// 재료가 있다면 materials 순회하면서 재료 하나하나 , 로 구분하여 문자열 만들기
		for(String material : materials) {
			sb.append(material).append(", "); // 문자열 뒤에 이어쓰기
		}
		
		// ex)   "고무, 면직물, "
		
		// 만들어진 문자열의 마지막 쉼표와 공백 제거하기
		sb.setLength(sb.length() - 2);
		
		return sb.toString();
		
	}


	@Override
	public String toString() {
		return String.format("이름 : %s / 가격 : %d / 색상 : %s / 사용가능연령 : %d "
				+ "/ 제조년월일 : %s / 재료 : %s", 
				name, price, color, age, manufactureDate, getMaterialsAsString()
				);
	}

}
