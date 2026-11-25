package fileHandling;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	Scanner sc= new Scanner(System.in);
	public void createfile() throws IOException {
		
		System.out.println("Enter your file name");
		String filename=sc.nextLine();
		File file= new File(filename);
		
		if(file.createNewFile()) {
			System.out.println("file is created");
		}else {
			System.out.println("file is already created");
		}
	}

	public void Filewrite() throws IOException {
		System.out.println("Enter your file name");
		String filename=sc.nextLine();
		FileWriter write= new FileWriter(filename);
		System.out.println("Enter your data");
		String data=sc.nextLine();
		write.write(data);
		write.close();
		System.out.println("thank u");
	}
	public void FileRead() throws IOException {
		System.out.println("Enter your read file name");
		String filename=sc.nextLine();
		FileReader fileReader= new FileReader(filename);
		System.out.println(fileReader.readAllAsString());// read
		fileReader.close();
	}
	
	public void Deletefile()
	{
		
		System.out.println("Enter your file name");
		String name=sc.nextLine();
		File file = new File(name);
		
		if(file.delete()) {
			System.out.println("deleted file");
		}
		else {
			System.out.println("file not present");
		}
	}
	
	public void editandaddprevious() throws IOException {
	System.out.println("Enter your file name");
	String file =sc.nextLine();
	
	FileReader filer=new FileReader(file);
String previous	=filer.readAllAsString();
System.out.println(previous);
filer.close();
FileWriter filew=new FileWriter(file);
System.out.println("Enter your data");
String data=sc.nextLine();
filew.write(previous+" "+data);
filew.close();
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
Main main= new Main();

int choice =0;
do {
	System.out.println("---file handling---");
	System.out.println("1.Create");
	System.out.println("2.write");
	System.out.println("3.read");
	System.out.println("4.delete");
	System.out.println("5.edit");
	System.out.println("0.exit");
	System.out.print("Enter your option");
	Scanner sc= new Scanner(System.in);
choice=sc.nextInt();
switch(choice) {
case 1:
	main.createfile();
	break;
case 2:
	main.Filewrite();
	break;
case 3:
	main.FileRead();
	break;
case 4:
	main.Deletefile();
	break;
case 5:
	main.editandaddprevious();
	break;
case 0:
	System.out.println("loop stoped");
	break;
	default:
		System.out.println("incorrect option");
}
}while(choice!=0);
	
		
		
	}
	
	

}
