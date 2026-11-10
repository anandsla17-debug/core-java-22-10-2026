package Exception;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		// runtime exception
		System.out.println("runtime exception");
		
		try {
		int a=10,b=0;
		System.out.println(a/b);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("end...");
		
		try {
		String data=null;
		System.out.println(data.length());
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		try {
		String name="max";
		System.out.println(name.charAt(3));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		int[] number= {10,20,30};
		System.out.println(number[6]);
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			System.out.println("array execution is completed");
		}
		
		try {
		String a="10a";
		
		int no=Integer.valueOf(a);
		System.out.println(no);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		// compile time exception
	      try {
			Thread.sleep(2000);
			System.out.println("start method");
		} catch (InterruptedException e) {
			
			System.out.println(e.getMessage());
		}
		

	}
	
	
	
	
	
	
	

}
