package collection;

import java.util.TreeSet;

public class Treedynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// it follow sortorder , do not allow duplicates
		TreeSet<Integer> data= new TreeSet<>();
		
		data.add(10);
		data.add(20);
		data.add(40);
		data.add(5);
		data.add(10);
		data.remove(5);// data remove
		System.out.println(data.first());
		System.out.println(data.size());
		System.out.println(data.isEmpty());
		System.out.println(data.contains(10));
		System.out.println(data);
		
		
		data.clear();
		System.out.println(data);
		
		
		TreeSet<String> names= new TreeSet<>();
		names.add("kumar");
		names.add("jeeva");
		names.add("mic");
		names.add("leena");
		names.add("anand");
		
		System.out.println(names);
		
		

	}

}
