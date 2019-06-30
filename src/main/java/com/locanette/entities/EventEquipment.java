package com.locanette.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="loc_event_equipment")
public class EventEquipment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6170309482435248859L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String code;
	@Column(length=200)
	private String designation;
	@Column(length=200)
	private String dimension;
	@Column(length=200)
	private String color;
	private double weight;
	@Column(length=1000)
	private String description;
	@Column(length=1)
	private boolean visible;
	@OneToOne(fetch=FetchType.LAZY)
	private Product product;
	/**
	 * 
	 */
	public EventEquipment() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param designation
	 * @param dimension
	 * @param color
	 * @param weight
	 * @param description
	 * @param visible
	 * @param product
	 */
	public EventEquipment(String code, String designation, String dimension, String color, double weight,
			String description, boolean visible, Product product) {
		super();
		this.code = code;
		this.designation = designation;
		this.dimension = dimension;
		this.color = color;
		this.weight = weight;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
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
