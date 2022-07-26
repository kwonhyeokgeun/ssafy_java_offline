package sleep.interrupt;

public class ThreadTest {

	public static void main(String[] args) throws Exception {
		ConsumerThread c1 = new ConsumerThread(1);
		Thread c2 = new Thread(new ConsumerRunnable(2));
		
		c1.start();
		c2.start();
		
		Thread.sleep(2000); //메인 2초 sleep
		c2.interrupt();  //c2를 깨우기
		
	}

}
