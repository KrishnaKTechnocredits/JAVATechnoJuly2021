package gauravk.Assignment_49;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Assignment - 49 : 10th Oct [hashCode & Equals]

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
-----------------------------------------------------------------------
 */
public class Client {

	public static void main(String[] args) {
		Builder builder1 = new Builder("L&T builders Ltd", "LTGST098", 55, 100000);
		Builder builder2 = new Builder("Reliance Ltd", "RLCGST992", 25, 79000);
		Builder builder3 = new Builder("Sky Scrapers Ltd", "SSKGST567", 25, 999000);
		Builder builder4 = new Builder("Mohanlal & Sons Ltd", "MLSGST328", 30, 135000);
		Builder builder5 = new Builder("L&T Builders Ltd", "LTGST098", 55, 100000);
		Set<Builder> set = new LinkedHashSet<Builder>();
		set.add(builder1);
		set.add(builder2);
		set.add(builder3);
		set.add(builder4);
		set.add(builder5);
		System.out.println("builder1 HashCode " + ": " + builder1);
		System.out.println("builder2 HashCode " + ": " + builder2);
		System.out.println("builder3 HashCode " + ": " + builder3);
		System.out.println("builder4 HashCode " + ": " + builder4);
		System.out.println("builder5 HashCode " + ": " + builder5);
		System.out.println("The builder in a set is: ");
		System.out.println(set);
		System.out.println("Total size of the set is: " + set.size());	
	}
}
