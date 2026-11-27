package collection;
import java.util.Hashtable;
public class Hashtabledynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> info = new Hashtable<>();// same hashmap but thread safe and syn
		info.put("hello",23);
		info.put("jeeva", 3);
		info.replace("jeeva", 10);
		System.out.println(info);
	

	}

}
