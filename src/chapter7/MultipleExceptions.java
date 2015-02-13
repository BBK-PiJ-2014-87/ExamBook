package chapter7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path; // to get a current path
import java.nio.file.Paths; // to get a current path

public class MultipleExceptions {
	public static void main(String[] args) {
		//get a current path
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		System.out.println("Current relative path is: " + s); // prints path of java file
		
		FileInputStream fis = null;
		System.out.println("***FILE NOT FOUND**"); // file txt is not in the directory ExamBook
		try{
			fis = new FileInputStream("file2.txt");
			System.out.println("File Opened");
			fis.read();
			System.out.println("Read file");
		}
		catch (FileNotFoundException fnfe){
			System.out.println("File not found");
		}
		catch (IOException ioe){
			System.out.println("File closig exception");
		}
		finally{
			System.out.println("finally");
		}
		System.out.println("Next task..");
		System.out.println("***FILE FOUND**");// file.txt is in ExamBook directory
		try{
			fis = new FileInputStream("file.txt");
			System.out.println("File Opened");
			fis.read();
			System.out.println("Read file");
		}
		catch (FileNotFoundException fnfe){
			System.out.println("File not found");
		}
		catch (IOException ioe){
			System.out.println("File closig exception");
		}
		finally{
			System.out.println("finally");
		}
		System.out.println("Next task..");
				
	}

}
