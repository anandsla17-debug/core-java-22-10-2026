package syn_thread;

public class Syn_Thread {

	
	//t1
synchronized void  food() {
	for(int i=0;i<10;i++) {
		
	
	try {
		System.out.println("food"+i);
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
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

public static void main(String[] args) {
	Syn_Thread syn_Thread= new Syn_Thread();
	
	Thread t1= new Thread(()->{
		syn_Thread.food();
	});
	
	Thread t2= new Thread(()->{
		syn_Thread.location();
	});
	
	Thread t3= new Thread(()->{
		syn_Thread.delivered();
	});
	
	t1.start();//1
	t2.start();//2
	t3.start();//3
	syn_Thread.booking();//1
}
	
}
