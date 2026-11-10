package Exception;

public class Bank {
public void amount(int balance)  throws Maxlimit50000{
	if(balance<500) {
		throw new Minbalance500("min maintaince 500");// runn error
	}
	else if(balance>50000) {
//		try {
		throw new Maxlimit50000("max maintaince 50000 only");
//		}catch (Maxlimit50000 e) {
			// TODO: handle exception
//			System.out.println(e.getMessage());// prevent
//		}
	}
	
	else {
		System.out.println("balance:"+balance);
	}
}

public static void main(String[] args)  {
	Bank bank= new Bank();
	try {
	bank.amount(501);
	}catch(Minbalance500 e) // prevent
	{
		System.out.println(e.getMessage());
	} catch (Maxlimit50000 e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	System.out.println("run...");
	
	try {
		bank.amount(600000);
	} catch (Maxlimit50000 e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	System.out.println("after compile time");
}

}
