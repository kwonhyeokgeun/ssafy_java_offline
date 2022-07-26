package design.singleton;

public class Test {

	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		logger.log("hello");
		
		Logger logger2 = Logger.getInstance();
		System.out.println(logger == logger2);
		
	}

}
