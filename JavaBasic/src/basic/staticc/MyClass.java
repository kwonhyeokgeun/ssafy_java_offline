package basic.staticc;

public class MyClass {
	static int COUNT=10;
	int num=0;
	static {
		System.out.println("static initializer1 !!");
	}
	

	void m1() {
		System.out.println("m1");
		COUNT++;
		num++;
	}
	
	static {
		System.out.println("static initializer2 !!");
	}
	static void m2() {
		System.out.println("m2");
		COUNT++;
	}
}
