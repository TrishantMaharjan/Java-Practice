package Filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileUsingFileOutputStream {
	/*
	 * 1> FileInputStream: File read
	 * 2> FileOutputStream: File write
	 */
	
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("/home/trishant/Documents/JavaFiles/Test.txt");
		file.write("This is a test document".getBytes());
		file.close();
		System.out.println("File Created");
	}
}
