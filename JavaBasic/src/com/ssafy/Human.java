package com.ssafy;

public class Human {
	private String name;
	private int age;
	private boolean is_man;
	
	public Human(String name) {
		this.name=name;
	}
	private Human(String name, int age) {
		this(name);
		this.age=age;
	}
	public Human(String name, int age, boolean is_man) {
		this(name,age);
		this.is_man=is_man;
	}
	
}
