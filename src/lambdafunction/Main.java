package lambdafunction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Functioninterface functionalInterface=()->{
			System.out.println("check");
		};
		functionalInterface.method();
		
		Functioninterface display=()->System.out.println("display interface");
		display.method();
		Calculator add=(int a,int b)->a+b;
		
		
	System.out.println(	add.mathoperator(20,30));
		Calculator sub=(int a,int b)->{
			return a-b;
		};
		System.out.println(sub.mathoperator(10, 20));

	}
	
	

}
