package lab2;

public class ShowRoom {
	
	/**
	 * Returns the IAutomobiles corresponding to the user provided number;
	 * @param choice
	 * @return Returns an IAutomobile
	 */
	
	public IAutomobile getProduct(int choice){
		IAutomobile auto = null;
		
		switch(choice){
		case 1: 
			auto = new MarutiCar();
			break;
		case 2: 
			auto = new HyundaiCar();
			break;
		case 3: 
			auto = new HondaCar();
			break;
		
		case 4:
			auto = new Bike();
			break;
		}
		return auto;
	}
	
	/**
	 * Displays information about the given IAutomobile
	 * @param auto
	 */
	
	public void printQuote(IAutomobile auto){
		System.out.println(IAutomobile.showroomname);
		System.out.println("Model: " + auto.getModel());
		System.out.println("Color: " + auto.getColor());
		System.out.println("Price: $" + auto.getPrice() + "\n");
	}

}
