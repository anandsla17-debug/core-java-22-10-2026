package recursionfunction;

// without loop print 3 ,6,9 ..99
public class Rescursion {
public void loop(int value) {
	if(value==11) {
		return;// stop 
	}
	
	System.out.println(value++);
	loop(value);
	
}
	
//  100 no to 5 print
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rescursion rescursion= new Rescursion();
		rescursion.loop(1);
	}

}
