package com.madhusudhan.js.basics;

public class AccountManager {

	public void create(IAccount account) {
		System.out.println("Account created: [ "+account+" ]");
	}

	public void transfer(IAccount accountFrom, IAccount accountTo, double amount) {
		System.out.printf("Transferred {} from {} to {} ", amount, accountFrom, accountTo);
	}
}
