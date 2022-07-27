package lambda;

public class Test {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		{
			//#1. �������̽��� ������ Ŭ������ ��� - MyFuncIFImpl
			//�⺻���̰� �������� ���
			MyFuncIF func = new MyFuncIFImpl();
			int result = func.proc1(n1, n2);
			System.out.println(result); //30
		}
		{
			//#2 �������̽��� ������ �͸� Ŭ������ ��� - MyFuncIFImpl ������
			//implements���� �ʿ��� �ڵ尡 ����ȭ �ǰ� �� �� ���̳����� �ڵ��� ����
			
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
			result = func2.proc2(n1, n2); //��� ȣ�Ⱑ�� �׷��� �������̳� �������� �ƴϴ�.(?)
			System.out.println(result);  //-10
		}
		{
			//#3 lambda first
			//Functional Interface�� ������ ��ü�� ���� '�� ����'�� ȣ���� �� �ִ� ==> �������̴�.
			//lambda�� ���� ������ Functional Interface�� ������ ��ü�θ� ����� �� �ִ�!
			MyFuncIF func = (i, j) -> {return i+j;};  //���ٽ� ǥ��
			//MyFuncIF func = (i, j) -> i+j;  //�����ǹ�
			int result = func.proc1(n1, n2);
			System.out.println(result);
		}
		{
			//#4 lambda second
			MyFuncIF func = (i, j) -> i+j;
			MyFunc.m(func);   //8
		}
		{
			//#5 �̷��� �ִ��� �����ϰ�
			MyFunc.m((i, j) -> i+j);   //8
			MyFunc.m((i, j) -> i-j);   //2 �̷��� �����ϰ� �������� �ٲ����
		}

	}
	static class MyFunc{
		static void m(MyFuncIF func) { //�Ķ���ͷ� Functional Interface�� ������ ��ü�� �޴´�.
			System.out.println( func.proc1(5,3) );
		}
	}

}
