package subpackageaccessmodifier;

import accessmodifier.Protectorexplaination;

public class Subclassforprotected extends Protectorexplaination{
	
	public void submethodforprotector() {
		System.out.println("salary"+Salary);
	}
	
	@Override
	protected void protectedmethod() {
		super.protectedmethod();
	}

}
