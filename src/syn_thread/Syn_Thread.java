package syn_thread;

public class Syn_Thread extends Syn_thread1{

	
	//t1
synchronized void  food() {
	for(int i=0;i<10;i++) {
		
	
	try {
		
		System.err.println("food"+i);
		Thread.sleep(1000);
		
	if(i==0) {
		wait();//
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	try {
		wait();//block
		System.err.println("thread completed1");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}


//t2
synchronized void location() {
	for(int i=0;i<5;i++) {
		
		try {
			System.out.println("location:"+"chennai"+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	try {
		wait();//block
		System.out.println("thread 2 completed");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

//t3
synchronized void delivered() {
	for(int i=0; i<12;i++) {
		
		try {
			System.out.println("food delived"+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	try {
		wait();
		System.out.println("thread 3 completed");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

// normal method
public void  booking() {
	for(int i=0;i<20; i++) {
	
		try {
			System.out.println("booking:"+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//t5
synchronized void realize1() {
	notify();// it will realize first
	
	System.out.println("------------");
}
synchronized void realizeall() {
	notifyAll();// it will relize all thread
}

public static void main(String[] args) {
	Syn_Thread syn_Thread= new Syn_Thread();
//	Syn_thread1 syn_thread1=new Syn_thread1();
	
	Thread t1= new Thread(()->{
		syn_Thread.food();
	});
	
	Thread t2= new Thread(()->{
		syn_Thread.location();
	});
	
	Thread t3= new Thread(()->{
		syn_Thread.delivered();
	});
	Thread t4= new Thread(()->{
//		syn_thread1.parentthread(); without syn
		syn_Thread.parentthread();
	});
//	Thread unlockfirst= new Thread(()->{
//		syn_Thread.realize1();
//	});
	Thread unlockall=new Thread(()->{
		syn_Thread.realizeall();
	});
	t1.start();//1
	t2.start();//2
	t3.start();//3
	
	t4.start();
//	unlockfirst.start();
	unlockall.start();
	syn_Thread.booking();//1
	
	
}
	
}
