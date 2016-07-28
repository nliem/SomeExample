package lab2;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Input 1, 2, 3, or 4...");
		int choice = in.nextInt();
		
		ShowRoom s = new NewShowRoom();
		
		IAutomobile a = s.getProduct(choice);
		if(a != null) s.printQuote(a);
		else System.out.println("You chose wronggggggg....");
		in.close();
	}

}
