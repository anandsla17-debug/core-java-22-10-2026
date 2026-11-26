package collection;

import java.util.Stack;

public class Stackdynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>  datas= new Stack<>(); //LIFO
		datas.push(1);
		datas.push(2);
		datas.push(3);
		datas.push(4);//add
		datas.pop();//=>remove 4
		
		
		System.out.println(datas);
		System.out.println(datas.empty());
		System.out.println(datas.peek());
		System.out.println(datas.size());//length
	}

}
