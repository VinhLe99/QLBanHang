package com.project.quanlybanhang_api.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity( name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column( name = "product_name")
	private String productname;
	
	@Column( name = "product_avatar")
	private String productavatar;
	
	@Column( name = "product_price")
	private float productprice;
	
	@Column( name = "produc_type")
	private int productype;
	
	@Column( name = "product_description")
	private String productdescription;
	
	@OneToMany(mappedBy = "product")
	private Set<Cart> cart;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductavatar() {
		return productavatar;
	}

	public void setProductavatar(String productavatar) {
		this.productavatar = productavatar;
	}

	public float getProductprice() {
		return productprice;
	}

	public void setProductprice(float productprice) {
		this.productprice = productprice;
	}

	public int getProductype() {
		return productype;
	}

	public void setProductype(int productype) {
		this.productype = productype;
	}

	public String getProductdescription() {
		return productdescription;
	}

	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

	public Set<Cart> getCart() {
		return cart;
	}

	public void setCart(Set<Cart> cart) {
		this.cart = cart;
	}	
}
