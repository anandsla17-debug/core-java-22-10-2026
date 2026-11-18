package multithread;

public class Parent {

	public void evenno() {
		for(int i=0;i<10;i++) {
			if(i%2==0) {
			
			try {
				System.out.println("even no:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
}
