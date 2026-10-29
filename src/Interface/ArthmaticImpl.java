package Interface;

import java.util.Scanner;

public class ArthmaticImpl implements Calculator,SubInterface{
Scanner sc= new Scanner(System.in);
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Enter your value a");
		int a= sc.nextInt();
		System.out.println("Enter Your value b");
		int b=sc.nextInt();
		
		System.out.println("add:"+(a+b));
		
	}
	@Override
public void sub() {
		System.out.println("Enter your value a");
		int a= sc.nextInt();
		System.out.println("Enter Your value b");
		int b=sc.nextInt();
		System.out.println("sub:"+(a-b));
}
	
}
