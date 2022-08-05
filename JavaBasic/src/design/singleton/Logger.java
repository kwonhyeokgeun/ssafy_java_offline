package design.singleton;

public class Logger {
	//#3 자신과 동일한 타입의 멤버 변수를 static으로 선언
	private static Logger logger;
	
	//#1 생성자를 private로
	private Logger() {}
	
	//#2 외부에 객체를 한개만 제공하는 메소드 구현
	public static Logger getInstance() {
		if (logger == null)
			logger = new Logger();
		return logger;
	}
	public void log(String message) {
		System.out.println("[LOG] "+ message );
	}
}
