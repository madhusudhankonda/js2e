package com.madhusudhan.js.basics;

public class CurrentAccount extends BaseAccount{

	public boolean isSavings() {
		return false;
	}

	@Override
	public String toString() {
		return "CurrentAccount [getAccountId()=" + getAccountId()
				+ ", getAccountName()=" + getAccountName() + "]";
	}
	
}
