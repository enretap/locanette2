package com.locanette.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Check")
public class ReturnPaymentCheck extends ReturnPayment{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1099662114343360905L;
	@Column(length=200)
	private String checkNumber;
	@Column(length=200)
	private String banqueName;
	/**
	 * 
	 */
	public ReturnPaymentCheck() {
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
	public ReturnPaymentCheck(String code, Date paymentDate, double amount, String description, boolean visible,
			ReturnInvoice invoice, String checkNumber, String banqueName) {
		super(code, paymentDate, amount, description, visible, invoice);
		this.checkNumber = checkNumber;
		this.banqueName = banqueName;
	}

	public String getCheckNumber() {
		return checkNumber;
	}
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	public String getBanqueName() {
		return banqueName;
	}
	public void setBanqueName(String banqueName) {
		this.banqueName = banqueName;
	}
	
	

}
