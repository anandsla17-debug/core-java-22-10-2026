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
		System.out.println(fileReader.readAllAsString());
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
Main main= new Main();
//main.createfile();
//main.Filewrite();
main.FileRead();
	
		
		
	}
	
	

}
