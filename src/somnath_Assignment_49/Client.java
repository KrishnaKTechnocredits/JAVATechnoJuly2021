package somnath_Assignment_49;

import java.util.HashSet;
import java.util.Set;

public class Client {
	public static void main(String[] args) {
		Builder builder1 = new Builder("Techno", "APS1986211OCT", 40, 4000);
		Builder builder2 = new Builder("Krishna", " YZX90224355AUG", 11, 3200);
	    Builder builder3 = new Builder("Maulik", " MHP9278583GN", 33, 5000);
		Builder builder4 = new Builder("Techno", "APS1986211OCT", 40, 4000);
		Builder builder5 = new Builder("Harsh", " MHS55332211QB", 16, 60000);

		Set<Builder> set = new HashSet<>();
		set.add(builder1);
		set.add(builder2);
		set.add(builder3);
		set.add(builder4);
		set.add(builder5);

System.out.println("Output:\n" + "Size of objects after removing duplicates : " +set.size());
	}
}
