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
@Table(name="loc_supplier")
public class Supplier implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8026719647548300264L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String code;
	@Column(length=200)
	private String name;
	@Column(length=200)
	private String phoneNumber;
	@Column(length=200)
	private String email;
	@Column(length=1000)
	private String localization;
	@Column(length=1000)
	private String coordinates;
	@Column(length=1)
	private boolean visible;
	@ManyToOne
	private City city;
	@OneToMany(mappedBy="supplier",fetch=FetchType.LAZY)
	private Collection<Product> products;
	@OneToMany(mappedBy="supplier",fetch=FetchType.LAZY)
	private Collection<OrderProduct> orderProduct;
	
	/**
	 * 
	 */
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param name
	 * @param phoneNumber
	 * @param email
	 * @param localization
	 * @param coordinates
	 * @param visible
	 * @param city
	 */
	public Supplier(String code, String name, String phoneNumber, String email, String localization, String coordinates,
			boolean visible, City city) {
		super();
		this.code = code;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.localization = localization;
		this.coordinates = coordinates;
		this.visible = visible;
		this.city = city;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocalization() {
		return localization;
	}
	public void setLocalization(String localization) {
		this.localization = localization;
	}
	public String getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Collection<Product> getProducts() {
		return products;
	}
	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	public Collection<OrderProduct> getOrderProduct() {
		return orderProduct;
	}
	public void setOrderProduct(Collection<OrderProduct> orderProduct) {
		this.orderProduct = orderProduct;
	}
	
	

}
