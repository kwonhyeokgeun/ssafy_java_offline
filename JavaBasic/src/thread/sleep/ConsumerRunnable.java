package thread.sleep;

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
			
			if(i==500) { //�� 500�̸� 1�ʰ� sleep�ϱ�
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("#"+ num+"end");
	}
}
