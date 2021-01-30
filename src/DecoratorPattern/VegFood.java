package DecoratorPattern;

public class VegFood implements Food {
	@Override
	public String prepareFood() {
		return "Vegetarian food";
	}
	
	@Override
	public double foodPrice() {
		return 50.0;
	}
}
