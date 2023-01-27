package Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingFileReader {

	public static void main(String[] args) throws IOException {
		
		// FileReader file = new FileReader("/home/trishant/Documents/JavaFiles/Product.txt");
		FileReader file = new FileReader("/home/trishant/Documents/JavaFiles/Graphics Schedule - Sheet.csv");
		BufferedReader br = new BufferedReader(file); // Reading from buffer memory, not secondary storage
		String line;
		while((line = br.readLine()) != null) {
			// System.out.println(line);
			String[] data = line.split(",");
			System.out.println(data[0]);
			System.out.println(data[1]);
			System.out.println(data[2]);
			System.out.println(data[3]);
		}
		// Enter data into database
	}
	
}
