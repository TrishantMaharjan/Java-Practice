package Encapsulation;

public class TestProduct {
	public static void main(String[] args) {
		Product p = new Product();
		/*
		// Before using private data type and getter and setter in Product
		p.id = 55555;
		p.name = "Mobile";
		p.price = 90000;
		p.company = "Samsung";
		*/
		
		p.setId(4578);
		p.setName("Mobile");
		p.setPrice(16599);
		p.setCompany("Infinix");
		
		/*
		// Before using toString() method
		System.out.println("ID = "+p.getId());
		System.out.println("Name = "+p.getName());
		System.out.println("Price = "+p.getPrice());
		System.out.println("Company = "+p.getCompany());
		*/
		
		System.out.println(p);
	}
}
