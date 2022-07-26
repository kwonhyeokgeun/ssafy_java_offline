package java5.generic.wildcard;

public class WildCard {

	public static void main(String[] args) {
		GenericType<?> gt1 = new GenericType<>();
		GenericType<?> gt2 = new GenericType<Object>();
		GenericType<?> gt3 = new GenericType<String>();
		
		GenericType<? extends B> gt4 = new GenericType<C>(); //B�� ��ӹ��� C
		//GenericType<? extends B> gt4 = new GenericType<A>(); //������
		GenericType<? super B> gt5 = new GenericType<A>(); //B�� �θ� A
		
		m1( new GenericType<Object>() );
		m1( new GenericType<C>() );
		
		m2( new GenericType<C>());
		//m2( new GenericType<A>()); //����
		m3( new GenericType<A>()); 
		//m3( new GenericType<C>()); //����
		
	}

	
	static class GenericType<T>{
		T t;
	}
	static class A{}
	static class B extends A{}
	static class C extends B{}
	
	static void m1(GenericType<?> p) {}
	static void m2(GenericType<? extends B> p) {}
	static void m3(GenericType<? super B> p) {}
}
