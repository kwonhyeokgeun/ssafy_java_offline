package oop.override;

import java.io.IOException;

public class Super {
	int m1() {
		System.out.println("Super - m1()");
		return 1;
	}
	B m2() {
		System.out.println("Super - m2()");
		return new B();
	}
	C m3() {
		System.out.println("Super - m3()");
		return new C();
	}
	
	protected void m4() {
		System.out.println("Super - m4()");
	}
	
	void m5() throws IOException{
		System.out.println("Super - m5()");
	}
}
