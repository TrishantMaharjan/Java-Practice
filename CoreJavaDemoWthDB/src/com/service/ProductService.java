package com.service;

import com.model.Product;

public interface ProductService {
	
	void addProduct(Product p);
	
	void deleteProduct(int index);
	
	void updateProduct(Product p);
	
	void getAllProducts();
}
