package loopandcondition;

import java.util.Scanner;

public class Condition {
	void mark() {
	//=>condition=>if else,if else if..n,switch
		
		// ifelse=>mark => 100 to 91 =>o, 81 to 90=>A+,71 to 80=>A,61 to 70=>b+,50 to 60=>b,0 to 49 => F
Scanner sc= new Scanner(System.in);
System.out.println("Enter your no");

		int mark=sc.nextInt();
		if(mark<=100 && mark>=91) {
			System.out.println("Grade O");
		}else if(mark<=90 && mark>=81) {
			System.out.println("Grade A+");
			
		}else if(mark<=80 && mark>=71) {
			System.out.println("grade A");
		}
		else if(mark<=70 && mark>=61) {
			System.out.println("grade B+");
		}
		else if(mark<=60 && mark>=50) {
			System.out.println("grade b");
		}
		else if(mark>=0 && mark<=49) {
			System.out.println("fail");
		}else {
			System.out.println("invaild no");
		}
		
		// if 100 to 50 =>pass , 49 to 0 => fail
		
		
		if(mark<=100 && mark>=50) {
			System.out.println("pass");
		}else if(mark>=0 && mark<=49){
			System.out.println("fail");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Condition condition= new Condition();
		// switch=> calculator
	int choose=0;
		do {
	Scanner sc= new Scanner(System.in);
	System.out.println("1.add");
	System.out.println("2.sub");
	System.out.println("3.multi");
	System.out.println("4.div");
	System.out.println("0.Exit");
	System.out.print("Enter your option:");
	 choose=sc.nextInt();//user =>1
	int value1=0,value2=0;
	switch(choose) {
	case 1:
		System.out.println("Enter your value 1");
		value1=sc.nextInt();
		System.out.println("Enter your value 2");
		value2=sc.nextInt();
		System.out.println("add:"+(value1+value2));
		int result=value1+value2;
		if(result%2==0) {
			System.out.println("even");
		}else {
			System.err.println("odd");
		}
		break;// completed
	case 2:
		System.out.println("Enter your value1");
		value1=sc.nextInt();
		System.out.println("Enter your value2");
		value2=sc.nextInt();
		System.out.println("sub:"+(value1-value2));
		break;
	default://without given case option
		System.out.println("invalid option=>only give 1,2,3,4");
		break;
	case 3:
		System.out.println("Enter your value 1");
		value1=sc.nextInt();
		System.out.println("Enter your value2");
		value2=sc.nextInt();
		System.out.println("multi:"+value1*value2);
		break;
	case 4:
		System.out.println("Enter your value 1");
		value1=sc.nextInt();
		System.out.println("Enter your value2");
		value2=sc.nextInt();
		System.out.println("div:"+value1/value2);
		break;
	case 0:
		System.out.println("exit...");
		break;
		
		
	}
		}while(choose!=0);
		
		
	}

}
