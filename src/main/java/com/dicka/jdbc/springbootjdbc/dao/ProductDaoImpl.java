package com.dicka.jdbc.springbootjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dicka.jdbc.springbootjdbc.entitie.Product;
import com.dicka.jdbc.springbootjdbc.row.RowMapperProduct;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Override
	public Product createdProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updatedProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> listProduct() {
		//list product
		String sql = "select idproduct, name, quantity, price from product";
		RowMapper<Product> mapper = new RowMapperProduct();
		return this.jdbctemplate.query(sql, mapper);
	}

	@Override
	public boolean productIsExist(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deletedProduct(int idproduct) {
		// TODO Auto-generated method stub
		
	}

}
