public class ChickenSandwich extends Burger {

	@Override
	public float price() {
		return 2.49f;
	}

	@Override
	public String name() {
		return "Chicken Sandwich";
	}
}