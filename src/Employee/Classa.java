package Employee;

public class Classa {
String empname,empshifttime;
double empsalary;
public Classa(String empname,String empshifttime,double empsalary) {
	this.empname=empname;
	this.empshifttime=empshifttime;
	this.empsalary=empsalary;
}

void display() {
	System.out.println("empname:"+empname+",empshifttime:"+empshifttime+",empsalary:"+empsalary);
}
}
