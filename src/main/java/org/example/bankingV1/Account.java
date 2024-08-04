package org.example.bankingV1;

public class Account<T> {
	// need to look further into purpose of "private" modifier here
	private Integer accountNumber;
	private double balance;
	private T accountHolder; //benefit of generic here?

	public Account(Integer accountNumber, double balance, T accountHolder) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolder = accountHolder;
	}

	//getters
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public T getAccountHolder() {
		return accountHolder;
	}
	//setters
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAccountHolder(T accountHolder) {
		this.accountHolder = accountHolder;
	}

	//business methods
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		if(amount <= balance) balance -= amount;
		else System.out.println("Insufficient balance");
	}

	//Override methods
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", accountHolder=" + accountHolder;
	}
}
