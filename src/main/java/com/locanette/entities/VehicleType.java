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
@Table(name="loc_vehicle_type")
public class VehicleType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2777809400843052808L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String label;
	@Column(length=1)
	private boolean visible;
	@OneToMany(mappedBy="type",fetch=FetchType.LAZY)
	private Collection<Vehicle> vehicles;
	/**
	 * 
	 */
	public VehicleType() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param label
	 * @param visible
	 */
	public VehicleType(String label, boolean visible) {
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
	public Collection<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(Collection<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	
}
