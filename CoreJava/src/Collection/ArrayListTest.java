package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Nepal");
		list.add("China");
		list.add("Korea");
		list.add("Bhutan");
		list.add("Pakistan");
		
		list.remove(3);
		list.remove("Pakistan");
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println(list.contains("Nepal"));
		System.out.println(list.contains("Russia"));
		
		list.clear(); // Clears list
	}
}
