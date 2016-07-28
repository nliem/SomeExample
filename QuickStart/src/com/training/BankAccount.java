package com.training;

public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount(){
		
	}
	
	public BankAccount(int accountNumber, String name, double balance){
		this.accountNumber = accountNumber;
		this.accountHolderName = name;
		this.balance = balance;
	}
	
	public int getAccountNumber(){
		return this.accountNumber;
	}
	
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public String getAccountHolderName(){
		return this.accountHolderName;
	}
	
	public void setAccountHolderName(String name){
		this.accountHolderName = name;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double deposit(double depositAmount){
		if(depositAmount < 0){
			System.out.println("Cannot deposit a negative amount. Deposit denied.");
			return this.balance;
		}
		this.balance += depositAmount;
		return this.balance;
	}
	
	public double withdraw(double withdrawalAmount){
		if(withdrawalAmount < 0){
			System.out.println("Cannot withdraw a negative amount. Withdrawal denied.");
			return this.balance;
		}
		this.balance -= withdrawalAmount;
		return this.balance;
	}
	
	@Override
	public String toString(){
		return "Bank account " + this.accountNumber + " belonging to " + this.accountHolderName + "\nBalance: " + this.balance;
	}

}
