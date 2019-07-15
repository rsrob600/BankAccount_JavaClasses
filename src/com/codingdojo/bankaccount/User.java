package com.codingdojo.bankaccount;

public class User extends BankAccount {
	
	
	
	// ---------------------Deposit Method------------------------>
	//Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
	public void deposit(String accountType, Double amount) {
		if(accountType == "savings") {
			this.setSavingsBalance(this.getSavingsBalance() + amount);
			System.out.println("Your deposit of $" + String.format("%.2f",amount) + " has been accepted into your savings account, your new balance is: $" + String.format("%.2f",this.getSavingsBalance()));
		}
		if(accountType == "checking") {
			this.setCheckingBalance(this.getCheckingBalance() + amount);
			System.out.println("Your deposit of $" + String.format("%.2f",amount) + " has been accepted into your checking account, your new balance is: $" + String.format("%.2f",this.getCheckingBalance()));
		}
		
	}
	

	// ---------------------Withdraw Method------------------------>
	//Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
	public void withdraw(String accountType, Double amount) {
		if(accountType == "savings") {
			if(this.getSavingsBalance() - amount < 0) {
				System.out.println("Insufficient funds to withdraw $" + String.format("%.2f",amount) + ", please try again. Your current balance is: $" + String.format("%.2f",this.getSavingsBalance()));
			}
			else if(this.getSavingsBalance() - amount >= 0){
				this.setSavingsBalance(this.getSavingsBalance() - amount);
				System.out.println("Your withdraw of $" + String.format("%.2f",amount) + " has been debited from your savings account, your new balance is: $" + String.format("%.2f",this.getSavingsBalance()));
			}
				
		}
		if(accountType == "checking") {
			if(this.getCheckingBalance() - amount < 0) {
				System.out.println("Insufficient funds to withdraw $" + String.format("%.2f",amount) + ", please try again. Your current balance is: $" + String.format("%.2f",this.getCheckingBalance()));
			}
			else if(this.getCheckingBalance() - amount >= 0) {
				this.setCheckingBalance(this.getCheckingBalance() - amount);
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
	
	
	
	//Users should not be able to set any of the attributes from the class.
	

}
