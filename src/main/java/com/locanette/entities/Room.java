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
@Table(name="loc_room")
public class Room implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3937199505142557586L;
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
	@Column(length=20)
	private long capacity;
	@Column(length=1000)
	private String description;
	@Column(length=1)
	private boolean visible;
	@ManyToOne
	private RoomType type;
	@OneToOne(fetch=FetchType.LAZY)
	private Product product;
	/**
	 * 
	 */
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param name
	 * @param localization
	 * @param coordinates
	 * @param capacity
	 * @param description
	 * @param visible
	 * @param type
	 * @param product
	 */
	public Room(String code, String name, String localization, String coordinates, long capacity, String description,
			boolean visible, RoomType type, Product product) {
		super();
		this.code = code;
		this.name = name;
		this.localization = localization;
		this.coordinates = coordinates;
		this.capacity = capacity;
		this.description = description;
		this.visible = visible;
		this.type = type;
		this.product = product;
	}
	
	
	

}
