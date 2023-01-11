package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> hset = new HashSet<>();
		
		// Displays data randomly
		hset.add("Ram");
		hset.add("Hari");
		hset.add("Ram"); // Displays only once ie. unique data
		hset.add("Gita");
		
		for (String s : hset) {
			System.out.println(s);
		}
	}
}
