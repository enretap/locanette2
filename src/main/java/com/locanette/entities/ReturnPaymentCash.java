package com.locanette.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Cash")
public class ReturnPaymentCash extends ReturnPayment{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8320579550378490498L;
	@Column(length=200)
	private String checkout;
	/**
	 * 
	 */
	public ReturnPaymentCash() {
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
	 * @param checkout
	 */
	public ReturnPaymentCash(String code, Date paymentDate, double amount, String description, boolean visible,
			ReturnInvoice invoice, String checkout) {
		super(code, paymentDate, amount, description, visible, invoice);
		this.checkout = checkout;
	}

	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	
	

}
