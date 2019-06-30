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
@Table(name="loc_invoice_payement_historical")
public class InvoicePaymentHistorical implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5668907976399338063L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=200)
	private String code;
	private Date paymentDate;
	private double amount;
	@Column(length=1000)
	private String description;
	@Column(length=1)
	private boolean visible;
	private Invoice invoice;
	@ManyToOne
	private InvoicePayment payment;
	/**
	 * 
	 */
	public InvoicePaymentHistorical() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param paymentDate
	 * @param amount
	 * @param description
	 * @param visible
	 * @param invoice
	 * @param payment
	 */
	public InvoicePaymentHistorical(String code, Date paymentDate, double amount, String description, boolean visible,
			Invoice invoice, InvoicePayment payment) {
		super();
		this.code = code;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.description = description;
		this.visible = visible;
		this.invoice = invoice;
		this.payment = payment;
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
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
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
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public InvoicePayment getPayment() {
		return payment;
	}
	public void setPayment(InvoicePayment payment) {
		this.payment = payment;
	}
	
	

}
