package thread.sleep;

public class ThreadTest {

	public static void main(String[] args) {
		ConsumerThread c1 = new ConsumerThread(1);
		Thread c2 = new Thread(new ConsumerRunnable(2));
		
		c1.start();
		c2.start();
		
	}

}
