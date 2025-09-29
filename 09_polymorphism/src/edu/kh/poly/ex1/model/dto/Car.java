package edu.kh.poly.ex1.model.dto;

public class Car /*extends Object*/{
	// 속성
	private String engine; 	// 엔진
	private String fuel; 	// 연료
	private int wheel; 		// 바퀴갯수
	
	// 기능(메서드 + 생성자)
	public Car() {}

	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	// Object.toString() 오버라이딩
	// 오버라이딩?
	// -> 부모클래스에서 정의된 메서드를 자식클래스가 재정의하는 것.
	@Override
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
	}
	
	
}
