package lab2;

public class NewShowRoom extends ShowRoom{
	
	/**
	 * Overriden Method
	 * 
	 * Returns the appropriate IAutomobile based on the user's choice. 
	 */
	
	@Override
	public IAutomobile getProduct(int choice){
		if(choice == 4){
			return new Bike();
		}
		else{
			return super.getProduct(choice);
		}
	}

}
