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
@Table(name="loc_vehicle")
public class Vehicle implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7815644411980150311L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String code;
	@Column(length=200)
	private String registration;
	@Column(length=200)
	private String chassis;
	@Column(length=200)
	private String color;
	@Column(length=200)
	private String fuelName;
	@Column(length=200)
	private String technicalVisit;
	@Column(length=200)
	private String insurance;
	@Column(length=2)
	private long seat;
	private double mileage;
	private double fuelLevel;
	private double oilLevel;
	private double watterLevel;
	@Column(length=1000)
	private String description;
	@Column(length=1)
	private boolean visible;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Product product;
	@ManyToOne
	private VehicleModel model;
	@ManyToOne
	private VehicleType type;
	/**
	 * 
	 */
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param registration
	 * @param chassis
	 * @param model
	 * @param type
	 * @param color
	 * @param fuelName
	 * @param technicalVisit
	 * @param insurance
	 * @param seat
	 * @param mileage
	 * @param fuelLevel
	 * @param oilLevel
	 * @param watterLevel
	 * @param description
	 * @param visible
	 * @param product
	 */
	public Vehicle(String code, String registration, String chassis, VehicleModel model, VehicleType type, String color,
			String fuelName, String technicalVisit, String insurance, long seat, double mileage, double fuelLevel,
			double oilLevel, double watterLevel, String description, boolean visible, Product product) {
		super();
		this.code = code;
		this.registration = registration;
		this.chassis = chassis;
		this.model = model;
		this.type = type;
		this.color = color;
		this.fuelName = fuelName;
		this.technicalVisit = technicalVisit;
		this.insurance = insurance;
		this.seat = seat;
		this.mileage = mileage;
		this.fuelLevel = fuelLevel;
		this.oilLevel = oilLevel;
		this.watterLevel = watterLevel;
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
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public String getChassis() {
		return chassis;
	}
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}
	public VehicleModel getModel() {
		return model;
	}
	public void setModel(VehicleModel model) {
		this.model = model;
	}
	public VehicleType getType() {
		return type;
	}
	public void setType(VehicleType type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuelName() {
		return fuelName;
	}
	public void setFuelName(String fuelName) {
		this.fuelName = fuelName;
	}
	public String getTechnicalVisit() {
		return technicalVisit;
	}
	public void setTechnicalVisit(String technicalVisit) {
		this.technicalVisit = technicalVisit;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public long getSeat() {
		return seat;
	}
	public void setSeat(long seat) {
		this.seat = seat;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getFuelLevel() {
		return fuelLevel;
	}
	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	public double getOilLevel() {
		return oilLevel;
	}
	public void setOilLevel(double oilLevel) {
		this.oilLevel = oilLevel;
	}
	public double getWatterLevel() {
		return watterLevel;
	}
	public void setWatterLevel(double watterLevel) {
		this.watterLevel = watterLevel;
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
