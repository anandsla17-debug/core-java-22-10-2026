package collection;

import java.util.TreeMap;

public class Treemapdynamic {
public static void main(String[] args) {
	TreeMap<Integer,String> appointment= new TreeMap<>();
	
	
	appointment.put(3, "joe");
	appointment.put(4,"kumar");
	appointment.put(2, "arun");
	appointment.put(1, "mic");
   System.out.println(appointment.remove(1));
  System.out.println(appointment.remove(2, "arun"));
  System.out.println(appointment.replace(4, "leena"));
   System.out.println(appointment.replace(4, "leena", "arun kumar"));
	System.out.println(appointment);
	System.out.println(appointment.containsKey(2)+" "+appointment.containsValue("arun"));
	System.out.println(appointment.firstKey());
	System.out.println(appointment.size());
}
}
