package basic.finall;

public class MyClass {
	void m1() {
	}
	final void m2() {
	}
	void m3() {
		int n1=10;
		final int n2=20;
		n1=20;
//		n2=30;  //���̳� �������� ����
		
		final int[] arr= {1,2,3};
		int[] arr2 = {1,2,3};
		int[] arr3 = new int[]{2,3,4};

		
//		arr = {2,3,4}; //���̳ε� ����
//		arr2 = {2,3,4};  //���̳� �ƴϾ ����, Array Constant��
		 //�̰� �����ƴ�
	}

}
final class FinalClass{ //���̻� ��� ��� ����
	
}

class SubClass extends MyClass{
	void m1() {
		
	}
//	void m2() {} //���̳� �޼ҵ� �������̵� ����
	
}