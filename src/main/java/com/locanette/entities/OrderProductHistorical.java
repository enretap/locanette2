package com.locanette.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loc_order_product_historical")
public class OrderProductHistorical implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6479141011963461010L;
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
	private Supplier supplier;
	@ManyToOne
	private OrderProduct orderProduct;
	@ManyToOne
	private OrderHistorical orderHistorical;
	/**
	 * 
	 */
	public OrderProductHistorical() {
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
	 * @param orderProduct
	 * @param orderHistorical
	 */
	public OrderProductHistorical(long ordered, long damaged, double rentalPrice, double damagePrice, boolean visible,
			Supplier supplier, OrderProduct orderProduct, OrderHistorical orderHistorical) {
		super();
		this.ordered = ordered;
		this.damaged = damaged;
		this.rentalPrice = rentalPrice;
		this.damagePrice = damagePrice;
		this.visible = visible;
		this.supplier = supplier;
		this.orderProduct = orderProduct;
		this.orderHistorical = orderHistorical;
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
	public OrderProduct getOrderProduct() {
		return orderProduct;
	}
	public void setOrderProduct(OrderProduct orderProduct) {
		this.orderProduct = orderProduct;
	}
	public OrderHistorical getOrderHistorical() {
		return orderHistorical;
	}
	public void setOrderHistorical(OrderHistorical orderHistorical) {
		this.orderHistorical = orderHistorical;
	}
	
	

}
