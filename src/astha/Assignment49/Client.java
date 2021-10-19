/*Assignment - 49 : 10th Oct [hashCode & Equals]

Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> all parameters are same for 2 objects
-> Create a set and return only unique builder information.
 -> uniqueness should be based on name, gstNumber, Revenue.
-> Expected answer is - 4.*/

package astha.Assignment49;

import java.util.HashSet;

public class Client {

	public static void main(String[] args) {
		Builder builder1 = new Builder("XYZ", "XYZ112233", 20, 55);
		Builder builder2 = new Builder("DEF", "ABC223344", 17, 75);
		Builder builder3 = new Builder("XYZ", "DEF010101", 27, 10);
		Builder builder4 = new Builder("SDF", "GHI345677", 38, 350);
		Builder builder5 = new Builder("XYZ", "XYZ112233", 20, 55);
		

		HashSet<Builder> set = new HashSet<Builder>();
		set.add(builder1);
		set.add(builder2);
		set.add(builder3);
		set.add(builder4);
		set.add(builder5);

		System.out.println("The number of unique builder information is " + set.size());

	}
}
