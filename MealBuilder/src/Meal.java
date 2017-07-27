import java.util.*;
import java.text.DecimalFormat;

public class Meal {
	private List<Item> items = new ArrayList<Item>();

	public void addItem ( Item item ) {
		items.add ( item );
	}

	public void showItems() {
		for ( Item item : items ) {
			System.out.print ( item.name() );
			System.out.print ( ", " + item.packing().pack() );
			System.out.println ( ", $" + formatFloatForDisplay ( item.price(), 2 ) );
		}
	}

	public float getCost() {
		float cost = 0.00f;

		for ( Item item : items ) {
			cost += item.price();
		}

		return cost;
	}

	public String formatFloatForDisplay ( float f, int decimalPrecision ) {
		String decimalAppendix = "";
		if ( decimalPrecision > 0 ) {
			decimalAppendix += ".";
		}

		while ( decimalAppendix.length() < ( decimalPrecision + 1 ) ) {
			decimalAppendix += "#";
		}

		DecimalFormat df = new DecimalFormat ( "#,###" + decimalAppendix );

		return df.format ( f );
	}

	public void printCost() {
		System.out.println ( "Total cost: $" + formatFloatForDisplay ( getCost(), 2 ) );
		System.out.println();
	}
}