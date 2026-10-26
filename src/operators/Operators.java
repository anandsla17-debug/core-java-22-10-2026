package operators;

import java.util.Scanner;

public class Operators {
	
	
	void add(int a,int b) {
		System.out.println("add:"+(a+b));
		
	}
	void sub(int a,int b) {
		System.out.println("sub:"+(a-b));
		System.out.println("multi:"+a*b);
		System.out.println("div:"+a/b);
		System.out.println("moldules:"+a%b);
		
	}
	// 
	public Operators(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("constructors");
	}
	
public Operators() {
	
}
	public static void main(String[] args) {
		Operators operators= new Operators();
		
		operators.add(10, 10);
		operators.sub(10, 20);
		// assigment =,+=,-=,*=,/=,%=
		// comparsion => == => memory ,.equals()=> content,<=.>=,<,>
		String place="chennai";
		String place1="chennai";
		System.out.println(place==place1);
		String name=new String("max");
		String name1= new String("max");
		System.out.println(name.equals(name1));
		System.out.println(50>=50);
		System.out.println(60<=70);
		
		// assignment
		int mark=50;
		mark=20;
		mark+=50;
		mark-=10;
		mark*=2;
		mark/=2;
		mark%=7;
		mark=25000;
		System.out.println(mark);
		
		//logical operator =>or and not
		int value=12;
		System.out.println("and gate:"+(value<20 && value!=20));
		System.out.println("or gate:"+(value<23 || value<10));
		// bit wise opeartor =>01
		int no1=5;
		int no2=3;
		//8421
		//=>and
		//0101
		//0011
		//0001
		System.out.println(no1&no2);
		//0101=>5
		//0011=3
		//0111=>7
		System.out.println(no1|no2);
		//xor=>^
		//0101=>5
	    //0011=3
		//0110
		System.out.println(no1^no2);
		System.out.println("not bit wise:"+(~-8));
		
		//ternory opearator=>?
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age");
//		int age=sc.nextInt();
		int age =21;
		
		String vote=age>=18?"egible to vote":"not egible to vote";
		System.out.println(vote);
		// increment and decrement
	int data=1;
		System.out.println(" post increment"+data++); //post increment
		System.out.println("result"+data);
		System.out.println("pre increment"+(++data));
		System.out.println("post decrement"+data--);
		System.out.println("result"+data);
		System.out.println("pre decrement"+--data);
		
		
		
		
		
	}
}
