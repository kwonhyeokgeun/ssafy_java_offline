package exception.custom;

public class EmpException extends Exception{
	private static final long serialVersionUID = 1L;
	
	String exCode; //1-없는 번호, 2-휴가 일수가 5일 초과, 3-사번이 올바르지 않다.
	
	public EmpException() {	}
	public EmpException(String message) {
		super(message);
	}
	public EmpException(String exCode, String message) {
		super(message);
		this.exCode = exCode;
	}
}
