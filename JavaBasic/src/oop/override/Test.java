package oop.override;

public class Test {

	public static void main(String[] args) {
		{
			/*
			A a = new A();
			B b = new B();
			C c = new C();
			D d = new D();
			System.out.println("*** A ***");
			a.a();
			System.out.println("*** B ***");
			b.a();
			b.a(1);
			b.b();
			System.out.println("*** C ***");
			c.a();
			c.b();
			c.c();
			System.out.println("*** D ***");
			d.a();
			d.a(1);
			d.b();
			d.c();
			d.d();*/
		}
		/*
		A ab = new B();
		ab.a();
		//ab.a(1);  //에러임 즉 메소드 호출 판단은 앞쪽을 보고 판단함.
		
		A ac = new C();
		ac.a();   //C의 것이 출력됨. 일단 호출이 가능하다면 뒤쪽거를 호출함
		//ac.c();  /에러임 c는 A에 없음
		B bc = new C();
		bc.a();  //위와 같이 C의 것이 출력됨.
		
		B bd = new D();
		bd.a(); //C의 것이 호출됨 D는 a가 없고 B에는 상속받아서 있는데 C에도 있어서
		*/
		
		A ab = new B();
		ab.a();
		//ab.a(1);  
		
		A ac = new C();
		ac.a();   
		//ac.c();  
		B bc = new C();
		bc.a();  
		
		B bd = new D();
		bd.a(); 
		
		/*
	  	A ab = new B();
		ab.a();      //A - a()
		//ab.a(1);  //에러
		
		A ac = new C();
		ac.a();   //C - a()
		//ac.c();  /에러
		
		B bc = new C();
		bc.a();  //C - a()
		
		B bd = new D();
		bd.a(); //C - a()
		*/


	}

}
