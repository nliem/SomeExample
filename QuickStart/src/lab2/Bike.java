package lab2;

public class Bike implements IAutomobile{

	@Override
	public double getPrice() {
		return 450;
	}

	@Override
	public String getColor() {
		return "Racecar Red";
	}

	@Override
	public String getModel() {
		return "Cool Bike, Super Model";
	}

}
