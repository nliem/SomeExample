package lab1;

public abstract class AbstractLoan {
	private Customer customer;
	private int numYears;
	
	public void setCustomer(Customer c){
		this.customer = c;
	}
	
	public Customer getCustomer(){
		return customer;
	}
	
	public void showCustomerName(){
		System.out.println(customer.getName());
	}
	
	public void setnumYears(int y){
		this.numYears = y;
	}
	
	public int getNumYears(){
		return this.numYears;
	}
	
	public abstract double calculateEligibility();
	
	public abstract double calculateInterest();

}
