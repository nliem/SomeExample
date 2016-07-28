package lab2;

public class HondaCar implements IAutomobile{

	@Override
	public double getPrice() {
		return 30000;
	}

	@Override
	public String getColor() {
		return "Indigo";
	}

	@Override
	public String getModel() {
		return "Honda, Accord";
	}

}
