package Interface;

public class Main {
	
  static	String data="arun";
public static void main(String[] args) {
//	Calculator calculator=new ArthmaticImpl();
//	calculator.add();
//	SubInterface subInterface=new ArthmaticImpl();
//	subInterface.sub();
	
	Calculator calculator2= new Impl2();
//	calculator2.add();
	 calculator2.method();
	 Calculator.method2();
	 calculator2.call();
	 System.out.println(Calculator.name);
	Main m =new Main();
	m.data="kumar";
//	System.out.println(m.data);// not need
	System.out.println(Main.data);
}
}
