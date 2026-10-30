package accessmodifier;

public class Main {

	// same package
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicClass publicClass= new PublicClass();
		publicClass.share="123";
		System.out.println(publicClass.share);
		publicClass.samplemethod();
PrivateExplaination privateExplaination= new PrivateExplaination();
//privateExplaination.privatemethod();
Protectorexplaination protectorexplaination= new Protectorexplaination();
protectorexplaination.protectedmethod();
System.out.println(protectorexplaination.Salary);
	}

}
