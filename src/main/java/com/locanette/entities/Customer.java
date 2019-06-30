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
@Table(name="loc_customer")
public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9004026944264591022L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String firstName;
	@Column(length=200)
	private String lastName;
	@Column(length=200)
	private String phoneNumber;
	@Column(length=200)
	private String email;
	@Column(length=1)
	private boolean visible;
	@OneToMany(mappedBy="customer",fetch=FetchType.LAZY)
	private Collection<CustomerHistorical> historicals;
	@OneToMany(mappedBy="customer",fetch=FetchType.LAZY)
	private Collection<Order> orders;
	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param phoneNumber
	 * @param email
	 * @param visible
	 */
	public Customer(String firstName, String lastName, String phoneNumber, String email, boolean visible) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.visible = visible;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public Collection<CustomerHistorical> getHistoricals() {
		return historicals;
	}
	public void setHistoricals(Collection<CustomerHistorical> historicals) {
		this.historicals = historicals;
	}
	public Collection<Order> getOrders() {
		return orders;
	}
	public void setOrders(Collection<Order> orders) {
		this.orders = orders;
	}
	
	

}
