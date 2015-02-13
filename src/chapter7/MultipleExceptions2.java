package chapter7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path; // to get a current path
import java.nio.file.Paths; // to get a current path

public class MultipleExceptions2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try{
			fis = new FileInputStream("file.txt");
			System.out.println("File Opened");
			fis.read();
			System.out.println("Read file");
		}
		finally{
			System.out.println("finally");
		}
		catch (FileNotFoundException fnfe){
			System.out.println("File not found");
		}
		catch (IOException ioe){
			System.out.println("File closig exception");
		}
		
		System.out.println("Next task..");		
	}
}
