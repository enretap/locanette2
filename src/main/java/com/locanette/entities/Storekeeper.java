package com.locanette.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="loc_storekeeper")
public class Storekeeper implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 29442344270350136L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String code;
	@Column(length=200)
	private String name;
	@Column(length=200)
	private String firstName;
	@Column(length=200)
	private Date birthdate;
	@Column(length=200)
	private String birthPlace;
	@Column(length=200)
	private String civility;
	@Column(length=200)
	private String home;
	@Column(length=200)
	private String phoneNumber;
	@Column(length=200)
	private String email;
	@Column(length=200)
	private String picture;
	@Column(length=1)
	private boolean visible;
	@OneToMany(mappedBy="storekeeper",fetch=FetchType.LAZY)
	private Collection<Warehouse> warehouses;
	@OneToMany(mappedBy="storekeeper",fetch=FetchType.LAZY)
	private Collection<OrderReturn> orderReturns;
	/**
	 * 
	 */
	public Storekeeper() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param name
	 * @param firstName
	 * @param birthdate
	 * @param birthPlace
	 * @param civility
	 * @param home
	 * @param phoneNumber
	 * @param email
	 * @param picture
	 * @param visible
	 */
	public Storekeeper(String code, String name, String firstName, Date birthdate, String birthPlace, String civility,
			String home, String phoneNumber, String email, String picture, boolean visible) {
		super();
		this.code = code;
		this.name = name;
		this.firstName = firstName;
		this.birthdate = birthdate;
		this.birthPlace = birthPlace;
		this.civility = civility;
		this.home = home;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.picture = picture;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getCivility() {
		return civility;
	}
	public void setCivility(String civility) {
		this.civility = civility;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
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
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public Collection<Warehouse> getWarehouses() {
		return warehouses;
	}
	public void setWarehouses(Collection<Warehouse> warehouses) {
		this.warehouses = warehouses;
	}
	public Collection<OrderReturn> getOrderReturns() {
		return orderReturns;
	}
	public void setOrderReturns(Collection<OrderReturn> orderReturns) {
		this.orderReturns = orderReturns;
	}
	
	
	
}
