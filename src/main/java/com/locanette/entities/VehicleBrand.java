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
@Table(name="loc_vehicle_brand")
public class VehicleBrand implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7076694679926996962L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String label;
	@Column(length=1)
	private boolean visible;
	@OneToMany(mappedBy="brand",fetch=FetchType.LAZY)
	private Collection<VehicleModel> models;
	/**
	 * 
	 */
	public VehicleBrand() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param label
	 * @param visible
	 */
	public VehicleBrand(String label, boolean visible) {
		super();
		this.label = label;
		this.visible = visible;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public Collection<VehicleModel> getModels() {
		return models;
	}
	public void setModels(Collection<VehicleModel> models) {
		this.models = models;
	}
	
	

}
