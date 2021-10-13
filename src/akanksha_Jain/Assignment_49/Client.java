/* Assignment - 49 : 10th Oct [hashCode & Equals]
Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.
Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> all parameters are same for 2 objects
-> Create a set and return only unique builder information.
 -> uniqueness should be based on name, gstNumber, Revenue.
-> Expected answer is - 4. */

package akanksha_Jain.Assignment_49;

import java.util.TreeSet;

public class Client {
	
	public static void main(String[] args) {
		TreeSet<Builder> builderSet = new TreeSet<Builder>();
		Builder builder1 = new Builder("Maulik", 1, 2, 10000);
		Builder builder2 = new Builder("Maulik", 1, 2, 10000);
		Builder builder3 = new Builder("Vivek", 2, 4, 150000);
		Builder builder4 = new Builder("Akansha", 3, 3, 120000);
		Builder builder5 = new Builder("Rasika", 4, 1, 90000);
		
		builderSet.add(builder1);
		builderSet.add(builder2);
		builderSet.add(builder3);
		builderSet.add(builder4);
		builderSet.add(builder5);
		
		System.out.println(builderSet);
	}

}
