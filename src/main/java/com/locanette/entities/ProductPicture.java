package com.locanette.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loc_product_picture")
public class ProductPicture implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3383670699422387067L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String link;
	@Column(length=1)
	private boolean visible;
	@ManyToOne
	private Product product;
	/**
	 * 
	 */
	public ProductPicture() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param link
	 * @param visible
	 * @param product
	 */
	public ProductPicture(String link, boolean visible, Product product) {
		super();
		this.link = link;
		this.visible = visible;
		this.product = product;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	

}
