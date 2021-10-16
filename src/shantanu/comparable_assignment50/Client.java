package shantanu.comparable_assignment50;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	public static void main(String[] args) {
		Builder builder1 = new Builder("Gokhale Constructions",12345,50,20000);
		Builder builder2 = new Builder("Kotibhaskar Constructions",67890,35,9000);
		Builder builder3 = new Builder("Paranjpe Schemes",54321,55,25000);
		Builder builder4 = new Builder("Vyas Builders",98765,30,7000);
		Builder builder5 = new Builder("Lodha Group",13579,90,80000);
		
		ArrayList<Builder> listOfBuilders = new ArrayList<Builder>();
		listOfBuilders.add(builder1);
		listOfBuilders.add(builder2);
		listOfBuilders.add(builder3);
		listOfBuilders.add(builder4);
		listOfBuilders.add(builder5);
		
		System.out.println("Before sorting:");
		System.out.println(listOfBuilders);
		
		Collections.sort(listOfBuilders);
		
		System.out.println("After sorting:");
		System.out.println(listOfBuilders);
	}
}
