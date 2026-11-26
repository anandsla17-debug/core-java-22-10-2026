package collection;

import java.util.PriorityQueue;

public class Pqueuedynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		queue.add(-5);
		queue.add(0);
		queue.add(-2);
		queue.add(7);
		queue.add(18);
		queue.poll();// it remove first element
		System.out.println(queue);

	}

}
