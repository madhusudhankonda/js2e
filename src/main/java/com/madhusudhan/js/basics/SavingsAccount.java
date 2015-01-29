package com.madhusudhan.js.basics;

public class SavingsAccount extends BaseAccount {
	private double interestRate = 1.0;
	private double montlyInterest = 0.0;
	private boolean savings;
	public SavingsAccount(){
		setSavings(true);
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getMontlyInterest() {
		return montlyInterest;
	}

	public void setMontlyInterest(double montlyInterest) {
		this.montlyInterest = montlyInterest;
	}

	public boolean isSavings() {
		return savings;
	}

	public void setSavings(boolean savings) {
		this.savings = savings;
	}

	@Override
	public String toString() {
		return "SavingsAccount [getAccountId()=" + getAccountId()
				+ ", getAccountName()=" + getAccountName() + "]";
	}

}
