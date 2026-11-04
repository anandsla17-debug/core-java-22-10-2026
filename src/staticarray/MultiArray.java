package staticarray;

import java.util.Scanner;

public class MultiArray {
private static String string;
void multi() {
	//3d
			int[][][] multiarry= {
					{
						{10,20},
						{40,50,60},
						{70,80,90}
					}
					,{
						{1,2},
						{3,4},
						{5,6}
						}
					};
			
//			System.out.println(multiarry[0][0][1]);
			
			  
//			System.out.println(multiarry[0][0].length);
			
			
			for(int i=0;i<multiarry.length;i++) {
				for(int j=0;j<multiarry[i].length;j++) {
					
					for(int k=0;k<multiarry[i][j].length;k++) {
						System.out.print(multiarry[i][j][k]+" ");
					}
					System.out.println();
				}
			}
			
			
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your matrix");
		int matrix=sc.nextInt();
		
		
		
		sc.nextLine();
		String[][][] data= new String[matrix][][];
		
		
		for(int i=0;i<data.length;i++) {
			System.out.println("matrix "+i);
			System.out.println("Enter your row");
			int row=sc.nextInt();
			System.out.println("Enter your col");
			int col=sc.nextInt();
			 data[i]=new String[row][col];
		}
		
		sc.nextLine();
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				for(int k=0;k<data[i][j].length;k++) {
					System.out.println("matrix row col:"+i+" "+j+" "+k);
					data[i][j][k]=sc.nextLine();
				}
			}
		}
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				for(int k=0;k<data[i][j].length;k++) {
					System.out.print(data[i][j][k]+"  ");
				}
				System.out.println();
			}
		}

	}

}
