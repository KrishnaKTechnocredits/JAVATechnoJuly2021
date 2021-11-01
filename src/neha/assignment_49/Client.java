package neha.assignment_49;

import java.util.HashSet;

/*Assignment - 49 : 10th Oct [hashCode & Equals]

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> all parameters are same for 2 objects
-> Create a set and return only unique builder information.
 -> uniqueness should be based on name, gstNumber, Revenue.
-> Expected answer is - 4.*/

public class Client {
	public static void main(String[] args) {
		Builder b1 = new Builder("Parth", 127, 6, 45000);
		// System.out.println(b1.hashCode());
		Builder b2 = new Builder("Sara", 120, 11, 85000);
		// System.out.println(b2.hashCode());
		Builder b3 = new Builder("Aarchi", 137, 8, 65000);
		Builder b4 = new Builder("Avani", 128, 12, 98000);
		Builder b5 = new Builder("Parth", 127, 6, 45000);
		// System.out.println(b5.hashCode());
		HashSet<Builder> builderSet = new HashSet<Builder>();
		builderSet.add(b1);
		builderSet.add(b2);
		builderSet.add(b3);
		builderSet.add(b4);
		builderSet.add(b5);
		System.out.println(builderSet);
		System.out.println("Unique builders are: " + builderSet.size());

	}

}
