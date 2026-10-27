package Employee;

public class Classc extends Classb {
	public Classc(String empname,String empshifttime,double empsalary) {
		super(empname, empshifttime, empsalary);
	}

	public static void main(String[] args) {
		Classc classc= new Classc("max","10 to 1",25000.4555533d);
		classc.display();
	}
}
