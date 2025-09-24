package edu.kh.oop.practice.model.vo;

public class Book {
	
	// 필드
	private String title; // 도서명
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자
	
	public Book() {} // 기본생성자

	public Book(String title, int price, 
			double discountRate, String author) {
		
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return title + " / " + price + " / " 
				+ discountRate + " / " + author;
	}
	
	
	
	
}
