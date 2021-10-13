package akanksha_Jain.Assignment_50;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		ArrayList<Builder> al = new ArrayList<Builder>();
		Builder builder1 = new Builder("Maulik", 1, 2, 10000);
		Builder builder2 = new Builder("Bilal", 2, 2, 20000);
		Builder builder3 = new Builder("Vivek", 3, 4, 95000);
		Builder builder4 = new Builder("Akansha", 4, 3, 50000);
		Builder builder5 = new Builder("Rasika", 5, 1, 90000);
		
		al.add(builder1);
		al.add(builder2);
		al.add(builder3);
		al.add(builder4);
		al.add(builder5);
		
		Collections.sort(al);
		System.out.println(al);
	}
}
