package com.locanette.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="loc_delivery_guy")
public class DeliveryGuy implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3195919283611519844L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String code;
	@Column(length=200)
	private String name;
	@Column(length=200)
	private String phoneNumber;
	@Column(length=1)
	private boolean visible;
	@OneToMany(mappedBy="guy",fetch=FetchType.LAZY)
	private Collection<Delivery> deliveries;
	/**
	 * 
	 */
	public DeliveryGuy() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param name
	 * @param phoneNumber
	 * @param visible
	 */
	public DeliveryGuy(String code, String name, String phoneNumber, boolean visible) {
		super();
		this.code = code;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.visible = visible;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public Collection<Delivery> getDeliveries() {
		return deliveries;
	}
	public void setDeliveries(Collection<Delivery> deliveries) {
		this.deliveries = deliveries;
	}
	
	
	

}
