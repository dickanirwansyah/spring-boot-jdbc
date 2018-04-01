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

}
