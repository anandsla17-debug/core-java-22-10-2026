package oops;

public class OverrideChild extends Overrideparent{

	public OverrideChild(String studentname, String studentschool) {
		super(studentname, studentschool);
		// TODO Auto-generated constructor stub
	}

	@Override
	void thing() {
		super.thing();// previous logic parent
		System.out.println("school things: pen ,pencile,scale");
	}
}
