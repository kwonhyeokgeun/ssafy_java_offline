package basic.staticc;

public class Test {

	public static void main(String[] args) {
		System.out.println(MyClass.COUNT);
		MyClass mc = new MyClass();
		System.out.println(mc.num);
		System.out.println(mc.COUNT); //가능한데 비권장
		

		MyClass.m2();
		mc.m1();
		mc.m2();
		System.out.println("***");
		System.out.println(MyClass.COUNT);
		System.out.println(mc.COUNT);
		System.out.println(mc.num);
		System.out.println("***");
		MyClass mc2 = new MyClass();
		System.out.println(mc2.COUNT);
		System.out.println(mc2.num);
	}

}
