package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.model.Product;

public class ProductServiceImpl implements ProductService {

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
		System.out.println("Product addition success.");
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
		System.out.println("Product number "+(index)+" removed successfully");
	}
	
	public void updateProduct(Product p) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
			String sql = "update product set Name = '"+p.getName()+"', Company = '"+p.getCompany()+"', Category = '"+p.getCategory()+"', Price = '"+p.getPrice()+"', Qty = '"+p.getQty()+"' where ID = '"+p.getId()+"'";
			Statement stm = con.createStatement();
			stm.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getAllProducts() {
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
				System.out.println("==================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
