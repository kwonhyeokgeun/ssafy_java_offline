package lambda;

public class MyFuncIFImpl implements MyFuncIF{ //implements한 클래스

	@Override
	public int proc1(int n1, int n2) {
		return n1 + n2;
	}
}
