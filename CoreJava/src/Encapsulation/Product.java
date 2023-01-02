package Encapsulation;

//POJO or model entity class (Class having only private variables, getters and setters)

public class Product {
	
	private int id;
	private String name;
	private String company;
	private int price;
	
	// Right click -> Source -> Generate getters and setters -> Select all
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// Right click -> Source -> Generate toString() -> Click Generate only

	@Override
	public String toString() {
		return "Product \nid=" + id + "\nname=" + name + "\ncompany=" + company + "\nprice=" + price;
	}
	
}
