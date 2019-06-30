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
@Table(name="loc_vehicle_model")
public class VehicleModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6880681094136254546L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String label;
	@Column(length=200)
	private String releaseYear;
	@Column(length=1000)
	private String description;
	@Column(length=1)
	private boolean visible;
	@ManyToOne
	private VehicleBrand brand;
	@OneToMany(mappedBy="model",fetch=FetchType.LAZY)
	private Collection<Vehicle> vehicles;
	/**
	 * 
	 */
	public VehicleModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param label
	 * @param releaseYear
	 * @param description
	 * @param visible
	 * @param brand
	 */
	public VehicleModel(String label, String releaseYear, String description, boolean visible, VehicleBrand brand) {
		super();
		this.label = label;
		this.releaseYear = releaseYear;
		this.description = description;
		this.visible = visible;
		this.brand = brand;
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
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
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
	public VehicleBrand getBrand() {
		return brand;
	}
	public void setBrand(VehicleBrand brand) {
		this.brand = brand;
	}
	public Collection<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(Collection<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	

}
