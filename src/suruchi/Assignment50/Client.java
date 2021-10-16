/*Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> Create a list, add all builder objects and sort it.
-> override toString method to print builder name, revenue.

Exception : while printing arrayList, it should print build names and revune based on revenue ascending order.*/

package suruchi.Assignment50;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		Builder builder2 = new Builder("Suruchi", "ABS123", 4, 40000);
		Builder builder3 = new Builder("Sasha", "BS123", 6, 12000);
		Builder builder1 = new Builder("Suruchi", "ABS123", 4, 2000);
		Builder builder4 = new Builder("Priya", "TSBS123", 10, 100000);
		Builder builder5 = new Builder("Techno", "BSABS123", 9, 80000);

		List<Builder> List = new ArrayList<>();
		List.add(builder1);
		List.add(builder2);
		List.add(builder3);
		List.add(builder4);
		List.add(builder5);
		Collections.sort(List);
		System.out.println("Sorted List: " + List);
	}
}