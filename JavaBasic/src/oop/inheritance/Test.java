package oop.inheritance;

public class Test {

	public static void main(String[] args) {
		GrandParent gp = new GrandParent();
		System.out.println(gp.getName());
		
//		Parent p = new Parent();
//		p.setName("�ƹ���");
//		System.out.println(p.getName());
		
		Parent p = new Parent("��Ӵ�");
		System.out.println(p.getName());
		
	}

}
