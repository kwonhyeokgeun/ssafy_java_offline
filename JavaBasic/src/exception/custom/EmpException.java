package exception.custom;

public class EmpException extends Exception{
	private static final long serialVersionUID = 1L;
	
	String exCode; //1-���� ��ȣ, 2-�ް� �ϼ��� 5�� �ʰ�, 3-����� �ùٸ��� �ʴ�.
	
	public EmpException() {	}
	public EmpException(String message) {
		super(message);
	}
	public EmpException(String exCode, String message) {
		super(message);
		this.exCode = exCode;
	}
}
