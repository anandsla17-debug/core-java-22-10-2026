package multithread;

public class Multithread extends Thread{

	// normal method =>delay =>>1s
	public void loop() {
		for(int i=0;i<10;i++) {
			
			try {
				System.out.println("loop:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// =>create thread use run method
	public void run() {
		for(int i=0;i<15;i++) {
			
			try {
				System.out.println("thread:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("thread completed");
	}
	
}
