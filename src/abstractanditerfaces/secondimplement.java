package abstractanditerfaces;

public class secondimplement extends Abstractclass {

	private double balance;
	private int accountpin;
	
	@Override
	public void Bankimportantdetails(double balance, int accountpin) {
		// TODO Auto-generated method stub
		this.balance=balance+1000;
		this.accountpin=accountpin+123;
		
	}

	@Override
	public void hide( double balance,int accountpin) {
		this.balance+=balance;
		this.accountpin+=accountpin;
		// TODO Auto-generated method stub
		System.out.println("balance:"+this.balance+",accountpin:"+this.accountpin);
		
	}

}
