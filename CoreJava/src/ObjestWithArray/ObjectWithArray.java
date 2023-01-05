package ObjestWithArray;

//import java.util.Arrays;
import java.util.Scanner;

public class ObjectWithArray {
	/*
	 * ========== Array of Object ==========
	 * Syntax:
	 * class_name[] array_name = new class_name[size];
	 */
	public static void main(String[] args) {
		//System.out.println(Arrays.toString(books));
		Book[] books = getArray();
		printArray(books);
	}
	
	static Book[] getArray() {
		Book[] books = new Book[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<5; i++) {
			Book b1 = new Book();
			System.out.println("Enter book ID: "); b1.setId(sc.nextInt());
			System.out.println("Enter book name: "); b1.setName(sc.next());
			System.out.println("Enter book author: "); b1.setAuthor(sc.next());
			System.out.println("Enter book pages: "); b1.setPages(sc.nextInt());
			System.out.println("Enter book price: "); b1.setPrice(sc.nextInt());

			books[i] = b1;
		}
		sc.close();
		return books;
	}
	
	static void printArray(Book[] array) {
		for (int i = 0; i<5; i++) {
			System.out.println("ID: "+array[i].getId());
			System.out.println("Name: "+array[i].getName()); 
			System.out.println("Author: "+array[i].getAuthor()); 
			System.out.println("Pages: "+array[i].getPages()); 
			System.out.println("Price: "+array[i].getPrice()); 
		}
		//System.out.println(Arrays.toString(array));
	}
}