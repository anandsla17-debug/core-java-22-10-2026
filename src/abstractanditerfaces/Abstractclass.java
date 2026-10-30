package abstractanditerfaces;

// important => declare
public abstract class Abstractclass {
public Abstractclass() {
	// TODO Auto-generated constructor stub
	System.out.println("hello");
}
	//declared
	abstract public void Bankimportantdetails(double balance,int accountpin);
	abstract public  void hide(double balance,int accountpin) ; //=>implement
	
	//defined
	public void sharedetails(long accno,String ifsc) {
		System.out.println("accno:"+accno+",ifsc:"+ifsc);
	}
}
