package oop.override;

import java.io.FileNotFoundException;

public class Sub extends Super{
	double m1() {
		System.out.println("Sub - m1()");
		return 1.0;
	}
	C m2() {
		System.out.println("Sub - m2()");
		return new C();
	}
	A m3() {
		System.out.println("Sub - m3()");
		return new A();
	}
	
	void m4() {
		System.out.println("Sub - m4()");
	}
	
	void m5() throws FileNotFoundException{
		System.out.println("Sub - m5()");
	}
}
