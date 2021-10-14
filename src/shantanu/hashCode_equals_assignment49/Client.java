package shantanu.hashCode_equals_assignment49;

import java.util.HashSet;

public class Client {
	public static void main(String[] args) {
		Builder builder1 = new Builder("Paranjpe Schemes",12345,50,10000);
		Builder builder2 = new Builder("Kolte-Patil Realty",56789,90,15000);
		Builder builder3 = new Builder("Kotibhaskar Constructions",54321,65,9000);
		Builder builder4 = new Builder("Paranjpe Schemes",12345,50,10000);
		Builder builder5 = new Builder("Gokhale Constructions",98765,90,25000);
		
		HashSet<Builder> setOfBuilders = new HashSet<Builder>();
		setOfBuilders.add(builder1);
		setOfBuilders.add(builder2);
		setOfBuilders.add(builder3);
		setOfBuilders.add(builder4);
		setOfBuilders.add(builder5);
		
		System.out.println("Total size of builder set:" + setOfBuilders.size());
		System.out.println(setOfBuilders);
	}
}
