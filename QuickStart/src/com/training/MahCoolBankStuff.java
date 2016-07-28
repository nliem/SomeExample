package com.training;

public class MahCoolBankStuff {
	
	public static void main(String[] args){
		SavingsAccount nLiem = new SavingsAccount(1001, "Natalie Liem", 10000, "Alyssa Liem");
		System.out.println(nLiem);
		nLiem.deposit(200);
		nLiem.deposit(-400);
		nLiem.withdraw(4000000);
		nLiem.withdraw(-80);
		
		BankAccount sJamal = new BankAccount(1000, "Shorab Jamal", 50);
		System.out.println(sJamal);
		sJamal.withdraw(6000);
		System.out.println(sJamal);
		
	}

}
