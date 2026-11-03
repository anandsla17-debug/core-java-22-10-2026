package stackarray;

import java.util.Scanner;

public class Array {

	void onedementional() {
		// => collection info,allow duplicate,insert order,index=>0 ,stack fixed size
		
				//one dementional
				int[] arr= {1,2,3,4,5,6,5};
//				System.out.println(arr[0]);
				
//				for(int i=0;i<arr.length;i++) {
//					System.out.println("normal "+arr[i]);
//				}
				
				for( int term:arr)//0=>1,1=>2,2=>3.. n
				 {
					System.out.println("en arr"+term);//1,2,3
				}
				System.out.println(arr.length);
				
				
				String[] names=new String[3];//0,1,2=>3
				
				names[0]="max";
				names[1]="arun";
				names[2]="jeeva";
//				names[3]="kumar";// run error
//				System.out.println(names[1]);
				for(String data:names) {
					System.out.println("names:"+data);
				}
				
	}
	
	void ondementionaluser() {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your array length:");
		int size=sc.nextInt();
		int[] mark=new int[size];
		
		for(int i=0;i<mark.length;i++) {
			
			System.out.println("enter your mark:"+i);
			mark[i]=sc.nextInt();
		}
		
		for(int allmark:mark) {
			System.out.println("mark:"+allmark);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	// =>row col
		
		int[][] no= {{10,20,30,},{40,50,60},{70,80,90}};// 3X3
		System.out.println(no[1][1]);
		
		for(int i=0;i<no.length;i++) {
			for(int j=0;j<no[i].length;j++) {
				System.out.println("row:"+i+",col:"+j+" ,"+no[i][j]);
			}
		}
		
		
		int [][] rollno= {{1000,1001,1002},{2000,2001},{3000,3001,3002,3004}};
		System.out.println(rollno.length);
		System.out.println(rollno[2].length);
		
		
		//
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your row size");
		int row=sc.nextInt();
		System.out.println("Enter your col size");
		int col=sc.nextInt();
		sc.nextLine();
		String[][] studentrecords=new String[row][col];
		for(int i=0;i<studentrecords.length;i++) {
			for(int j=0;j<studentrecords[i].length;j++) {
				System.out.println("Student record:"+"row:"+i+",col"+j);
				studentrecords[i][j]=sc.nextLine();
			}
		}
		
		for(int i=0;i<studentrecords.length;i++) {
			for(int j=0;j<studentrecords[i].length;j++) {
				System.out.print(studentrecords[i][j]);
			}
			System.out.println();
		}
		
	}

}
