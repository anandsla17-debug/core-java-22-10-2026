package collection;

import java.util.HashMap;

public class Hashmapdynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> studentsrecord= new HashMap<>();
		studentsrecord.put(1000, "arun");// put =>add
		studentsrecord.put(2000, "kumar");
		studentsrecord.put(3000,"jeeva");
		studentsrecord.put(1000, "leena");
		studentsrecord.replace(2000,"mic");// edit
		System.out.println("check"+studentsrecord.remove(1000));//delete
		System.out.println("boolean r"+studentsrecord.remove(20003, "mic"));
		System.out.println("boolean replace"+studentsrecord.replace(3000,"jeeva","dj"));
		System.out.println(studentsrecord.containsKey(2000)+" "
				+ ""+studentsrecord.containsValue("jeeva"));
		System.out.println(studentsrecord);

	}

}
