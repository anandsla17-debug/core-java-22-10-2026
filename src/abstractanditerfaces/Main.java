package abstractanditerfaces;

public class Main {
public static void main(String[] args) {
	Abstractclass a1= new Abstractimplement();
	a1.Bankimportantdetails(10000.00d, 123);
	a1.hide(20000.00d,456);
	
	Abstractclass a2= new secondimplement();
	a2.Bankimportantdetails(1000.00d, 1);
	a2.hide(15000.00d, 3);
}
}
