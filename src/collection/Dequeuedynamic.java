package collection;

import java.util.ArrayDeque;
import java.util.Deque;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Dequeuedynamic {

	public void dequeue() {
		Deque<Integer> info= new ArrayDeque<>();
		info.addFirst(10);
		info.addLast(20);
		info.add(10);
		info.add(10);
		info.removeFirst();
		info.removeLast();
		
		System.out.println(info);
	}
	public void blockDeque() {
		try {
		BlockingDeque<Integer> data= new LinkedBlockingDeque<>(2);
		data.offer(1);
		System.out.println(data.offer(2));
		System.out.println(data.offer(3));
		data.offerFirst(3);
		data.offerLast(30);
		data.offer(40);
//		data.removeFirst();
//		data.removeLast();
		System.out.println(data);
		System.out.println(data.peek());
		}
		catch (IllegalStateException e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
	
	// blocked =>5  data String(course) =>offer and then add
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dequeuedynamic dequeuedynamic= new Dequeuedynamic();
		dequeuedynamic.blockDeque();
		
		
		

	}
	
	

}
