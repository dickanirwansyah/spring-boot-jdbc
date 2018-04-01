package com.dicka.jdbc.springbootjdbc.dao;

import java.util.List;

import com.dicka.jdbc.springbootjdbc.entitie.Product;

public interface ProductDao {
	
	Product createdProduct(Product product);
	
	Product updatedProduct(Product product);
	
	List<Product> listProduct();
	
	boolean productIsExist(String name);
	
	void deletedProduct(int idproduct);
	
}
