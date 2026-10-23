package operators;

public class Operators {
	
	
	void add(int a,int b) {
		System.out.println("add:"+(a+b));
		
	}
	void sub(int a,int b) {
		System.out.println("sub:"+(a-b));
		System.out.println("multi:"+a*b);
		System.out.println("div:"+a/b);
		System.out.println("moldules:"+a%b);
		
	}
	// 
	public Operators(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("constructors");
	}
	
public Operators() {
	
}
	public static void main(String[] args) {
		Operators operators= new Operators();
		
		operators.add(10, 10);
		operators.sub(10, 20);
		// assigment =,+=,-=,*=,/=,%=
		// comparsion => == => memory ,.equals()=> content,<=.>=,<,>
		String place="chennai";
		String place1="chennai";
		System.out.println(place==place1);
		String name=new String("max");
		String name1= new String("max");
		System.out.println(name.equals(name1));
		System.out.println(50>=50);
		System.out.println(60<=70);
		
		// assignment
		int mark=50;
		mark=20;
		mark+=50;
		mark-=10;
		mark*=2;
		mark/=2;
		mark%=7;
		mark=25000;
		System.out.println(mark);
		
		
		
		
	}
}
