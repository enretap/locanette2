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
@Table(name="loc_house")
public class House implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7278541835103178607L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String code;
	@Column(length=1000)
	private String localization;
	@Column(length=1000)
	private String coordinates;
	@Column(length=20)
	private long numberOfRoom;
	@Column(length=20)
	private long capacity;
	@Column(length=20)
	private double area;
	@Column(length=1000)
	private String conveniences;
	@Column(length=1000)
	private String description;
	@Column(length=1)
	private boolean visible;
	@OneToOne(fetch=FetchType.LAZY)
	private Product product;
	@ManyToOne
	private HouseType type;
	/**
	 * 
	 */
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param localization
	 * @param coordinates
	 * @param numberOfRoom
	 * @param capacity
	 * @param area
	 * @param conveniences
	 * @param description
	 * @param visible
	 * @param product
	 * @param type
	 */
	public House(String code, String localization, String coordinates, long numberOfRoom, long capacity, double area,
			String conveniences, String description, boolean visible, Product product, HouseType type) {
		super();
		this.code = code;
		this.localization = localization;
		this.coordinates = coordinates;
		this.numberOfRoom = numberOfRoom;
		this.capacity = capacity;
		this.area = area;
		this.conveniences = conveniences;
		this.description = description;
		this.visible = visible;
		this.product = product;
		this.type = type;
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
	public long getNumberOfRoom() {
		return numberOfRoom;
	}
	public void setNumberOfRoom(long numberOfRoom) {
		this.numberOfRoom = numberOfRoom;
	}
	public long getCapacity() {
		return capacity;
	}
	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getConveniences() {
		return conveniences;
	}
	public void setConveniences(String conveniences) {
		this.conveniences = conveniences;
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
	public HouseType getType() {
		return type;
	}
	public void setType(HouseType type) {
		this.type = type;
	}
	
	
	
}
