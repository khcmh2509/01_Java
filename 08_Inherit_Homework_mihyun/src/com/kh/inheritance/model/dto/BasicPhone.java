package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone{
	
	private boolean hasPhysicalKeyboard; // 물리적키보드유무
	
	public BasicPhone() {}

	public BasicPhone(String brand, String model, int year, 
				int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}

	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}

	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	public void checkKeyboard() {
		
		if(hasPhysicalKeyboard) { // 물리적키보드가 존재
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
			
		} else { // 물리적키보드가 존재하지 않음
			System.out.println("이 휴대폰은 물리적 키보드가 없습니다.");
			
		}
		
	}
	
	
	
}
