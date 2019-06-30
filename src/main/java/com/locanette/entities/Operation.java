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
@Table(name="loc_operation")
public class Operation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7452010973775964840L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String label;
	@Column(length=1)
	private boolean visible;
	@OneToMany(mappedBy="operation",fetch=FetchType.LAZY)
	private Collection<Order> orders;
	/**
	 * 
	 */
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param label
	 * @param visible
	 */
	public Operation(String label, boolean visible) {
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
	public Collection<Order> getOrders() {
		return orders;
	}
	public void setOrders(Collection<Order> orders) {
		this.orders = orders;
	}
	
	
}
