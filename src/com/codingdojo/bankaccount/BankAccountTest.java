package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		
		// instantiation of users
		BankAccount user1 = new BankAccount(200, 500);
		BankAccount user2 = new BankAccount(0.00, 500);
		
		BankAccount.getCountOfAccounts();
		BankAccount.getAmountTotals();
		
		
		BankAccount user3 = new BankAccount();
		
		
		// User1 Activity
	    System.out.println("----------------User 1 Info---------------------");
		System.out.println(user1.getAccountNumber());
	    user1.displayBalance();
	    System.out.println("");
	       
		System.out.println("-------Deposits-------");
		// Savings
		user1.deposit(1, 50.00);
		user1.deposit(1, 250.00);
		System.out.println("------");
		// Checking
		user1.deposit(2, 1000.00);
		user1.deposit(2, 35.00);
		System.out.println("");
		
		System.out.println("-------Withdraws-------");
		// Savings
		user1.withdraw(1, 500.00);
		user1.withdraw(1, 400.00);
		user1.withdraw(1, 300.00);
		System.out.println("------");
		// Checking
		user1.withdraw(2, 500.00);
		System.out.println("");
		
		System.out.println("-------Ending Balance-------");
		System.out.println(user1.getAccountNumber()); 
		user1.displayBalance();
		
		
		System.out.println("");
		
		
		// User2 Activity
	    System.out.println("----------------User 2 Info---------------------");
	    System.out.println(user2.getAccountNumber());
	    user2.displayBalance();
	    System.out.println("");
	    
	    System.out.println("-------Deposits-------");
	    // Savings
		user2.deposit(1, 1000.00);
		user2.deposit(1, 55.35);
		System.out.println("------");
		// Checking
		user2.deposit(2, 800.00);
		user2.deposit(2, 47.18);
		user2.deposit(2, 2000.00);
		System.out.println("");
		
		System.out.println("-------Withdraws-------");
		// Savings
		user2.withdraw(1, 5.00);
		// Checking
		user2.withdraw(2, 45.00);
		System.out.println("------");
		// Checking
		user2.withdraw(2, 3500.00);
		user2.withdraw(2, 3200.00);
		user2.withdraw(2, 2800.00);
		System.out.println("");
		
		System.out.println("-------Ending Balance-------");
		System.out.println(user2.getAccountNumber());
		user2.displayBalance();

		
		System.out.println("");
		
		
		// All User Activity
	    System.out.println("----------------User Summary---------------------");
	    BankAccount.getCountOfAccounts();
		BankAccount.getAmountTotals();
		
		
		
	}

}
