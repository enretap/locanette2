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
@Table(name="loc_space")
public class Space implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4147721478890217776L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String code;
	@Column(length=200)
	private String name;
	@Column(length=1000)
	private String localization;
	@Column(length=1000)
	private String coordinates;
	private double area;
	@Column(length=1000)
	private String description;
	@Column(length=1)
	private boolean visible;
	@ManyToOne
	private SpaceType type;
	@OneToOne(fetch=FetchType.LAZY)
	private Product product;
	/**
	 * 
	 */
	public Space() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param name
	 * @param localization
	 * @param coordinates
	 * @param area
	 * @param description
	 * @param visible
	 * @param type
	 * @param product
	 */
	public Space(String code, String name, String localization, String coordinates, double area, String description,
			boolean visible, SpaceType type, Product product) {
		super();
		this.code = code;
		this.name = name;
		this.localization = localization;
		this.coordinates = coordinates;
		this.area = area;
		this.description = description;
		this.visible = visible;
		this.type = type;
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
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
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
	public SpaceType getType() {
		return type;
	}
	public void setType(SpaceType type) {
		this.type = type;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
