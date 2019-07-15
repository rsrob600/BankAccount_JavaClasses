package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		
		// instantiation of users
		User user1 = new User();
		User user2 = new User();
		
		User.getCountOfAccounts();
		User.getAccountAmountTotals();
		
		User user3 = new User();
		
		
		// User1 Activity
	    System.out.println("----------------User 1 Info---------------------");
		System.out.println(user1.getAccountNumber());
	    user1.displayBalance();
	       
		System.out.println("-------Deposits-------");
		user1.deposit("savings", 50.00);
		user1.deposit("savings", 250.00);
		System.out.println("------");
		user1.deposit("checking", 1000.00);
		user1.deposit("checking", 35.00);
		
		System.out.println("-------Withdraws-------");
		user1.withdraw("savings", 500.00);
		user1.withdraw("savings", 400.00);
		user1.withdraw("savings", 300.00);
		System.out.println("------");
		user1.withdraw("checking", 500.00);
		
		System.out.println("-------Ending Balance-------");
		System.out.println(user1.getAccountNumber()); 
		user1.displayBalance();
		
		
		
		System.out.println("");
		
		
		// User2 Activity
	    System.out.println("----------------User 2 Info---------------------");
	    System.out.println(user2.getAccountNumber());
	    user2.displayBalance();
	    
	    System.out.println("-------Deposits-------");
		user2.deposit("savings", 1000.00);
		user2.deposit("savings", 55.35);
		System.out.println("------");
		user2.deposit("checking", 800.00);
		user2.deposit("checking", 47.18);
		user2.deposit("checking", 2000.00);
		
		System.out.println("-------Withdraws-------");
		user2.withdraw("savings", 5.00);
		user2.withdraw("checking", 45.00);
		System.out.println("------");
		user2.withdraw("checking", 3500.00);
		user2.withdraw("checking", 3200.00);
		user2.withdraw("checking", 2800.00);
		
		System.out.println("-------Ending Balance-------");
		System.out.println(user2.getAccountNumber());
		user2.displayBalance();

		
		System.out.println("");
		
		
		// All User Activity
	    System.out.println("----------------User Summary---------------------");
		User.getCountOfAccounts();
		User.getAccountAmountTotals();
		
		
		
	}

}
