package com.dicka.jdbc.springbootjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dicka.jdbc.springbootjdbc.dao.ProductDao;
import com.dicka.jdbc.springbootjdbc.entitie.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productdao;

	@Override
	public List<Product> listProduct() {
		return productdao.listProduct();
	}

	@Override
	public Product getIdproduct(int idproduct) {
		return productdao.getIdproduct(idproduct);
	}

	@Override
	public Product createdProduct(Product product) {
		return productdao.createdProduct(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return productdao.updatedProduct(product);
	}

}
