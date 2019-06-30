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
@Table(name="loc_warehouse")
public class Warehouse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7382524241294310132L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String code;
	@Column(length=200)
	private String label;
	@Column(length=1000)
	private String localisation;
	@Column(length=1000)
	private String coordinates;
	@Column(length=1000)
	private long area;
	@Column(length=1)
	private boolean visible;
	@ManyToOne
	private Storekeeper storekeeper;
	@OneToMany(mappedBy="warehouse",fetch=FetchType.LAZY)
	private Collection<Product> products;
	/**
	 * 
	 */
	public Warehouse() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param label
	 * @param localisation
	 * @param coordinates
	 * @param area
	 * @param visible
	 * @param storekeeper
	 */
	public Warehouse(String code, String label, String localisation, String coordinates, long area, boolean visible,
			Storekeeper storekeeper) {
		super();
		this.code = code;
		this.label = label;
		this.localisation = localisation;
		this.coordinates = coordinates;
		this.area = area;
		this.visible = visible;
		this.storekeeper = storekeeper;
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
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public String getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}
	public long getArea() {
		return area;
	}
	public void setArea(long area) {
		this.area = area;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public Storekeeper getStorekeeper() {
		return storekeeper;
	}
	public void setStorekeeper(Storekeeper storekeeper) {
		this.storekeeper = storekeeper;
	}
	public Collection<Product> getProducts() {
		return products;
	}
	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	
	
	
	
	
}
