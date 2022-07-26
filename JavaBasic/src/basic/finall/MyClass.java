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
//		n2=30;  //파이널 변수수정 에러
		
		final int[] arr= {1,2,3};
		int[] arr2 = {1,2,3};
		int[] arr3 = new int[]{2,3,4};

		
//		arr = {2,3,4}; //파이널도 에러
//		arr2 = {2,3,4};  //파이널 아니어도 에러, Array Constant임
		 //이건 에러아님
	}

}
final class FinalClass{ //더이상 상속 허락 안함
	
}

class SubClass extends MyClass{
	void m1() {
		
	}
//	void m2() {} //파이널 메소드 오버라이딩 에러
	
}