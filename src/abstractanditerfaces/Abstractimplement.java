package abstractanditerfaces;

public class Abstractimplement extends Abstractclass{
private double balance;
private int accountpin;// directly not change
	
// collect data
@Override
	public void Bankimportantdetails(double balance,int accountpin) {
		this.balance=balance;
		this.accountpin=accountpin;
		
		
	}
	
@Override
	public  void hide(double balance, int accountpin) {
		System.out.println("balance:"+this.balance+",accountpin"+this.accountpin);
		System.out.println("do not change balance and accountpin:"+balance+accountpin);
	}
	
}
