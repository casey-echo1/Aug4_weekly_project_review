package org.example.bankingV1;

import java.util.ArrayList;
import java.util.List;

public class Bank<T extends Account<String>> {
	private List<T> accounts = new ArrayList<>();

	public void addAccount(T account) {
		accounts.add(account);
	}

	//this method loops through entire database until either: it finds matching account or
	// it reaches end of database. This will be inefficient with large data sets
	public T getAccount(Integer accountNumber) {
		for(T account : accounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
		}
		return null;
	}
}
