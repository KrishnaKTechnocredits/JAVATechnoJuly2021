/*
 Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> all parameters are same for 2 objects
-> Create a set and return only unique builder information.
 -> uniqueness should be based on name, gstNumber, Revenue.
-> Expected answer is - 4.
 */

package umakant.collections;

import java.util.HashSet;
import java.util.Set;

public class Assignment49 {

	public static void main(String[] args) {
		Builder builder1 = new Builder("Umakant", "gstNumber", 100, 1500);
		Builder builder2 = new Builder("Umakant", "gstNumber", 100, 1500);
		Builder builder3 = new Builder("Ankush", "gstNumber3", 1001, 1400);
		Builder builder4 = new Builder("Kartik", "gstNumber", 1002, 1500);
		Builder builder5 = new Builder("Kunal", "gstNumber", 1003, 1500);
		Set<Builder> set = new HashSet<Builder>();
		set.add(builder1);
		set.add(builder2);
		set.add(builder3);
		set.add(builder4);
		set.add(builder5);
		System.out.println(set);
	}

}
