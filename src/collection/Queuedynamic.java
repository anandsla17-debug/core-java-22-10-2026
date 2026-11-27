package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queuedynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> adds= new LinkedList<>();
		adds.add(10);
		adds.add(20);
		adds.add(30);
		adds.add(50);
		adds.poll();//first  remove
		System.out.println(adds.peek());// first element finded
		System.out.println(adds);
		
		
		

	}

}
