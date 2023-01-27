package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileTest {
	
	public static void main(String[] args) throws IOException {
		File file = new File("/home/trishant/Documents/JavaFiles/Test.txt");
		System.out.println(file.isDirectory());
		System.out.println(file.exists());
		// ========== Create folder/dir at runtime ==========
		File dir = new File("/home/trishant/Documents/JavaFiles/Testdir");
		dir.mkdir();
		// ========== Check files in directory ==========
		String[] filenames = dir.list();
		System.out.println(Arrays.toString(filenames));
		List<String> fnames = Arrays.asList(filenames);
		System.out.println(fnames.contains("Testobj.txt"));
		// =========== List all files from folder ==========
		File[] files = dir.listFiles();
		for(File fl : files) {
			// FileReader fr = new FileReader(fl.getAbsoluteFile());
			// BufferedReader br = new BufferedReader(fr);	
			// String line;
			// while((line = br.readLine()) != null) {
			//	 System.out.println(line);
			// }
			
			List<String> lines = Files.readAllLines(Path.of(fl.getAbsolutePath()));
			System.out.println(lines);
		}
		// ========== Copy files ==========
		Files.copy(Path.of(file.getAbsolutePath()), Path.of("/home/trishant/Documents/JavaFiles/Testdir"+file.getName()), StandardCopyOption.REPLACE_EXISTING);
		// ========== Create new file ==========
		Files.write(Path.of("/home/trishant/Documents/JavaFiles/Testdir"), "This is a test sentence".getBytes(), StandardOpenOption.CREATE_NEW);
		// ========== Delete file ==========
		Files.delete(Path.of("/home/trishant/Documents/JavaFiles/Testdir/DeleteTest.txt"));
	}
	
}
