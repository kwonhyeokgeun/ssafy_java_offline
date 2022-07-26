package oop.poly;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		m(a); 
		System.out.println();
		m(b); 
		System.out.println();
		m(c); 
		System.out.println();
		m(d); 	         //������ �Ǵ� ���� Ÿ������ �����
		System.out.println();
		
		B bd = new D();  //�Ķ���ͷ� ���� �� Ÿ���� ������ ����
		m(bd); 
		System.out.println();
		C cd = new D();
		m(cd); 
		System.out.println();
		
		
		m2(a);
		m2(b);
		m2(c);
		m2(d);
		
	}
	
	static void m2(A a) {
		if(a instanceof D) {
			System.out.println("D ��ü");
		}else if(a instanceof C) {
			System.out.println("C ��ü");
		}else if(a instanceof B) {
			System.out.println("B ��ü");
		}else if(a instanceof A) {
			System.out.println("A ��ü");
		}
	}

	static void m(A a) {
		System.out.println("A a !!");
		a.a();
	}
	
	static void m(C c) {
		System.out.println("C c !!");
		c.a();
	}
}
