package Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkListTest {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
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
