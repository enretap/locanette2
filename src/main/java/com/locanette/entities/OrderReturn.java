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
@Table(name="loc_order_return")
public class OrderReturn implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7274535104000000477L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String code;
	private Date returnDate;
	@Column(length=1000)
	private String comment;
	@Column(length=1)
	private boolean visible;
	@OneToOne(fetch=FetchType.LAZY)
	private Order order;
	@ManyToOne
	private Storekeeper storekeeper;
	@OneToOne(mappedBy="orderReturn",fetch=FetchType.LAZY)
	private ReturnInvoice invoice;
	/**
	 * 
	 */
	public OrderReturn() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param returnDate
	 * @param comment
	 * @param visible
	 * @param order
	 * @param storekeeper
	 */
	public OrderReturn(String code, Date returnDate, String comment, boolean visible, Order order,
			Storekeeper storekeeper) {
		super();
		this.code = code;
		this.returnDate = returnDate;
		this.comment = comment;
		this.visible = visible;
		this.order = order;
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
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
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
	public Storekeeper getStorekeeper() {
		return storekeeper;
	}
	public void setStorekeeper(Storekeeper storekeeper) {
		this.storekeeper = storekeeper;
	}
	public ReturnInvoice getInvoice() {
		return invoice;
	}
	public void setInvoice(ReturnInvoice invoice) {
		this.invoice = invoice;
	}
	
	

}
