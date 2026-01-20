package dattaraj.dattaraj_Assignmnet_50;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment_50_Client {

	public static void main(String[] args) {
		ArrayList<Assignment_50_Builder> al = new ArrayList<Assignment_50_Builder>();
		Assignment_50_Builder builder1 = new Assignment_50_Builder("Maulik", 1, 2, 10000);
		Assignment_50_Builder builder2 = new Assignment_50_Builder("Samiksha", 2, 2, 20000);
		Assignment_50_Builder builder3 = new Assignment_50_Builder("Vivek", 3, 4, 95000);
		Assignment_50_Builder builder4 = new Assignment_50_Builder("Akansha", 4, 3, 50000);
		Assignment_50_Builder builder5 = new Assignment_50_Builder("Dattaraj", 5, 1, 90000);
		
		al.add(builder1);
		al.add(builder2);
		al.add(builder3);
		al.add(builder4);
		al.add(builder5);
		
		Collections.sort(al);
		System.out.println(al);
	}
}