package DecoratorPattern;

public class NonVegFood extends FoodDecorator {
	public NonVegFood(Food newFood) {
		super(newFood);
	}
	
	@Override
	public String prepareFood() {
		return super.prepareFood() + "With roasted chicken and chicken curry";
	}
	
	@Override
	public double foodPrice() {
		return super.foodPrice() + 150.0;
	}
}
