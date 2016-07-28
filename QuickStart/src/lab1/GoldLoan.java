package lab1;

public class GoldLoan extends AbstractLoan {
	
	private double customerFront;
	private double rate = 2000;
	private double interest = .024;
	private double eligability;
	
	public GoldLoan(double customerFront, Customer c, int years){
		this.customerFront = customerFront;
		this.eligability = this.calculateEligibility();
		super.setCustomer(c);
		super.setnumYears(years);
	}

	@Override
	public double calculateEligibility() {
		return this.customerFront * rate;
	}

	@Override
	public double calculateInterest() {
		int years = getNumYears();
		
		double total = eligability;
		
		for(int i = 0; i < years; i++){
			total += total * interest;
		}
		return total;
	}
	

}
