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
		//polymorphism=> method riding=> ,methodoverloading=>
		// abstraction(abstract class half abstract and interface full abstract), and encapsulation.
		
	}

}
