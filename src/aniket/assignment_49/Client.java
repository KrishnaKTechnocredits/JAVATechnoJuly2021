package aniket.assignment_49;

import java.util.HashSet;

public class Client {

	public static void main(String[] args) {
		Builder b1 = new Builder("Aniket", "ABZ12398IN", 11, 9000000);
		Builder b2 = new Builder("Aniket", "ABZ12398IN", 11, 9000000);
		Builder b3 = new Builder("Balsaraf", "AHGG145IC", 16, 1000000);
		Builder b4 = new Builder("Techno", "GFS654TGF", 20, 5000000);
		Builder b5 = new Builder("Credits", "TDSH145AY", 14, 8000000);

		HashSet<Builder> hbset = new HashSet<>();
		hbset.add(b1);
		hbset.add(b2);
		hbset.add(b3);
		hbset.add(b4);
		hbset.add(b5);
		System.out.println(hbset.toString());
		System.out.println("Unique builders are : " + hbset.size());
	}
}
