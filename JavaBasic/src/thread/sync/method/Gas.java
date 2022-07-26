package thread.sync.method;

public class Gas {
	private int amount;
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public synchronized void consume() {
		if(this.amount>=100) {
			try {
				Thread.sleep(10); //잠시 sleep
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.amount-=100;
			System.out.println("con amount : " + this.amount);
		}
	}
	
	public synchronized void produce() {
		if(this.amount <100) {
			try {
				Thread.sleep(10); //잠시 sleep
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.amount +=100;
			System.out.println("pro amount : " + this.amount);
		}
	}
}
