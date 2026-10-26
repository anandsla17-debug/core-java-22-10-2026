package TypeCasting;

public class TypeCating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type casting");
		
		// int to string
		int number=10;
		String numberin=String.valueOf(number);
		 int number1=20;
		System.out.println(numberin+number1);
		//string to int
		String value="100";
		int valueinteger=Integer.valueOf(value);
		System.out.println(valueinteger);
		// float to int
		float data= 50.88f;
		int datain=(int) data;
		System.out.println(datain);
		// double to int
		double percentage=20.56789d;
		int percenatagein= (int) percentage;
		System.out.println(percenatagein);
		// boolean to String
		boolean pass=true;
		String passin=String.valueOf(pass);
		System.out.println(passin);
		// String to boolean
		String result ="false";
		boolean resultin=Boolean.valueOf(result);
		System.out.println(resultin);
		// byte to int 
		byte age=127;
		int agein= age;
		System.out.println(agein);
		// int to byte
		int date=2703200;
		byte datein=(byte) date;// byte =>value //double
		System.out.println(datein);
		//Long to String
		long phoneno=23456789999l;
		String phoneIn=String.valueOf(phoneno);
		System.out.println(phoneIn);
		
		// int to float
		int mark=40;
		float markin=(float) mark;
		System.out.println(markin);
		// int to double 
		int salary=25000;
		double salaryin=(double) salary;
		System.out.println(salaryin);
		
	// int to byte
		
		int team=200;
		byte teamin=(byte) team;
		System.out.println(teamin);
		
		

	}

}
