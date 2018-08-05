package com.moneymoney.app.model.account.pojo;

import com.moneymoney.framework.account.pojo.CurrentAccount;
import com.moneymoney.framework.account.pojo.Customer;

/**
 * @author Pooja Karnik
 * 
 *         Inheriting the CurrentAccount parameters from BankApp
 *
 */
public class MMCurrentAccount extends CurrentAccount {

	public MMCurrentAccount(Customer accountHolder, double accountBalance, double odLimit) {

		super(accountHolder, accountBalance, odLimit);
	}
}
