package com.dicka.jdbc.springbootjdbc.entitie;

public class Product {
	
	private int idproduct;
	private String name;
	private int quantity;
	private int price;
	
	public int getIdproduct(){
		return idproduct;
	}
	
	public void setIdproduct(int idproduct){
		this.idproduct = idproduct;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	public int getPrice(){
		return price;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
}
