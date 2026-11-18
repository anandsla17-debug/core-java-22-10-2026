package multithread;

public class Anotherthread  extends Parent implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10;i++) {
			
			try {
				System.out.println("runable loop:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	public void normalloop() {
		for(int i=0; i<40;i++) {
			if(i%5==0) {
				System.out.println("normal loop:"+i);
				
			}
		}
	}
	
	

}
