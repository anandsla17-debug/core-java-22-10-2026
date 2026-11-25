package collection;

import java.util.HashSet;

public class Setdynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> rollno=new HashSet<>();
		rollno.add(1000);
		rollno.add(2000);
		rollno.add(3000);
		rollno.add(1000);
		rollno.remove(1000);// remove provide 
		System.out.println(rollno.isEmpty());
		System.out.println(rollno.contains(2000));
		System.out.println(rollno);
		for(Integer result:rollno) {
			if(result==2000) {
			System.out.println(result);
			}
		}
		
		//string 

	}

}
