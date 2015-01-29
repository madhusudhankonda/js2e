package com.madhusudhan.js.basics;

import org.junit.Test;

public class AccountManagerTest {

	private double balance = 0.0;
	
	@Test
	public void testCheckBalance() {
		AccountManager am = new AccountManager();
		
		IAccount currentAccount = new CurrentAccount();
		am.create(currentAccount);
	
		IAccount savingsAccount = new SavingsAccount();
		am.create(savingsAccount);
	}

	@Test
	public void _testAccountTransfer() throws Exception {
		AccountManager am = new AccountManager();
		IAccount accountFrom = new CurrentAccount();
		IAccount accountTo = new SavingsAccount();
		
		double amount = 0.0;
		
		am.transfer(accountFrom, accountTo, amount);
	}
}
