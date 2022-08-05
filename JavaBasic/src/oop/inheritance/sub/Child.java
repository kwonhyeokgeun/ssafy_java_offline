package oop.inheritance.sub;

import oop.inheritance.Parent;

public class Child extends Parent{
	public Child() {
		super();
		System.out.println(super.name); //디폴트는 다른 패키지면 참조못함
	}

}
