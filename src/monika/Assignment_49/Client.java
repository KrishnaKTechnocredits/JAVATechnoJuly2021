package monika.Assignment_49;

import java.util.HashSet;
import java.util.Set;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder b1 = new Builder("A1", "EBD2364", 10, 100);
		Builder b2 = new Builder("B1", "KRL8472", 58, 200);
		Builder b3 = new Builder("C1", "LE54875", 36, 100);
		Builder b4 = new Builder("C1", "LE54875", 36, 100);
		Builder b5 = new Builder("E1", "GTEB433", 10, 300);

		Set<Builder> set = new HashSet<Builder>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);

		System.out.println("Number of Builder Information: " + set.size());

	}
}
