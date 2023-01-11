package Collection;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> hmap = new LinkedHashMap<>();
		
		hmap.put("Kamal", 29);
		hmap.put("Pawan", 22);
		hmap.put("Suman", 18);
		hmap.put("Kamal", 31); // replaces above value
		hmap.put("Anup", 20);
		hmap.put("Subit", 25);
		
		for(String key : hmap.keySet()) {
			System.out.println(key+" = "+hmap.get(key));
		}
	}
}
