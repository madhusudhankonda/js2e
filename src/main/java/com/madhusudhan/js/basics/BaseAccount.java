package com.madhusudhan.js.basics;

public abstract class BaseAccount implements IAccount{

	private int accountId = -1;
	
	private String accountName = null;
	
	private double accountBalanace = 0.0;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAccountBalanace() {
		return accountBalanace;
	}

	public void setAccountBalanace(double accountBalanace) {
		this.accountBalanace = accountBalanace;
	}
	
}
