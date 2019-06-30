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
@Table(name="loc_return_invoice")
public class ReturnInvoice implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1167028108059512007L;
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
	@ManyToOne
	private OrderReturn orderReturn;
	@OneToMany(mappedBy="invoice",fetch=FetchType.LAZY)
	private Collection<ReturnPayment> payments;
	@OneToMany(mappedBy="invoice",fetch=FetchType.LAZY)
	private Collection<ReturnInvoiceHistorical> historicals;
	/**
	 * 
	 */
	public ReturnInvoice() {
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
	 */
	public ReturnInvoice(String code, Date invoiceDate, double tax, double discount, double otherExpenses, double paid,
			boolean visible, OrderReturn orderReturn) {
		super();
		this.code = code;
		this.invoiceDate = invoiceDate;
		this.tax = tax;
		this.discount = discount;
		this.otherExpenses = otherExpenses;
		this.paid = paid;
		this.visible = visible;
		this.orderReturn = orderReturn;
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
	public Collection<ReturnPayment> getPayments() {
		return payments;
	}
	public void setPayments(Collection<ReturnPayment> payments) {
		this.payments = payments;
	}
	public Collection<ReturnInvoiceHistorical> getHistoricals() {
		return historicals;
	}
	public void setHistoricals(Collection<ReturnInvoiceHistorical> historicals) {
		this.historicals = historicals;
	}
	
	
	
	
}
