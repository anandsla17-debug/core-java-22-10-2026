package oops;

public class Overrideparent {
	String studentname,studentschool;
	public Overrideparent(String studentname,String studentschool) {
		// TODO Auto-generated constructor stub
		this.studentname=studentname;
		this.studentschool=studentschool;
	
	}
	void display() {
		System.out.println("studentname:"+studentname+",studentschool:"+studentschool);
	}

	void thing() {
		System.out.println("school student things");
	}
}
