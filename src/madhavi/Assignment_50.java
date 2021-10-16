package madhavi;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment_50 {
	public static void main(String[] args) {
		BuilderComparable b1 = new BuilderComparable("LODHA", "AB234", 10, 60000);
		BuilderComparable b2 = new BuilderComparable("Kolte Patil", "AB234", 5, 40000);
		BuilderComparable b3 = new BuilderComparable("Ravetkar", "AB2994", 9, 20000);
		BuilderComparable b4 = new BuilderComparable("Paranjape", "DN234", 1, 50000);
		BuilderComparable b5 = new BuilderComparable("LODHA", "AB234", 10, 60000);

		ArrayList<BuilderComparable> setOfBuilder = new ArrayList<BuilderComparable>();
		setOfBuilder.add(b1);
		setOfBuilder.add(b2);
		setOfBuilder.add(b3);
		setOfBuilder.add(b4);
		setOfBuilder.add(b5);
		Collections.sort(setOfBuilder);

		System.out.println(setOfBuilder);

	}
}
