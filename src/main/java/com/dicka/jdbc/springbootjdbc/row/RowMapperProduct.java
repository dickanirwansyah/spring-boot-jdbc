package com.dicka.jdbc.springbootjdbc.row;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dicka.jdbc.springbootjdbc.entitie.Product;

public class RowMapperProduct implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet row, int rowNum) throws SQLException {
		Product product = new Product();
		product.setIdproduct(row.getInt("idproduct"));
		product.setName(row.getString("name"));
		product.setQuantity(row.getInt("quantity"));
		product.setPrice(row.getInt("price"));
		return product;
	}

}
