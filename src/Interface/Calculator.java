package Interface;

public interface Calculator {
	public void add();

 	  String name="max";// default provided => static final
 	
	//=> default
	default void method() {
		
		System.out.println("default method"+name);
	}
	private  void method1() {
		
		System.out.println("private method");
	}
	
	default void call() {
		method1();
	}
	static void method2() {
		
	
		System.out.println("static method");
		
	}
	
	
	public static void main(String[] args) {
		Calculator calculator= new Calculator() {
			
			@Override
			public void add() {
				// TODO Auto-generated method stub
				
			}
		};
		calculator.method();
		calculator.method1();// do not call other class
		Calculator.method2();
		System.out.println(Calculator.name);
	}
}
