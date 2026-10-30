package subpackageaccessmodifier;

import accessmodifier.PublicClass;

public class SubClass extends PublicClass{
	
	void submethod() {
		share="change data";
		System.out.println("share:"+share);
	}

}
