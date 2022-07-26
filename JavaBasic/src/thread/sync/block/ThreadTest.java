package thread.sync.block;

public class ThreadTest {

	public static void main(String[] args) {
		Gas gas = new Gas();
		gas.setAmount(100);
		
		for(int i=0; i<1000; i++) {  //1000°³ÀÇ ct¿Í pt run
			ConsumerThread ct = new ConsumerThread(gas);
			ProducerThread pt = new ProducerThread(gas);
			
			ct.start();
			pt.start();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(gas.getAmount());
	}

}
