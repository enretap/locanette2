package com.locanette.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loc_return_invoice_historical")
public class ReturnInvoiceHistorical implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2193063921328153576L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String code;
	@Column(length=200)
	private Date invoiceDate;
	private double tax;
	private double discount;
	private double otherExpenses;
	private double paid;
	@Column(length=1)
	private boolean visible;
	private OrderReturn orderReturn;
	@ManyToOne
	private ReturnInvoice invoice;
	/**
	 * 
	 */
	public ReturnInvoiceHistorical() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param invoiceDate
	 * @param tax
	 * @param discount
	 * @param otherExpenses
	 * @param paid
	 * @param visible
	 * @param orderReturn
	 * @param invoice
	 */
	public ReturnInvoiceHistorical(String code, Date invoiceDate, double tax, double discount, double otherExpenses,
			double paid, boolean visible, OrderReturn orderReturn, ReturnInvoice invoice) {
		super();
		this.code = code;
		this.invoiceDate = invoiceDate;
		this.tax = tax;
		this.discount = discount;
		this.otherExpenses = otherExpenses;
		this.paid = paid;
		this.visible = visible;
		this.orderReturn = orderReturn;
		this.invoice = invoice;
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
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getOtherExpenses() {
		return otherExpenses;
	}
	public void setOtherExpenses(double otherExpenses) {
		this.otherExpenses = otherExpenses;
	}
	public double getPaid() {
		return paid;
	}
	public void setPaid(double paid) {
		this.paid = paid;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public OrderReturn getOrderReturn() {
		return orderReturn;
	}
	public void setOrderReturn(OrderReturn orderReturn) {
		this.orderReturn = orderReturn;
	}
	public ReturnInvoice getInvoice() {
		return invoice;
	}
	public void setInvoice(ReturnInvoice invoice) {
		this.invoice = invoice;
	}
	
	

}
