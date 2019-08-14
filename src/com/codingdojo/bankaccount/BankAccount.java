package com.codingdojo.bankaccount;

import java.util.Random;

public class BankAccount {
	
	// Member instance attributes
	private Double checkingBalance;
	private Double savingsBalance;
	private String accountNumber;
	
	// Class specific static attributes
	private static int numberOfAccounts;
	private static double totalAmount;
	
	// Class specific static attributes for random account number generation
	private static Random random = new Random();
	private static String getRandom() {
		// Random 10 digit account number
		return Integer.toString(random.nextInt(1000000000)+1000000000);
	}
	
	// Constructor (opening with null specification)
	public BankAccount() {
		this.accountNumber = getRandom();
		this.checkingBalance = 0.00;
		this.savingsBalance = 0.00;
		numberOfAccounts++;
	}
	
	// Constructor (opening with deposit)
	public BankAccount(double checking, double savings) {
		this.accountNumber = getRandom();
		this.checkingBalance = checking;
		this.savingsBalance = savings;
		numberOfAccounts++;
		totalAmount += (this.checkingBalance + this.savingsBalance);
	}
	
	/** <----------------------Getters methods---------------------->
	 *  >> No setters for security - users should ONLY be able make changes to account balances via the
	 *  deposit OR withdraw METHODS! otherwise they can directly add money to their account
	 * */
	public String getAccountNumber() {return accountNumber;}
	public Double getCheckingBalance() {return checkingBalance;}
	public Double getSavingsBalance() {return savingsBalance;}
	
	// Find out how many total accounts there are for the bank
	public static int getCountOfAccounts() {
		System.out.println("There are currently " + numberOfAccounts + " Accounts at this time.");
		return numberOfAccounts;
	}	
	
	// Find total amount of all accounts for the bank
	public static Double getAmountTotals() {
		System.out.println("Total account summary is: $" + String.format("%.2f",totalAmount));
		return totalAmount;
	}	
	

	// ---------------------Deposit Method------------------------>
		//Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
		public void deposit(int accountType, Double amount) {
			if(accountType == 1) {
				this.savingsBalance += amount;
				totalAmount += amount;
				System.out.println("Your deposit of $" + String.format("%.2f",amount) + " has been accepted into your savings account, your new balance is: $" + String.format("%.2f",this.getSavingsBalance()));
			}
			else if(accountType == 2) {
				this.checkingBalance += amount;
				totalAmount += amount;
				System.out.println("Your deposit of $" + String.format("%.2f",amount) + " has been accepted into your checking account, your new balance is: $" + String.format("%.2f",this.getCheckingBalance()));
			}
			
		}
		

		// ---------------------Withdraw Method------------------------>
		//Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
		public void withdraw(int accountType, Double amount) {
			if(accountType == 1) {
				if(this.getSavingsBalance() - amount < 0) {
					System.out.println("Insufficient funds to withdraw $" + String.format("%.2f",amount) + ", please try again. Your current balance is: $" + String.format("%.2f",this.getSavingsBalance()));
				}
				else if(this.getSavingsBalance() - amount >= 0){
					this.savingsBalance -= amount;
					totalAmount -= amount;
					System.out.println("Your withdraw of $" + String.format("%.2f",amount) + " has been debited from your savings account, your new balance is: $" + String.format("%.2f",this.getSavingsBalance()));
				}
					
			}
			if(accountType == 2) {
				if(this.getCheckingBalance() - amount < 0) {
					System.out.println("Insufficient funds to withdraw $" + String.format("%.2f",amount) + ", please try again. Your current balance is: $" + String.format("%.2f",this.getCheckingBalance()));
				}
				else if(this.getCheckingBalance() - amount >= 0) {
					this.checkingBalance -= amount;
					totalAmount -= amount;
					System.out.println("Your withdraw of $" + String.format("%.2f",amount) + " has been debited from your checking account, your new balance is: $" + String.format("%.2f",this.getCheckingBalance()));
				}
				
			}
			
		}
		

		// ---------------------Get Balances Method------------------------>
		//Create a method to see the total money from the checking and saving.
		public void displayBalance() {
			System.out.println("Your current checking balance is: $" + String.format("%.2f",this.getCheckingBalance()));
			System.out.println("Your current savings balance is: $" + String.format("%.2f",this.getSavingsBalance()));
		}
	

}
