package collection;

import java.util.Vector;

public class Vectordynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> data= new Vector<>(); // same arraylist but syn and thread safe
		data.add(10);
		data.set(0, 20);
		data.add(30);
		data.add(40);
		data.add(70);
		data.add(56);
		data.remove(3);
		System.out.println(data);
	}

}
