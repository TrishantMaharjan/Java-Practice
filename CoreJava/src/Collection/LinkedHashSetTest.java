package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		Set<String> hset = new LinkedHashSet<>();
		
		// Displays data based on entry
		hset.add("Ram");
		hset.add("Hari");
		hset.add("Ram"); // Displays only once ie. unique data
		hset.add("Gita");
		
		for (String s : hset) {
			System.out.println(s);
		}
	}
}
