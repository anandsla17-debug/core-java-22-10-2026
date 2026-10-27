package oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sampleclass sampleclass=new Sampleclass();
		System.out.println("add"+sampleclass.add(10, 10));
		System.out.println("add"+sampleclass.add(100, 10));
		Child child=new Child();
		child.findlength("max");
		child.form("max", "password");
		//polymorphism=> method riding=> run time(different) ,methodoverloading=>complier time(same class)
		// abstraction(abstract class half abstract and interface full abstract), and encapsulation.
		
	}

}
