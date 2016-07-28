package lab2;

public class HyundaiCar implements IAutomobile {

	@Override
	public double getPrice() {
		return 25000;
	}

	@Override
	public String getColor() {
		return "Sunset Orange";
	}

	@Override
	public String getModel() {
		return "Hyundai, Sonata";
	}

}
