package staticmethod;

public class Staticmain {
	
 static	void staticmethod() {
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		staticmethod();
		Subclass.method();
		
	}

}
