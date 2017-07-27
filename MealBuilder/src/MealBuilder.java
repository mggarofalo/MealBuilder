public class MealBuilder {
	public Meal prepareVegetarian () {
		Meal meal = new Meal();
		meal.addItem ( new VeggieBurger() );
		meal.addItem ( new Pepsi() );
		return meal;
	}

	public Meal prepareOmnivore () {
		Meal meal = new Meal();
		meal.addItem ( new ChickenSandwich() );
		meal.addItem ( new Coke() );
		return meal;
	}
}