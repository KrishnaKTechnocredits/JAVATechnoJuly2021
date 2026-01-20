package dattaraj.dattaraj_Assignment_49;

import java.util.HashSet;

public class Assignment_49_Client {

	public static void main(String[] args) {
		HashSet<Assignment_49_Builder> builderSet = new HashSet<>();
		Assignment_49_Builder builder1 = new Assignment_49_Builder("Maulik", 1, 2, 10000);
		Assignment_49_Builder builder2 = new Assignment_49_Builder("Maulik", 1, 2, 10000);
		Assignment_49_Builder builder3 = new Assignment_49_Builder("Vivek", 2, 4, 150000);
		Assignment_49_Builder builder4 = new Assignment_49_Builder("Akansha", 3, 3, 120000);
		Assignment_49_Builder builder5 = new Assignment_49_Builder("Rasika", 4, 1, 90000);
		
		builderSet.add(builder1);
		builderSet.add(builder2);
		builderSet.add(builder3);
		builderSet.add(builder4);
		builderSet.add(builder5);
		System.out.println(builderSet);
		System.out.println("Unique builders are- " + builderSet.size());
	}
}