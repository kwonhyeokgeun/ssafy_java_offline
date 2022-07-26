package java5.generic.method;

public class GenricMethod {
	public static <P>void m1(P p) {
		System.out.println(p);
	}
	
	public static <R> R m2(Class<R> type) {
		return type.cast(m4());
	}
	
	public static String m3() {
		return "Hello";
	}
	public static Integer m4() {
		return 20;
	}
	public static <R,P> R m5(P p, Class<R> type) {
		System.out.println(p);
		return type.cast(m4());
	}
	
	public static void main(String[] args) {
		m1(10);
		m1("Hello");
		
		System.out.println( m2(Integer.class) );
	}
}
