package abstractanditerfaces;

public class Main {
public static void main(String[] args) {
	Abstractclass a1= new Abstractimplement();
	a1.Bankimportantdetails(10000.00d, 123);
	a1.hide(20000.00d,456);
	
	Abstractclass a2= new secondimplement();
	a2.Bankimportantdetails(1000.00d, 1);
	a2.hide(15000.00d, 3);
	a1.sharedetails(0, "ab3456");
	
	EmployeeAbstract emp=new EmployeeAbstract() {
		@Override
		void employeeoneyear(String amount) {
			System.out.println("amount:"+amount);
		}
	};
	emp.employee("max", "123");
	emp.employeeoneyear("25000");
	
	
	
	
}
}
