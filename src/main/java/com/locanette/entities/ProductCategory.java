package com.locanette.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="loc_product_category")
public class ProductCategory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3828924545036560698L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String label;
	@Column(length=1000)
	private String description;
	@ManyToOne
	private ProductFamily productFamily;
	@Column(length=1)
	private boolean visible;
	@OneToMany(mappedBy="category",fetch=FetchType.LAZY)
	private Collection<Product> products;
	
	/**
	 * 
	 */
	public ProductCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param label
	 * @param description
	 * @param productFamily
	 * @param visible
	 */
	public ProductCategory(String label, String description, ProductFamily productFamily, boolean visible) {
		super();
		this.label = label;
		this.description = description;
		this.productFamily = productFamily;
		this.visible = visible;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ProductFamily getProductFamily() {
		return productFamily;
	}
	public void setProductFamily(ProductFamily productFamily) {
		this.productFamily = productFamily;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public Collection<Product> getProducts() {
		return products;
	}

	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	
	
	
}
