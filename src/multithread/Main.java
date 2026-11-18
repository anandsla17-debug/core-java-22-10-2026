package multithread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multithread multithread= new Multithread();
		multithread.start();//thread 1
		multithread.loop();//1
		System.out.println("thank you");//2
		System.out.println("---------------------------");
		Anotherthread anotherthread= new Anotherthread();
		Thread thread=new Thread(anotherthread);
		thread.start();// thread
		anotherthread.evenno();//normal 
		anotherthread.normalloop();//normal
	}

}
