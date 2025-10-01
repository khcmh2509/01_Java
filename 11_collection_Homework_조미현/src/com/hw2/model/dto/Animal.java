package com.hw2.model.dto;

public abstract class Animal {
	
	protected String name;
	
	public Animal() {}

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public abstract void sound();
}
