package com.locanette.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loc_product_historical")
public class ProductHistorical implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2808104040329195409L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private Date historicalDate;
	@Column(length=20)
	private String code;
	@Column(length=200)
	private String designation;
	private double rentalPrice;
	private double damagePrice;
	@Column(length=1000)
	private String description;
	@Column(length=20)
	private long minimumThreshold;
	@Column(length=20)
	private long amountStored;
	private double discount;
	@Column(length=1)
	private boolean visible;
	
	private ProductCategory category;
	private Supplier supplier;
	private Warehouse warehouse;
	
	@ManyToOne
	private Product product;

	/**
	 * 
	 */
	public ProductHistorical() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param historicalDate
	 * @param code
	 * @param designation
	 * @param rentalPrice
	 * @param damagePrice
	 * @param description
	 * @param minimumThreshold
	 * @param amountStored
	 * @param discount
	 * @param visible
	 * @param category
	 * @param supplier
	 * @param warehouse
	 * @param product
	 */
	public ProductHistorical(Date historicalDate, String code, String designation, double rentalPrice,
			double damagePrice, String description, long minimumThreshold, long amountStored, double discount,
			boolean visible, ProductCategory category, Supplier supplier, Warehouse warehouse, Product product) {
		super();
		this.historicalDate = historicalDate;
		this.code = code;
		this.designation = designation;
		this.rentalPrice = rentalPrice;
		this.damagePrice = damagePrice;
		this.description = description;
		this.minimumThreshold = minimumThreshold;
		this.amountStored = amountStored;
		this.discount = discount;
		this.visible = visible;
		this.category = category;
		this.supplier = supplier;
		this.warehouse = warehouse;
		this.product = product;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getHistoricalDate() {
		return historicalDate;
	}

	public void setHistoricalDate(Date historicalDate) {
		this.historicalDate = historicalDate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	public double getDamagePrice() {
		return damagePrice;
	}

	public void setDamagePrice(double damagePrice) {
		this.damagePrice = damagePrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getMinimumThreshold() {
		return minimumThreshold;
	}

	public void setMinimumThreshold(long minimumThreshold) {
		this.minimumThreshold = minimumThreshold;
	}

	public long getAmountStored() {
		return amountStored;
	}

	public void setAmountStored(long amountStored) {
		this.amountStored = amountStored;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
