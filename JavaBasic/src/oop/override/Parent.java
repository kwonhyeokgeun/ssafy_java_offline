package oop.override;

public class Parent {
	void m1() {
		System.out.println("Parent - m1()");

	}
	void m2() {
		System.out.println("Parent - m2()");
		m2();
	}
}
