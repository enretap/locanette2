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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="loc_order")
public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2620380488682378909L;
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
	
	@ManyToOne
	private Customer customer;
	@ManyToOne
	
	private Operation operation;
	@OneToOne(mappedBy="order",fetch=FetchType.LAZY)
	private OrderProcessing orderProcessing;
	@OneToOne(mappedBy="order",fetch=FetchType.LAZY)
	private Delivery delivery;
	@OneToOne(mappedBy="order",fetch=FetchType.LAZY)
	private OrderReturn orderReturn;
	@OneToOne(mappedBy="order",fetch=FetchType.LAZY)
	private Invoice invoice;
	@OneToMany(mappedBy="order",fetch=FetchType.LAZY)
	private Collection<OrderHistorical> historicals;
	@OneToMany(mappedBy="order",fetch=FetchType.LAZY)
	private Collection<OrderProduct> products;
	
	/**
	 * 
	 */
	public Order() {
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
	 */
	public Order(String code, boolean processingStatus, boolean deliveryStatus, boolean returnStatus, Date orderDate,
			long rentalPeriod, Date deliveryDateSet, Date returnDateSet, String deliveyPlace, boolean visible,
			Customer customer, Operation operation) {
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
	public OrderProcessing getOrderProcessing() {
		return orderProcessing;
	}
	public void setOrderProcessing(OrderProcessing orderProcessing) {
		this.orderProcessing = orderProcessing;
	}
	public Delivery getDelivery() {
		return delivery;
	}
	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}
	public OrderReturn getOrderReturn() {
		return orderReturn;
	}
	public void setOrderReturn(OrderReturn orderReturn) {
		this.orderReturn = orderReturn;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public Collection<OrderHistorical> getHistoricals() {
		return historicals;
	}
	public void setHistoricals(Collection<OrderHistorical> historicals) {
		this.historicals = historicals;
	}
	public Collection<OrderProduct> getProducts() {
		return products;
	}
	public void setProducts(Collection<OrderProduct> products) {
		this.products = products;
	}
	
	

}
