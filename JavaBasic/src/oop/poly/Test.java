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
		m(d); 	         //동일한 또는 상위 타입으로 실행됨
		System.out.println();
		
		B bd = new D();  //파라미터로 전달 시 타입은 왼쪽을 기준
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
			System.out.println("D 객체");
		}else if(a instanceof C) {
			System.out.println("C 객체");
		}else if(a instanceof B) {
			System.out.println("B 객체");
		}else if(a instanceof A) {
			System.out.println("A 객체");
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
