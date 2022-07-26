package oop.inheritance;

public class Test {

	public static void main(String[] args) {
		GrandParent gp = new GrandParent();
		System.out.println(gp.getName());
		
//		Parent p = new Parent();
//		p.setName("아버지");
//		System.out.println(p.getName());
		
		Parent p = new Parent("어머니");
		System.out.println(p.getName());
		
	}

}
