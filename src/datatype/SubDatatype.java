package datatype;

import java.util.Scanner;

public class SubDatatype {
 void primitive() {
	// data type=> primitive data  =>byte,short,int,boolean,long ,float,double,char
			byte age=127;
			System.out.println(age);
			short  pin=23456;
			System.out.println("pin"+pin);
			int number=1234567675;
			System.out.println("number:"+number);
			long phoneno=63768786875L;
			System.out.println("phone:"+phoneno);
			float score=67.898f;
			System.out.println("score:"+score);
			double salary=25000.567845543d;
			System.out.println("salary:"+salary);
			// non numerical
			boolean pass=true;
			System.out.println("pass:"+true);
			char letter='a';
			System.out.println("letter:"+letter);
}
 void nonprimitive() {
	//and non primitive data type=> array,String,class,interface,collection
			String name="anand@123%";
			System.out.println("name:"+name);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your age");
			byte age1=sc.nextByte();
			System.out.println("age:"+age1);
 }
}
