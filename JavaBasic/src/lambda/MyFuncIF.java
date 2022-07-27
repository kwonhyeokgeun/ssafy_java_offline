package lambda;

@FunctionalInterface  //@FunctionalInterface라는 뜻, 함수 한개만 가질 수 있음
public interface MyFuncIF {
	int proc1(int n1, int n2);  //한개만 가질 수 있음
	default int proc2(int n1, int n2) { //디폴트는 여러개 가능
		return n1-n2;
	}
}
