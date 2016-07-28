package lab2;

/**
 * Interface for Automobiles.
 * @author nliem
 *
 */

public interface IAutomobile {
	
	String showroomname= "The Best Cars Ever!!!";
	
	/**
	 * 
	 * @return Returns the price of the given IAutomobile...
	 */
	public double getPrice();
	
	/**
	 * 
	 * @return Returns the color of the given IAutomobile...
	 */
	public abstract String getColor();
	
	/**
	 * 
	 * @return Returns the model of the given IAutomobile...
	 */
	String getModel();
	//These all have the same privacy/modifiers!!!!
	
	
}
