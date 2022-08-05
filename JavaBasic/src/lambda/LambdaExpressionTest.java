package lambda;

public class LambdaExpressionTest {
	public static void main(String[] args) {
		useFuncIF.exec1(() -> {      //파라미터로 FuncIF1을 구현한 객체가 오면됨.
			System.out.println("Hello");  
		});
		
		useFuncIF.exec1(() -> {      //이렇게 새롭게 사용 가능
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
		
		useFuncIF.exec2(() -> sm1());  //이렇게도 가능
		
//		useFuncIF.exec3((n) -> "Hello");
//		useFuncIF.exec3(n -> "Hello"); //파라미터가 1개면 ()안해도 됨
//		useFuncIF.exec3(n -> {
//			if(n%2==0) return "짝수입니다";
//			else return "홀수입니다";
//		});
//		
//		useFuncIF.exec4((n1,n2) -> n1+n2); 
		useFuncIF.exec4(20, 30,(n1,n2) -> n1+n2); 
		
		useFuncIF.exec5(new MyClass(7,2), new MyClass(3,9), (mc1,mc2)->
			mc1.y > mc2.y ?  mc1 :  mc2
		);
	}
	
	//누군가가 아래의 interface를 구현한 객체를 필요로 한다.
	static interface FuncIF1{ void m();}  //파라미터 x, 리턴 x
	static interface FuncIF2{ int m();}  //파라미터 x, 리턴 int
	static interface FuncIF3{ String m(int n);}  //파라미터 o, 리턴 String
	static interface FuncIF4{ int m(int n1, int n2);}  //파라미터 2개, 리턴 int
	static interface FuncIF5{ MyClass m(MyClass mc1, MyClass mc2);}
	
	static int sm1() { return 1;}
	
	//이 녀석이 구현함. (사용자)
	static class useFuncIF{
		public static void exec1(FuncIF1 funcIFImpl) {
			funcIFImpl.m();
		}
		
		public static void exec2(FuncIF2 funcIFImpl) {
			System.out.println(funcIFImpl.m());  //리턴결과 출력
		}
		public static void exec3(FuncIF3 funcIFImpl) {
			System.out.println(funcIFImpl.m(5));  //리턴결과 출력
		}
		public static void exec4(FuncIF4 funcIFImpl) {
			System.out.println(funcIFImpl.m(7,2));  //리턴결과 출력
		}
		public static void exec4(int n1, int n2, FuncIF4 funcIFImpl) {
			System.out.println(funcIFImpl.m(n1, n2));  //리턴결과 출력
		}
		public static void exec5(MyClass mc1, MyClass mc2, FuncIF5 funcIFImpl) {
			System.out.println(funcIFImpl.m(mc1, mc2));  //리턴결과 출력
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
