package margi.Assignment_49;

import java.util.HashSet;

/*[hashCode & Equals]
Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> all parameters are same for 2 objects
-> Create a set and return only unique builder information.
-> uniqueness should be based on name, gstNumber, Revenue.
-> Expected answer is - 4.*/

public class Client {

	public static void main(String[] args) {
		Builder b1 = new Builder("Alaska", "SHVKD138CISJ1HK", 103, 104759);
		Builder b2 = new Builder("Techno", "VID1MAH4C6IDCI", 399, 117401);
		Builder b3 = new Builder("Credits", "LBND3ML9MVDNTM", 338, 359104);
		Builder b4 = new Builder("Alexa", "DHVVO24HVK9CN9", 184, 936194);
		Builder b5 = new Builder("Techno", "VID1MAH4C6IDCI", 399, 117401);

		HashSet<Builder> set = new HashSet<>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		System.out.println("Size of Set: " + set.size());
	}
}
