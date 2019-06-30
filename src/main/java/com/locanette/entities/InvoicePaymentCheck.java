package com.locanette.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Check")
public class InvoicePaymentCheck extends InvoicePayment{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6864420765166885988L;
	@Column(length=200)
	private String checkNumber;
	@Column(length=200)
	private String banqueName;
	/**
	 * 
	 */
	public InvoicePaymentCheck() {
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
	 * @param checkNumber
	 * @param banqueName
	 */
	public InvoicePaymentCheck(String code, Date paymentDate, double amount, String description, boolean visible,
			Invoice invoice, String checkNumber, String banqueName) {
		super(code, paymentDate, amount, description, visible, invoice);
		this.checkNumber = checkNumber;
		this.banqueName = banqueName;
	}
	
	
	

}
