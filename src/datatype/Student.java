package datatype;

import java.util.Scanner;

public class Student {
Scanner sc=new Scanner(System.in);
	void studentrecord() {
	System.out.println("⭐⭐⭐--Student Record--⭐⭐⭐");
	System.out.println("Enter your Student Id");
	int id=sc.nextInt();
	sc.nextLine();
    System.out.println("Enter your Student name");
    String name=sc.nextLine();
    System.out.println("Enter your age");
    byte age=sc.nextByte();
    sc.nextLine();
    System.out.println("Enter your feedback date");
    String date=sc.nextLine();
    System.out.println("Enter your feedback");
    String feedback=sc.nextLine();
    System.out.println("id:"+id+",name:"+name+",age:"+age+",date:"+date+",feedback:"+feedback);
    
	}
	public static void main(String[] args) {
		Student student= new Student();
		student.studentrecord();
	}
}
