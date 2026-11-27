package arrayclass;

import java.util.ArrayList;

// =>java bean
public class Employee {

private int empid;
private String empname;
private String empsalary;
public Employee(int empid, String empname, String empsalary) {

	this.empid = empid;
	this.empname = empname;
	this.empsalary = empsalary;
}
public Employee() {
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpsalary() {
	return empsalary;
}
public void setEmpsalary(String empsalary) {
	this.empsalary = empsalary;
}

@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
}
public static void main(String[] args) {
	ArrayList<Employee> employee= new  ArrayList<>();
	
	employee.add(new Employee(1, "arun", "30000"));
	employee.add(new Employee(2,"kumar","40000"));
	employee.add(new Employee(3,"leena","34000"));
	employee.set(0, new Employee(1, "MIC","50000" ));
System.out.println(employee.get(0).getEmpid()+" "+employee.get(0).getEmpname()+" "
		+employee.get(0).getEmpsalary());
System.out.println(employee);
	for(Employee emp:employee) {
		System.out.println("check----"+emp);
		
		
		System.out.println(emp.getEmpid()+" "+emp.getEmpname()+" "+emp.getEmpsalary());
	}
	
	
	
}
}
