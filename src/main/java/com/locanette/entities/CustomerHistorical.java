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
@Table(name="loc_customer_historical")
public class CustomerHistorical implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7202119449936597511L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	private Date historicalDate;
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
	@ManyToOne
	private Customer customer;
	/**
	 * 
	 */
	public CustomerHistorical() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param historicalDate
	 * @param firstName
	 * @param lastName
	 * @param phoneNumber
	 * @param email
	 * @param visible
	 * @param customer
	 */
	public CustomerHistorical(Date historicalDate, String firstName, String lastName, String phoneNumber, String email,
			boolean visible, Customer customer) {
		super();
		this.historicalDate = historicalDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.visible = visible;
		this.customer = customer;
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
