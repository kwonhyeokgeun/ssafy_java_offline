package lambda;

public class LambdaExpressionTest {
	public static void main(String[] args) {
		useFuncIF.exec1(() -> {      //�Ķ���ͷ� FuncIF1�� ������ ��ü�� �����.
			System.out.println("Hello");  
		});
		
		useFuncIF.exec1(() -> {      //�̷��� ���Ӱ� ��� ����
			System.out.println("SSAFY");  
		});
		
		useFuncIF.exec2(() -> {      
			return 10;  
		});
		useFuncIF.exec2(() -> 20);
		
		useFuncIF.exec2(() -> {
			int n1=10, n2=20;
			return n1+n2;  
		});
		
		useFuncIF.exec2(() -> sm1());  //�̷��Ե� ����
		
//		useFuncIF.exec3((n) -> "Hello");
//		useFuncIF.exec3(n -> "Hello"); //�Ķ���Ͱ� 1���� ()���ص� ��
//		useFuncIF.exec3(n -> {
//			if(n%2==0) return "¦���Դϴ�";
//			else return "Ȧ���Դϴ�";
//		});
//		
//		useFuncIF.exec4((n1,n2) -> n1+n2); 
		useFuncIF.exec4(20, 30,(n1,n2) -> n1+n2); 
		
		useFuncIF.exec5(new MyClass(7,2), new MyClass(3,9), (mc1,mc2)->
			mc1.y > mc2.y ?  mc1 :  mc2
		);
	}
	
	//�������� �Ʒ��� interface�� ������ ��ü�� �ʿ�� �Ѵ�.
	static interface FuncIF1{ void m();}  //�Ķ���� x, ���� x
	static interface FuncIF2{ int m();}  //�Ķ���� x, ���� int
	static interface FuncIF3{ String m(int n);}  //�Ķ���� o, ���� String
	static interface FuncIF4{ int m(int n1, int n2);}  //�Ķ���� 2��, ���� int
	static interface FuncIF5{ MyClass m(MyClass mc1, MyClass mc2);}
	
	static int sm1() { return 1;}
	
	//�� �༮�� ������. (�����)
	static class useFuncIF{
		public static void exec1(FuncIF1 funcIFImpl) {
			funcIFImpl.m();
		}
		
		public static void exec2(FuncIF2 funcIFImpl) {
			System.out.println(funcIFImpl.m());  //���ϰ�� ���
		}
		public static void exec3(FuncIF3 funcIFImpl) {
			System.out.println(funcIFImpl.m(5));  //���ϰ�� ���
		}
		public static void exec4(FuncIF4 funcIFImpl) {
			System.out.println(funcIFImpl.m(7,2));  //���ϰ�� ���
		}
		public static void exec4(int n1, int n2, FuncIF4 funcIFImpl) {
			System.out.println(funcIFImpl.m(n1, n2));  //���ϰ�� ���
		}
		public static void exec5(MyClass mc1, MyClass mc2, FuncIF5 funcIFImpl) {
			System.out.println(funcIFImpl.m(mc1, mc2));  //���ϰ�� ���
		}
	}
	
	static class MyClass{
		int x,y;
		
		public MyClass(int y, int x) {
			this.y=y;
			this.x=x;
		}

		@Override
		public String toString() {
			return "MyClass [x=" + x + ", y=" + y + "]";
		}
	}
}
