package harshada.Assignment_51;

import java.util.Comparator;

public class BuilderTest implements Comparator <BuilderComparatorDemo> {

	@Override
	public int compare(BuilderComparatorDemo obj1, BuilderComparatorDemo obj2) {
		return obj1.revenue-obj2.revenue;
	}
}
