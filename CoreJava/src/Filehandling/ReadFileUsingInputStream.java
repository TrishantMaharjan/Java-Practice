package Filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingInputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("/home/trishant/Documents/JavaFiles/Test.txt");
		int data;
		while((data = file.read()) != -1) {
			System.out.print((char)data);
		}
	}
}
