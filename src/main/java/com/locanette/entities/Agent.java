package com.locanette.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="loc_agent")
public class Agent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9126403963637321716L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String code;
	@Column(length=200)
	private String name;
	@Column(length=200)
	private String firstName;
	@Column(length=200)
	private Date birthDate;
	@Column(length=200)
	private String birthPlace;
	@Column(length=200)
	private String civility;
	@Column(length=200)
	private String home;
	@Column(length=200)
	private String phoneNumber;
	@Column(length=200)
	private String email;
	@Column(length=200)
	private String picture;
	@Column(length=1)
	private boolean visible;
	@ManyToOne
	private AgentService service;
	@OneToMany(mappedBy="agent",fetch=FetchType.LAZY)
	private Collection<OrderProcessing> processings;
	/**
	 * 
	 */
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param name
	 * @param firstName
	 * @param birthDate
	 * @param birthPlace
	 * @param civility
	 * @param home
	 * @param phoneNumber
	 * @param email
	 * @param picture
	 * @param visible
	 * @param service
	 */
	public Agent(String code, String name, String firstName, Date birthDate, String birthPlace, String civility,
			String home, String phoneNumber, String email, String picture, boolean visible, AgentService service) {
		super();
		this.code = code;
		this.name = name;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		this.civility = civility;
		this.home = home;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.picture = picture;
		this.visible = visible;
		this.service = service;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getCivility() {
		return civility;
	}
	public void setCivility(String civility) {
		this.civility = civility;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
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
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public AgentService getService() {
		return service;
	}
	public void setService(AgentService service) {
		this.service = service;
	}
	public Collection<OrderProcessing> getProcessings() {
		return processings;
	}
	public void setProcessings(Collection<OrderProcessing> processings) {
		this.processings = processings;
	}
	
	

}
