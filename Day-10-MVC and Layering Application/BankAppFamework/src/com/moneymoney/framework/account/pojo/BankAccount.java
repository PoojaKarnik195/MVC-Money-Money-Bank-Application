package com.moneymoney.framework.account.pojo;

/**
 * 
 * @author Pooja Karnik
 *
 */
public abstract class BankAccount {
	private final int accountNumber;
	private Customer accountHolder;
	private double accountBalance;

	// maintains the next accountNumber
	private static int accountId;

	// gets invoked whenever a class is loaded
	static {
		accountId = 100;
	}

	// gets invoked whenever a new object is created
	{
		this.accountNumber = ++accountId;
	}

	// this is a Ctor..
	public BankAccount(Customer accountHolder, double accountBalance) {
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}

	// For Zero Balance account holders
	public BankAccount(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}

	// getters and setters
	public int getAccountNumber() {
		return accountNumber;
	}

	public Customer getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	// It will give the next account number that will assigned to next account
	// object
	public static int getNextAccountNumber() {
		return accountId + 1;
	}

	// toString method to print all values of the parameters together
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}

	// withdraw function with one parameter amount
	public void withdraw(double amount) {
		accountBalance = (amount <= accountBalance) ? (accountBalance - amount) : accountBalance;
	}
}
