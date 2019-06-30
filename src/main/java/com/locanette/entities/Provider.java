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
@Table(name="loc_provider")
public class Provider implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5400310605043654166L;
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
	@ManyToOne
	private ProviderSpecialty specialty;
	@Column(length=1000)
	private String description;
	@Column(length=1)
	private boolean visible;
	@OneToOne(fetch=FetchType.LAZY)
	private Product product;
	/**
	 * 
	 */
	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param name
	 * @param phoneNumber
	 * @param email
	 * @param localization
	 * @param specialty
	 * @param description
	 * @param visible
	 * @param product
	 */
	public Provider(String code, String name, String phoneNumber, String email, String localization,
			ProviderSpecialty specialty, String description, boolean visible, Product product) {
		super();
		this.code = code;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.localization = localization;
		this.specialty = specialty;
		this.description = description;
		this.visible = visible;
		this.product = product;
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
	public ProviderSpecialty getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ProviderSpecialty specialty) {
		this.specialty = specialty;
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
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
