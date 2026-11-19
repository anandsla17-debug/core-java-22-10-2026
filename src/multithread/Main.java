package multithread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Multithread multithread= new Multithread();
		multithread.start();//thread 1
		
		
		
		System.out.println("---------------------------");
		Anotherthread anotherthread= new Anotherthread();
		Thread thread=new Thread(anotherthread);
		thread.start();// thread
		multithread.loop();//1
	
		System.out.println("t1"+multithread.isAlive());
		System.out.println("t2:"+thread.isAlive());
		if(multithread.isAlive()) {
			System.out.println("first thread is alive");
			
		} else {
			System.out.println("first thread not alive ");
		}
		
		if(thread.isAlive()) {
			System.out.println("second thread  is alive");
		}else {
			System.out.println("second thread is not alive");
		}
		
	System.out.println("thank you");//2
		anotherthread.evenno();//normal 
		thread.join();
	anotherthread.normalloop();//normal
	}

}
