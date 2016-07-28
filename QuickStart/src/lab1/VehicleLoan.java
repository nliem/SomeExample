package lab1;

public class VehicleLoan extends AbstractLoan {
	
	private double originalAmount;
	private double rate = .9;
	private double interest = .035;
	private double eligability;
	
	public VehicleLoan(double originalAmount, Customer c, int years){
		this.originalAmount = originalAmount;
		this.eligability = this.calculateEligibility();
		super.setCustomer(c);
		super.setnumYears(years);
	}

	@Override
	public double calculateEligibility() {
		return this.originalAmount * rate; 
	}

	@Override
	public double calculateInterest() {
		int years = getNumYears();
		
		double total = eligability;
		
		for(int i = 0; i < years; i++){
			total += total*interest;
		}
		
		return total;
	}

}
