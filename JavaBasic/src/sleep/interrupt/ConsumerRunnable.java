package sleep.interrupt;

public class ConsumerRunnable implements Runnable{

	int num;
	
	public ConsumerRunnable(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		System.out.println("#"+ num+"start");
		for(int i=0; i<1000; i++) {
			System.out.println("#"+num +" : " + i);
			
			if(i==500) { //�� 500�̸� 5�ʰ� sleep�ϱ�
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					System.out.println("interrupted!!!");
					e.printStackTrace();
				}
			}
		}
		System.out.println("#"+ num+"end");
	}
}
