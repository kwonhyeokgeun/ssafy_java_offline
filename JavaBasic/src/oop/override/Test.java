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
		//ab.a(1);  //������ �� �޼ҵ� ȣ�� �Ǵ��� ������ ���� �Ǵ���.
		
		A ac = new C();
		ac.a();   //C�� ���� ��µ�. �ϴ� ȣ���� �����ϴٸ� ���ʰŸ� ȣ����
		//ac.c();  /������ c�� A�� ����
		B bc = new C();
		bc.a();  //���� ���� C�� ���� ��µ�.
		
		B bd = new D();
		bd.a(); //C�� ���� ȣ��� D�� a�� ���� B���� ��ӹ޾Ƽ� �ִµ� C���� �־
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
		//ab.a(1);  //����
		
		A ac = new C();
		ac.a();   //C - a()
		//ac.c();  /����
		
		B bc = new C();
		bc.a();  //C - a()
		
		B bd = new D();
		bd.a(); //C - a()
		*/


	}

}
