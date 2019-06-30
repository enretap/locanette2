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
@Table(name="loc_order_product")
public class OrderProduct implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6764993305281061748L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=20)
	private long ordered;
	@Column(length=20)
	private long damaged;
	private double rentalPrice;
	private double damagePrice;
	@Column(length=1)
	private boolean visible;
	@ManyToOne
	private Supplier supplier;
	private double supplingPrice;
	@Column(length=1000)
	private String description;
	@ManyToOne
	private Order order;
	@ManyToOne
	private Product product;
	@OneToMany(mappedBy="orderProduct",fetch=FetchType.LAZY)
	private Collection<OrderProductHistorical> historicals;
	/**
	 * 
	 */
	public OrderProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param ordered
	 * @param damaged
	 * @param rentalPrice
	 * @param damagePrice
	 * @param visible
	 * @param supplier
	 * @param supplingPrice
	 * @param order
	 * @param product
	 */
	public OrderProduct(long ordered, long damaged, double rentalPrice, double damagePrice, boolean visible,
			Supplier supplier, double supplingPrice, Order order, Product product, String description) {
		super();
		this.ordered = ordered;
		this.damaged = damaged;
		this.rentalPrice = rentalPrice;
		this.damagePrice = damagePrice;
		this.visible = visible;
		this.supplier = supplier;
		this.supplingPrice = supplingPrice;
		this.order = order;
		this.product = product;
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getOrdered() {
		return ordered;
	}
	public void setOrdered(long ordered) {
		this.ordered = ordered;
	}
	public long getDamaged() {
		return damaged;
	}
	public void setDamaged(long damaged) {
		this.damaged = damaged;
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
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public double getSupplingPrice() {
		return supplingPrice;
	}
	public void setSupplingPrice(double supplingPrice) {
		this.supplingPrice = supplingPrice;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Collection<OrderProductHistorical> getHistoricals() {
		return historicals;
	}
	public void setHistoricals(Collection<OrderProductHistorical> historicals) {
		this.historicals = historicals;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
