package com.training;

import java.util.Scanner;
import java.util.ArrayList;


public class CardStuff {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		String choice = "Y";
		
		ArrayList<CreditCard> cards = new ArrayList<>();

		while(!choice.equals("N")){
			System.out.println("Please enter a credit card number:\n");
			long cardNumber = in.nextLong();
			System.out.println("Please enter the card holder's name:\n");
			String name = in.next();
			System.out.println("Please enter the credit limit:\n");
			long creditLimit = in.nextLong();
			System.out.println("Please enter the amount spent this period:\n");
			double spent = in.nextDouble();
			
			cards.add(new CreditCard(cardNumber, name, creditLimit, spent));
			
			System.out.println("Would you like to enter another card? Input 'Y' or 'N'\n");
			choice = in.next();
			choice = choice.toUpperCase();
			choice.trim();
		}
		in.close();
		
		for(CreditCard c : cards){
			String name = c.getCardHolderName();
			if(c.getAmountSpent() >= 50000){
				System.out.println(name + " owes $" + c.getAmountSpent()*1.07 +" \n");
			}
			else{
				System.out.println(name + " owes $" + c.getAmountSpent()*1.05 +" \n");
			}
		}
	}

}
