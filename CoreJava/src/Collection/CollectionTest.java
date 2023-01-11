package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,45,78,98,65,32,56,4,578,44,22,8,99,77);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		Set<Integer> set = Set.of(8,7,45,78,98,65,32,55,46); // Can not enter duplicate element, displays data randomly
		System.out.println(set);
		
		Map<String, Integer> hmap = Map.of("a",67,"b",90,"c",26);
		System.out.println(hmap);
	}
}
