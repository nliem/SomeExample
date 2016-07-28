package lab1;

public class LoanTest {
	
	public static void main(String[] args){
		
		Customer me = new Customer("Natalie", 1, 80842957);
		
		
		GoldLoan gold = new GoldLoan(100, me, 5);
		
		Customer c = gold.getCustomer();
		c = null;
		gold.showCustomerName();
		
		
		LandLoan land = new LandLoan(100, me, 5);
		VehicleLoan vehicle = new VehicleLoan(100, me, 5);
		
		//showData(gold);
		//showData(land);
		//showData(vehicle);
	}
	
	public static void showData(AbstractLoan loan){
		System.out.println("Eligability for this loan: " + loan.calculateEligibility());
		System.out.println("Interest due: " + loan.calculateInterest()+"\n");
	}

}
