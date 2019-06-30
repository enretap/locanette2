package com.locanette.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="loc_return_payment")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="PAYMENT_TYPE",discriminatorType=DiscriminatorType.STRING,length=50)
public class ReturnPayment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8472582091856865627L;
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
	@ManyToOne
	private ReturnInvoice invoice;
	@OneToMany(mappedBy="payment",fetch=FetchType.LAZY)
	private Collection<ReturnPaymentHistorical> historicals;
	/**
	 * 
	 */
	public ReturnPayment() {
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
	 */
	public ReturnPayment(String code, Date paymentDate, double amount, String description, boolean visible,
			ReturnInvoice invoice) {
		super();
		this.code = code;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.description = description;
		this.visible = visible;
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

	public ReturnInvoice getInvoice() {
		return invoice;
	}

	public void setInvoice(ReturnInvoice invoice) {
		this.invoice = invoice;
	}

	public Collection<ReturnPaymentHistorical> getHistoricals() {
		return historicals;
	}

	public void setHistoricals(Collection<ReturnPaymentHistorical> historicals) {
		this.historicals = historicals;
	}
	
	
	

}
