package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl implements ProductService {
	
	static List<Product> plist = new ArrayList<>();

	public void addProduct(Product p) {
		plist.add(p);
		System.out.println("Product addition success. Size = "+plist.size());
	}

	public void deleteProduct(int index) {
		plist.remove(index);
		System.out.println("Product number "+(index+1)+" removed successfully");
	}

	public List<Product> getAllProducts() {
		return plist;
	}

}
