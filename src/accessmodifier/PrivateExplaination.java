package accessmodifier;

 class PrivateExplaination {
	 // do not use different class and package
	private String thing=null;
	 
	private void privatemethod() {
		thing="pen";// reassign
		System.out.println(thing);
	}
	 
	public static void main(String[] args) {
		PrivateExplaination privateExplaination= new PrivateExplaination();
		privateExplaination.thing="scale";
		privateExplaination.privatemethod();
		
	}

	 
}
