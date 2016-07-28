package lab1;

public class Customer {
	
	private String name;
	private int customerNumber;
	private long phoneNumber;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Customer(String name, int number, int phone){
		this.name = name;
		this.customerNumber = number;
		this.phoneNumber = phone;
	}
	
}
