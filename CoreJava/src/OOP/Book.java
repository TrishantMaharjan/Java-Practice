package OOP;

public class Book {
	
	//properties
	int id;
	String name;
	int price;
	String author;
	
	//method
	void printBookInfo() {
		System.out.println("ID = "+id);
		System.out.println("Name = "+name);
		System.out.println("Price = "+price);
		System.out.println("Author = "+author);
	}
	
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.id = 7765;
		b1.name = "Narnia";
		b1.price = 5000;
		b1.author = "C.S. Lewis";
		
		b1.printBookInfo();
		
		Book b2 = new Book();
		b2.id = 8753;
		b2.name = "Screwtape letters";
		b2.price = 4700;
		b2.author = "C.S. Lewis";
		
		b2.printBookInfo();
	}
}
