package com.dicka.jdbc.springbootjdbc.service;

import java.util.List;

import com.dicka.jdbc.springbootjdbc.entitie.Product;

public interface ProductService {

	List<Product> listProduct();

	Product getIdproduct(int idproduct);

	Product createdProduct(Product product);

	Product updateProduct(Product product);
}
