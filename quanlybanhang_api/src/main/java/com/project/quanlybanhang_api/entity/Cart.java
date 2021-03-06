package com.project.quanlybanhang_api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity( name = "cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
		
	@ManyToOne
	@JoinColumn(name = "product_id", insertable = false, updatable = false)
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "customer_id", insertable = false, updatable = false)
	private Customer customer;	
	
	@OneToOne(mappedBy = "cart")
    private CartDetail cartdetail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CartDetail getCartdetail() {
		return cartdetail;
	}

	public void setCartdetail(CartDetail cartdetail) {
		this.cartdetail = cartdetail;
	}

}
