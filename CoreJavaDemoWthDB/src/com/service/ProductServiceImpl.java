package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl implements ProductService {
	
	static List<Product> plist = new ArrayList<>();

	public void addProduct(Product p) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
			String sql = "insert into product(ID,Name,Company,Category,Price,Qty) values('"+p.getId()+"' , '"+p.getName()+"' , '"+p.getCompany()+"' , '"+p.getCategory()+"' , '"+p.getPrice()+"' , '"+p.getQty()+"')";
			Statement stm = con.createStatement();
			stm.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		plist.add(p); // Not needed
		System.out.println("Product addition success. Size = "+plist.size());
	}

	public void deleteProduct(int index) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
			String sql = "delete from product where ID = '"+index+"'";
			Statement stm = con.createStatement();
			stm.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		plist.remove(index-1); // Not needed
		System.out.println("Product number "+(index)+" removed successfully");
	}

	public List<Product> getAllProducts() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
			String sql = "select * from product";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("ID = "+rs.getInt("ID"));
				System.out.println("Name = "+rs.getString("Name"));
				System.out.println("Company = "+rs.getString("Company"));
				System.out.println("Category = "+rs.getString("Category"));
				System.out.println("Price = "+rs.getInt("Price"));
				System.out.println("Quantity = "+rs.getInt("Qty"));
				System.out.println("==========");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return plist;
	}

}
