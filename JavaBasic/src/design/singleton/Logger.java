package design.singleton;

public class Logger {
	//#3 �ڽŰ� ������ Ÿ���� ��� ������ static���� ����
	private static Logger logger;
	
	//#1 �����ڸ� private��
	private Logger() {}
	
	//#2 �ܺο� ��ü�� �Ѱ��� �����ϴ� �޼ҵ� ����
	public static Logger getInstance() {
		if (logger == null)
			logger = new Logger();
		return logger;
	}
	public void log(String message) {
		System.out.println("[LOG] "+ message );
	}
}
