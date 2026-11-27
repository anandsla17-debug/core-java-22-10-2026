package collection;

import java.util.LinkedList;

public class LinkedListdynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> data= new LinkedList<>();
data.add(10);
data.add(20);
data.add(40);
data.add(90);
data.addFirst(10);
data.addLast(70);
data.set(0, 20);
data.remove(0);
data.removeFirst();
data.removeLast();
System.out.println(data.size());
System.out.println(data.contains(0));
System.out.println(data);
	}

}
