package Filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileUsingFileWriter {
	/*
	 * ========== Used to process document files or txt files ==========
	 *  1> FileReader : Read file
	 *  2> FileWriter : Write file
	 */
	
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("/home/trishant/Documents/JavaFiles/Product.txt", true); // True for append
		file.write("ID = 1234 \n");
		file.write("Name = Mobile \n");
		file.write("Company = Samsung \n");
		file.write("Price = Rs 24,500 \n");
		file.write("Quantity = 14 \n");
		file.close();
		System.out.println("Entry Success");
	}
}
