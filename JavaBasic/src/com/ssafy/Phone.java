package com.ssafy;

public class Phone {
	private String name = "Galaxy S22";
	private char color;
	private int price;

	public Phone() {
	}
	
	public Phone(String name) {
		System.out.println("1");
		this.name=name;
	}
	
	public Phone(String name, char color) {
		//this.name=name;
		this(name);
		System.out.println(2);
		this.color=color;
	}
	
	public Phone(String name, char color, int price) {
		//this.name=name;
		this(name,color);
		System.out.println(3);
		this.price=price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Phone [name=" + name + ", color=" + color + ", price=" + price + "]";
	}

	public int getRealDebt() {
		return 1000;
	}
	public int getSalePrice() {
		if(color=='A') 
			return price;	
		return price+this.getDefaultPrice();
	}
	private int getDefaultPrice() {
		return 2000;
	}
}
