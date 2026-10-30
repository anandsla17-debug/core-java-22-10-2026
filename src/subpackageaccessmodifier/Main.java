package subpackageaccessmodifier;

import accessmodifier.Protectorexplaination;
import accessmodifier.PublicClass;

public class Main {
	//different package
public static void main(String [] args) {
	PublicClass publicClass=new PublicClass();
	publicClass.share="data";
	System.out.println(publicClass.share);
	publicClass.samplemethod();
	
	SubClass subClass= new SubClass();
	subClass.submethod();
	
	
	Protectorexplaination protectorexplaination= new Protectorexplaination();
	
	Subclassforprotected subclassforprotected= new Subclassforprotected();
	subclassforprotected.submethodforprotector();
	subclassforprotected.protectedmethod();
}
}
