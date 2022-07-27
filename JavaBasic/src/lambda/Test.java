package lambda;

public class Test {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		{
			//#1. 인터페이스를 구현한 클래스를 사용 - MyFuncIFImpl
			//기본적이고 고전적인 방식
			MyFuncIF func = new MyFuncIFImpl();
			int result = func.proc1(n1, n2);
			System.out.println(result); //30
		}
		{
			//#2 인터페이스를 구현한 익명 클래스를 사용 - MyFuncIFImpl 사용안함
			//implements해줄 필요없어서 코드가 간소화 되고 좀 더 다이나믹한 코딩이 가능
			
			MyFuncIF2 func2 = new MyFuncIF2() {
				@Override
				public int proc1(int n1, int n2) {
					return n1+n2;
				}

				@Override
				public int proc2(int n1, int n2) {
					return n1-n2;
				}
				
			};
			int result = func2.proc1(n1, n2);
			System.out.println(result);  //30
			result = func2.proc2(n1, n2); //모두 호출가능 그래서 선택적이나 결정적이 아니다.(?)
			System.out.println(result);  //-10
		}
		{
			//#3 lambda first
			//Functional Interface를 구현한 객체는 오직 '한 가지'만 호출할 수 있다 ==> 결정적이다.
			//lambda는 전제 조건이 Functional Interface를 구현한 객체로만 사용할 수 있다!
			MyFuncIF func = (i, j) -> {return i+j;};  //람다식 표현
			//MyFuncIF func = (i, j) -> i+j;  //같은의미
			int result = func.proc1(n1, n2);
			System.out.println(result);
		}
		{
			//#4 lambda second
			MyFuncIF func = (i, j) -> i+j;
			MyFunc.m(func);   //8
		}
		{
			//#5 이렇게 최대한 간단하게
			MyFunc.m((i, j) -> i+j);   //8
			MyFunc.m((i, j) -> i-j);   //2 이렇게 간단하게 뺄셈으로 바꿔버림
		}

	}
	static class MyFunc{
		static void m(MyFuncIF func) { //파라미터로 Functional Interface를 구현한 객체를 받는다.
			System.out.println( func.proc1(5,3) );
		}
	}

}
