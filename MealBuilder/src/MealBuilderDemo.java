public class MealBuilderDemo {
	public static void main ( String[] args ) {
		MealBuilder mb = new MealBuilder();

		Meal v = mb.prepareVegetarian();
		System.out.println ( "Making a vegetarian meal." );
		v.showItems();
		v.printCost ();

		Meal o = mb.prepareOmnivore();
		System.out.println ( "Making an omnivore meal." );
		o.showItems();
		o.printCost();
	}
}