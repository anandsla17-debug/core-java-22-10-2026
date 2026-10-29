package Interface;

import java.util.Scanner;

public class Impl2  implements Calculator{
Scanner sc= new Scanner(System.in);

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Enter your string 1");
		String a=sc.nextLine();
		System.out.println("Enter your String 2");
		String b=sc.nextLine();
		System.out.println("String:"+a+b);
		
	}

}
