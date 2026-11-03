package loopandcondition;

public class Dowhileandwhile {

	public static void main(String[] args) {
		// while  =>1 to 20
		
		//declared value
		int i=1;
		while(i<=20) //condition
		{
			if(i%5==0) {
				i++;// 5repeat
				continue;
			}
			if(i==16) {
			break;//stop
			}
			
			System.out.println(i++);
			// incre
		}
		
		int data=1;
		System.out.println(data!=1);
		do {
			System.out.println("data:"+data);
			
			
		}while(data!=1); // condition =>switch
		
		int team=1;
		
		do {
			System.out.println("do:"+team);
			team++;
		}while(team<20);
		
		
		
	}
}
