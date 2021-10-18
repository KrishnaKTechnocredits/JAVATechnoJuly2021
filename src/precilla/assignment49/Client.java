package precilla.assignment49;

import java.util.HashSet;

import java.util.Set;

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
-> Expected answer is - 4.
*/
public class Client {
	public static void main(String[] args) {
		Builder builder1=new Builder("Precilla",5678,3,2000);
		Builder builder2=new Builder("Precilla",5678,2,2000);
		Builder builder3=new Builder("Precilla",5478,5,4500);
		Builder builder4=new Builder("Precilla",9632,6,9870);
		Builder builder5=new Builder("Precilla",4781,4,36500);
		
		Set<Builder> hs=new HashSet<Builder>();
		hs.add(builder1);
		hs.add(builder2);
		hs.add(builder3);
		hs.add(builder4);
		hs.add(builder5);
		
		System.out.println("Size of objects after removing duplicates : " +hs.size());
		
	}

}
