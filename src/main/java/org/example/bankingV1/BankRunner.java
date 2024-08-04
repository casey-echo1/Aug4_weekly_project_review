package org.example.bankingV1;

import java.sql.SQLOutput;

public class BankRunner {
	public static void main(String[] args) {
		//create new Bank that can accept SavingsAccounts
		Bank<SavingsAccount> chaseBank = new Bank<>();
		//create savingsAccount
		SavingsAccount savingsAccount1 = new SavingsAccount(1234, 2000.0, "Casey", .02);
		//add savingsAccount to chaseBank
		chaseBank.addAccount(savingsAccount1);

		Bank<CheckingAccount> citiBank = new Bank<>();
		CheckingAccount checkingAccount1 = new CheckingAccount(1235, 3000.0, "Macey", 500.0);
		citiBank.addAccount(checkingAccount1);

		Transaction<SavingsAccount> savingDeposit = new Transaction<>(savingsAccount1, 200.0, true);
		savingDeposit.execute();

		Transaction<CheckingAccount> checkingWithdrawal = new Transaction<>(checkingAccount1, 200.0, false);
		checkingWithdrawal.execute();

		System.out.println("Savings Account balance: " + savingsAccount1.getBalance());//expected 2200.0
		System.out.println("Checking Account balance: " + checkingAccount1.getBalance());//2800.0


	}
}
