package com.training;

public class SavingsAccount extends BankAccount {
	
	private String nomineeName;
	
	public SavingsAccount(){
		super();
	}
	
	public SavingsAccount(int accountNumber, String name, double balance, String nomineeName){
		super(accountNumber, name, balance);
		this.nomineeName = nomineeName;
	}
	
	public String getNomineeName(){
		return this.nomineeName;
	}
	
	public void setNomineeName(String name){
		this.nomineeName = name;
	}
	
	@Override
	public double withdraw(double withdrawalAmount){
		double minBalance = 5000;
		
		if(super.getBalance() - withdrawalAmount < minBalance && withdrawalAmount > 0){
			System.out.println("Withdrawal denied.");
			return super.getBalance();
		}
		else{
			return super.withdraw(withdrawalAmount);
		}
	}
	
	@Override
	public String toString(){
		String result = "";
		result += "Savings account " + super.getAccountNumber();
		result += " belonging to " + super.getAccountHolderName() + "\n";
		result += "Balance: " + super.getBalance() + "\n";
		result += "Nominee: " + this.getNomineeName();
		return result;
	}

}
