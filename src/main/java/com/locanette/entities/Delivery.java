package com.locanette.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="loc_delivery")
public class Delivery implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6652253134973106122L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String deliveryDate;
	@Column(length=1000)
	private String description;
	@Column(length=1)
	private boolean visible;
	@ManyToOne
	private DeliveryGuy guy;
	@OneToOne(fetch=FetchType.LAZY)
	private Order order;
	/**
	 * 
	 */
	public Delivery() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param deliveryDate
	 * @param description
	 * @param visible
	 * @param guy
	 * @param order
	 */
	public Delivery(String deliveryDate, String description, boolean visible, DeliveryGuy guy, Order order) {
		super();
		this.deliveryDate = deliveryDate;
		this.description = description;
		this.visible = visible;
		this.guy = guy;
		this.order = order;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public DeliveryGuy getGuy() {
		return guy;
	}
	public void setGuy(DeliveryGuy guy) {
		this.guy = guy;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	

}
