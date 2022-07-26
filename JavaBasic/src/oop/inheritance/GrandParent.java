package oop.inheritance;

public class GrandParent {
	String name = "할아버지";
	private int age;
	
	public GrandParent() {}
	public GrandParent(String name) {
		this.name=name;
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

}
