package com.view;

import java.util.Scanner;
import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		String flag = "y";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id of operation");
			System.out.println("1. Add product");
			System.out.println("2. Show all products");
			System.out.println("3. Delete product");
			System.out.println("4. Update product");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				t.add();
				t.getAll();
				break;
			}
			
			case 2: {
				t.getAll();
				break;
			}
			
			case 3: {
				t.delete();
				t.getAll();
				break;
			}
			
			case 4: {
				t.update();
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			System.out.println("Do you want to continue? (y/n)");
			flag = sc.next();
		} while(flag.equals("y"));
	}
	
	void add() {
		Scanner sc = new Scanner(System.in);
		ProductService ps = new ProductServiceImpl();
		String flag = "y";
		do {
			Product p = new Product();
			System.out.print("Enter product ID: ");
			p.setId(sc.nextInt());
			System.out.print("Enter product name: ");
			p.setName(sc.next());
			System.out.print("Enter product company: ");
			p.setCompany(sc.next());
			System.out.print("Enter product category: ");
			p.setCategory(sc.next());
			System.out.print("Enter product price: ");
			p.setPrice(sc.nextInt());
			System.out.print("Enter product quantity: ");
			p.setQty(sc.nextInt());
			ps.addProduct(p);
			System.out.print("Do you want to add more products? (y/n)");
			flag = sc.next();
		} while(flag.equals("y"));
	}
	
	void update() {
		Scanner sc = new Scanner(System.in);
		ProductService ps = new ProductServiceImpl();
		String flag = "y";
		do {
			Product p = new Product();
			System.out.print("Enter product ID of product details to update: ");
			p.setId(sc.nextInt());
			System.out.print("Enter product name: ");
			p.setName(sc.next());
			System.out.print("Enter product company: ");
			p.setCompany(sc.next());
			System.out.print("Enter product category: ");
			p.setCategory(sc.next());
			System.out.print("Enter product price: ");
			p.setPrice(sc.nextInt());
			System.out.print("Enter product quantity: ");
			p.setQty(sc.nextInt());
			ps.updateProduct(p);
			System.out.print("Do you want to update more products? (y/n)");
			flag = sc.next();
		} while(flag.equals("y"));
	}
	
	void getAll() {
		ProductService ps = new ProductServiceImpl();
		ps.getAllProducts();
	}
	
	void delete() {
		ProductService ps = new ProductServiceImpl();
		Scanner sc = new Scanner(System.in);
		String flag = "y";
		do {
			System.out.println("Enter index: ");
			int index = sc.nextInt();
			ps.deleteProduct(index);
			System.out.println("Do you want to delete more products? (y/n)");
			flag = sc.next();
		} while(flag.equals("y"));
	}
}
