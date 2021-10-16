package madhavi;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment_51 {
	public static void main(String[] args) {
		BuilderComparator b1 = new BuilderComparator("LODHA", "AB234", 10, 60000);
		BuilderComparator b2 = new BuilderComparator("Kolte Patil", "AB234", 5, 40000);
		BuilderComparator b3 = new BuilderComparator("Ravetkar", "AB2994", 9, 20000);
		BuilderComparator b4 = new BuilderComparator("Paranjape", "DN234", 1, 50000);
		BuilderComparator b5 = new BuilderComparator("LODHA", "AB234", 10, 60000);

		ArrayList<BuilderComparator> setOfBuilder = new ArrayList<BuilderComparator>();
		setOfBuilder.add(b1);
		setOfBuilder.add(b2);
		setOfBuilder.add(b3);
		setOfBuilder.add(b4);
		setOfBuilder.add(b5);
		Collections.sort(setOfBuilder,new ComparatorByName());
		System.out.println(setOfBuilder);
		Collections.sort(setOfBuilder,new ComparatorByRevenue());
		System.out.println(setOfBuilder);

}
}