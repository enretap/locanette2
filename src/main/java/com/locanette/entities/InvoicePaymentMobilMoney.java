package com.locanette.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Mobil Money")
public class InvoicePaymentMobilMoney extends InvoicePayment{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5207799865334737924L;
	@Column(length=200)
	private String transationCode;
	@Column(length=200)
	private String phoneNumer;
	/**
	 * 
	 */
	public InvoicePaymentMobilMoney() {
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
	 * @param transationCode
	 * @param phoneNumer
	 */
	public InvoicePaymentMobilMoney(String code, Date paymentDate, double amount, String description, boolean visible,
			Invoice invoice, String transationCode, String phoneNumer) {
		super(code, paymentDate, amount, description, visible, invoice);
		this.transationCode = transationCode;
		this.phoneNumer = phoneNumer;
	}
	public String getTransationCode() {
		return transationCode;
	}
	public void setTransationCode(String transationCode) {
		this.transationCode = transationCode;
	}
	public String getPhoneNumer() {
		return phoneNumer;
	}
	public void setPhoneNumer(String phoneNumer) {
		this.phoneNumer = phoneNumer;
	}
	
	

}
