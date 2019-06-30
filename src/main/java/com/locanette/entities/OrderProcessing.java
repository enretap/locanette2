package com.locanette.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="loc_order_processing")
public class OrderProcessing implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3684129018438795852L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String code;
	private Date startedDate;
	private Date finishedDate;
	@Column(length=200)
	private String description;
	@Column(length=1)
	private boolean visible;
	@OneToOne(fetch=FetchType.LAZY)
	private Order order;
	@ManyToOne
	private Agent agent;
	/**
	 * 
	 */
	public OrderProcessing() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param startedDate
	 * @param finishedDate
	 * @param description
	 * @param visible
	 * @param order
	 * @param agent
	 */
	public OrderProcessing(String code, Date startedDate, Date finishedDate, String description, boolean visible,
			Order order, Agent agent) {
		super();
		this.code = code;
		this.startedDate = startedDate;
		this.finishedDate = finishedDate;
		this.description = description;
		this.visible = visible;
		this.order = order;
		this.agent = agent;
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
	public Date getStartedDate() {
		return startedDate;
	}
	public void setStartedDate(Date startedDate) {
		this.startedDate = startedDate;
	}
	public Date getFinishedDate() {
		return finishedDate;
	}
	public void setFinishedDate(Date finishedDate) {
		this.finishedDate = finishedDate;
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
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	
	

}
