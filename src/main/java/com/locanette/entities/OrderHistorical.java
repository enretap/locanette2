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
@Table(name="loc_order_historical")
public class OrderHistorical implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 646155988587130606L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
    @Column(length=200)
	private String code;
    @Column(length=1)
	private boolean processingStatus;
    @Column(length=1)
	private boolean deliveryStatus;
    @Column(length=1)
	private boolean returnStatus;
	private Date orderDate;
	@Column(length=20)
	private long rentalPeriod;
	private Date deliveryDateSet;
	private Date returnDateSet;
	@Column(length=1000)
	private String deliveyPlace;
	@Column(length=1)
	private boolean visible;
	private Customer customer;
	private Operation operation;
	@ManyToOne
	private Order order;
	@OneToMany(mappedBy="orderHistorical",fetch=FetchType.LAZY)
	private Collection<OrderProductHistorical> products;
	/**
	 * 
	 */
	public OrderHistorical() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param processingStatus
	 * @param deliveryStatus
	 * @param returnStatus
	 * @param orderDate
	 * @param rentalPeriod
	 * @param deliveryDateSet
	 * @param returnDateSet
	 * @param deliveyPlace
	 * @param visible
	 * @param customer
	 * @param operation
	 * @param order
	 */
	public OrderHistorical(String code, boolean processingStatus, boolean deliveryStatus, boolean returnStatus,
			Date orderDate, long rentalPeriod, Date deliveryDateSet, Date returnDateSet, String deliveyPlace,
			boolean visible, Customer customer, Operation operation, Order order) {
		super();
		this.code = code;
		this.processingStatus = processingStatus;
		this.deliveryStatus = deliveryStatus;
		this.returnStatus = returnStatus;
		this.orderDate = orderDate;
		this.rentalPeriod = rentalPeriod;
		this.deliveryDateSet = deliveryDateSet;
		this.returnDateSet = returnDateSet;
		this.deliveyPlace = deliveyPlace;
		this.visible = visible;
		this.customer = customer;
		this.operation = operation;
		this.order = order;
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
	public boolean isProcessingStatus() {
		return processingStatus;
	}
	public void setProcessingStatus(boolean processingStatus) {
		this.processingStatus = processingStatus;
	}
	public boolean isDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(boolean deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public boolean isReturnStatus() {
		return returnStatus;
	}
	public void setReturnStatus(boolean returnStatus) {
		this.returnStatus = returnStatus;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public long getRentalPeriod() {
		return rentalPeriod;
	}
	public void setRentalPeriod(long rentalPeriod) {
		this.rentalPeriod = rentalPeriod;
	}
	public Date getDeliveryDateSet() {
		return deliveryDateSet;
	}
	public void setDeliveryDateSet(Date deliveryDateSet) {
		this.deliveryDateSet = deliveryDateSet;
	}
	public Date getReturnDateSet() {
		return returnDateSet;
	}
	public void setReturnDateSet(Date returnDateSet) {
		this.returnDateSet = returnDateSet;
	}
	public String getDeliveyPlace() {
		return deliveyPlace;
	}
	public void setDeliveyPlace(String deliveyPlace) {
		this.deliveyPlace = deliveyPlace;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Operation getOperation() {
		return operation;
	}
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Collection<OrderProductHistorical> getProducts() {
		return products;
	}
	public void setProducts(Collection<OrderProductHistorical> products) {
		this.products = products;
	}
	
	

}
