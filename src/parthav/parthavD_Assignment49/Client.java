package parthav.parthavD_Assignment49;

import java.util.LinkedHashSet;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		Builder builder1 = new Builder("Nirmal Ltd", "AABD008", 25, 10000);
		Builder builder2 = new Builder("Lodha Ltd", "ARTD008", 45, 20000);
		Builder builder3 = new Builder("Horizon Ltd", "BERTD009", 35, 15000);
		Builder builder4 = new Builder("Rustom Ltd", "WERTCE09", 35, 15000);
		Builder builder5 = new Builder("Nirmal Ltd", "AABD008", 25, 10000);
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
