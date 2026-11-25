package collection;

import java.util.ArrayList;

public class Arraydynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> array= new ArrayList<>();
		array.add(10);
		array.add(20);
		array.add(40);
		array.add(30);
		array.add(20);
		array.set(2, 25);//index update
		array.remove(0);//index based remove
		
		System.out.println(array.get(2));
		System.out.println(array.size());
		System.out.println(array.isEmpty());
		array.clear();// all remove
		System.out.println(array);
		for(Integer out:array) {
			System.out.println(out);
		}

	}

}
