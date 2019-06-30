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
@Table(name="loc_invoice")
public class Invoice implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7200571472299374230L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String code;
	private Date invoiceDate;
	private double caution;
	private double tax;
	private double discount;
	private double transportation;
	private double otherExpenses;
	private double paid;
	@Column(length=1)
	private boolean visible;
	@ManyToOne
	private Order order;
	@OneToMany(mappedBy="invoice",fetch=FetchType.LAZY)
	private Collection<InvoicePayment> payments;
	@OneToMany(mappedBy="invoice",fetch=FetchType.LAZY)
	private Collection<InvoiceHistorical> historicals;
	/**
	 * 
	 */
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param invoiceDate
	 * @param caution
	 * @param tax
	 * @param discount
	 * @param transportation
	 * @param otherExpenses
	 * @param paid
	 * @param visible
	 * @param order
	 */
	public Invoice(String code, Date invoiceDate, double caution, double tax, double discount, double transportation,
			double otherExpenses, double paid, boolean visible, Order order) {
		super();
		this.code = code;
		this.invoiceDate = invoiceDate;
		this.caution = caution;
		this.tax = tax;
		this.discount = discount;
		this.transportation = transportation;
		this.otherExpenses = otherExpenses;
		this.paid = paid;
		this.visible = visible;
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
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public double getCaution() {
		return caution;
	}
	public void setCaution(double caution) {
		this.caution = caution;
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
	public double getTransportation() {
		return transportation;
	}
	public void setTransportation(double transportation) {
		this.transportation = transportation;
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
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Collection<InvoicePayment> getPayments() {
		return payments;
	}
	public void setPayments(Collection<InvoicePayment> payments) {
		this.payments = payments;
	}
	public Collection<InvoiceHistorical> getHistoricals() {
		return historicals;
	}
	public void setHistoricals(Collection<InvoiceHistorical> historicals) {
		this.historicals = historicals;
	}
	
	

}
