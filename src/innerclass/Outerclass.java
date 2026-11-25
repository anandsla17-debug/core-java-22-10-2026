package innerclass;

public class Outerclass {
	
	class Innerclass{
		public Innerclass(int a,int b) {
			// TODO Auto-generated constructor stub
			System.out.println("a:"+a+",b:"+b);
		}
		void samplemethod() {
			System.out.println("inner method");
		}
	}

	static class Innerclass1{
	static	void staticmethod() {
			System.out.println("static method inner");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outerclass outerclass= new Outerclass();
		Outerclass.Innerclass inner=outerclass.new Innerclass(20,90);
		inner.samplemethod();
		
		Outerclass.Innerclass1.staticmethod();
		
		

	}

}
