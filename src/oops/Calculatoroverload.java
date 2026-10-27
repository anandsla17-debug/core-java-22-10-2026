package oops;

import java.util.Scanner;

public class Calculatoroverload {
	Scanner sc= new Scanner(System.in);
	//same class method name will same => parameter(complied time)
 void calculate(int a,int b) {
	 System.out.println("add:"+(a+b));
 }
 void calculate(double a,double b) {
	 System.out.println("sub:"+(a-b));
 }
 void calculate(double a,int b) {
	 System.out.println("div:"+a/b);
 }
 void calculate() {
	 System.out.println("value1");
	 int a=sc.nextInt();
	 System.out.println("value2");
	 int b=sc.nextInt();
	 System.out.println("muli:"+a*b);
	 
 }
 
 public static void main(String[] args) {
	 Calculatoroverload calculatoroverload=new Calculatoroverload();
			 calculatoroverload.calculate(30.80d, 40.70d);// object find=> overloading
			 calculatoroverload.calculate(20, 10);
			 calculatoroverload.calculate(40.700d,80);
			 calculatoroverload.calculate();
 }
	
}
