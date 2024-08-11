package uk.lset.model;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accountservice")
public class Account {
 @Id
 @UuidGenerator
	private String id;
	
	private double annualincome;
	
	private double monthlyexpenses;
	
	private String accounttype;
	
	private String accountHolderName;
	
	private double balance;
	
	private String currency;
    
	private String userId;
	
	@CreationTimestamp
    private LocalDate creationOn;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getAnnualincome() {
		return annualincome;
	}

	public void setAnnualincome(double annualincome) {
		this.annualincome = annualincome;
	}

	public double getMonthlyexpenses() {
		return monthlyexpenses;
	}

	public void setMonthlyexpenses(double monthlyexpenses) {
		this.monthlyexpenses = monthlyexpenses;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public LocalDate getCreationOn() {
		return creationOn;
	}

	public void setCreationOn(LocalDate creationOn) {
		this.creationOn = creationOn;
	}
	
	
	
}
