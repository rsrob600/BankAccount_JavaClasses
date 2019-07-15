package com.codingdojo.bankaccount;

import java.util.ArrayList;
import java.util.Random;

//-->> Create a BankAccount class.
public class BankAccount {
	
	
	// -->> The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance.
	private Double checkingBalance = 0.00;
	private Double savingsBalance = 0.00;
	private String accountNumber;
	
	
	
	// ----------------------Random String Attributes----------------------->
	// -->> Create a private method that returns a random ten digit account number.
	private String accRandom() {
		Random r = new Random();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			arr.add(r.nextInt((9 - 0) + 1) + 0);
		}
				
		// Create temp buffer to store each array character before returning them as a
		// single string
		StringBuffer b = new StringBuffer();

		for (Integer s : arr) { // enhanced for-loop to iterate each character of the array
			b.append(s); // append each array character to the temp buffer
		}

		return b.toString(); // return the temp buffer as string
	}

	
	
	// ----------------------Account Number Tracking Attributes----------------------->
	//Create a class member (static) that has the number of accounts created thus far.
	private static int numberOfAccounts = 0;
	
	
	//Create a class member (static) that tracks the total amount of money stored in every account created.
	private static Double accountAmountTotals = 0.00;
	
	

	// ----------------------Default Constructor Attributes----------------------->
	// default constructor
	public BankAccount() {
		
		//In the constructor, call the private method from above so that each user has a random ten digit account.
		this.accountNumber = accRandom();
		
		//In the constructor, be sure to increment the account count.
		numberOfAccounts++;
		
	}

		

	// ---------------------Account Number Count Method------------------------>
	// Find out how many users there are
	public static int getCountOfAccounts() {
		System.out.println("There are currently " + numberOfAccounts + " Accounts at this time.");
		return numberOfAccounts;
	}	
	

	// ---------------------Account Amount Totals Method------------------------>
	// Find total amount of each account
	public static Double getAccountAmountTotals() {
		
		System.out.println("Total account summary is: $" + String.format("%.2f",accountAmountTotals));
		return accountAmountTotals;
	}	
	
	
	
	
	
	// -------------------------------------Getters and Setters---------------------------------------->
	
	
	// ---------------------Account Number Attributes------------------------>
	// Account Number Getter Method
	public String getAccountNumber() {
		return accountNumber;
	}

	
	// ---------------------Checking Attributes------------------------>
	// -->> Create a getter method for the user's checking account balance.
	public Double getCheckingBalance() {
		return checkingBalance;
	}
	
	// Setter
	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	
	
	// ---------------------Savings Attributes------------------------>
	// -->> Create a getter method for the user's saving account balance.
	public Double getSavingsBalance() {
		return savingsBalance;
	}
	
	// Setter
	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	


}
