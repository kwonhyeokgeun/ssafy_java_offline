package lambda;

@FunctionalInterface  //@FunctionalInterface��� ��, �Լ� �Ѱ��� ���� �� ����
public interface MyFuncIF {
	int proc1(int n1, int n2);  //�Ѱ��� ���� �� ����
	default int proc2(int n1, int n2) { //����Ʈ�� ������ ����
		return n1-n2;
	}
}
