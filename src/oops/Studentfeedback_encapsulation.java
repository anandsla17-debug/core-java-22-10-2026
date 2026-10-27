package oops;
// encapsulation=>private value or variable
// display=>get
//store=>set
public class Studentfeedback_encapsulation {
	
	private int studentid;//3
	private String studentname;
	private String studentfeedback;
	
	public Studentfeedback_encapsulation(int studentid, String studentname, String studentfeedback) {
		
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentfeedback = studentfeedback;
	}
public Studentfeedback_encapsulation() {
	
}
	public void setStudentname(String studentname) {
		this.studentname=studentname;
	}
	
	public String getStudentname() {
		return studentname;
	}
	
	public String getStudentfeedback() {
		return studentfeedback;
	}

	public void setStudentfeedback(String studentfeedback) {
		this.studentfeedback = studentfeedback;
	}

	//=>1
	//set
	public void setStudentid(int studentid) {
		this.studentid=studentid;//2
	}
	// get
	public int getStudentid() {
		return studentid;
	}

}
