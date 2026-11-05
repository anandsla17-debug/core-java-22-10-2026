package stringandmethod;

public class Stringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=" hello a ";
		String s2="world";
		
		System.out.println(s1.charAt(1));//index =>value
		System.out.println(s1.codePointAt(5));// index=>assci
		System.out.println(s1.length());
		System.out.println(s1.equals(s2));// check =>two string
		System.out.println(s1.concat(" "+s2));
		System.out.println(s1.indexOf("l"));// =>first index
		System.out.println(s1.lastIndexOf("l"));//last index
		System.out.println(s1.repeat(2));
		System.out.println(s1.replace("hello","."));// old string .. new string
		System.out.println(s1.trim());// remove s and e space
		
		String result[]=s1.split("");
		String output = "";
		for(String data:result) {
			
			if(data!=" ") {
		System.out.println(data);
		output+=data;
			}
		
		}
		System.out.println(result.length);
		System.out.println("check"+output);
		System.out.println(output.length());
		
		
		String a="Hello";
		System.out.println(a.substring(0, 2));
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());

	}

}
