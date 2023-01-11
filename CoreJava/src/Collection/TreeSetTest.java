package Collection;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetTest {
	public static void main(String[] args) {
		Set<String> hset = new TreeSet<>();
		
		// Displays sorted data (Alphabetical order, descending)
		hset.add("Ram");
		hset.add("Hari");
		hset.add("Ram"); // Displays only once ie. unique data
		hset.add("Gita");
		
		for (String s : hset) {
			System.out.println(s);
		}
	}
}
