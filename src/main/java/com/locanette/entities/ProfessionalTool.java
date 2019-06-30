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
@Table(name="loc_professional_tool")
public class ProfessionalTool implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2640367168007108203L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String code;
	@Column(length=200)
	private String designation;
	private double weight;
	@Column(length=1000)
	private String description;
	@Column(length=1)
	private boolean visible;
	@OneToOne(fetch=FetchType.LAZY)
	private Product product;
	@ManyToOne
	private EquipementField field;
	/**
	 * 
	 */
	public ProfessionalTool() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param designation
	 * @param weight
	 * @param description
	 * @param visible
	 * @param product
	 * @param field
	 */
	public ProfessionalTool(String code, String designation, double weight, String description, boolean visible,
			Product product, EquipementField field) {
		super();
		this.code = code;
		this.designation = designation;
		this.weight = weight;
		this.description = description;
		this.visible = visible;
		this.product = product;
		this.field = field;
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
	public EquipementField getField() {
		return field;
	}
	public void setField(EquipementField field) {
		this.field = field;
	}
	
	

}
