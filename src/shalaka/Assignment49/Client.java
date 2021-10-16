package shalaka.Assignment49;

import java.util.HashSet;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder = new Builder("Goyal", "ABC123", 10000, 123);
		Builder builder1 = new Builder("Mahesh", "CDE456", 20000, 456);
		Builder builder2 = new Builder("Aditya", "XYZ423", 30000, 789);
		Builder builder3 = new Builder("Goyal", "ABC123", 10000, 123);
		Builder builder4 = new Builder("Swarup", "DEF345", 50000, 555);

		HashSet<Builder> setOfBuilder = new HashSet<Builder>();
		setOfBuilder.add(builder);
		setOfBuilder.add(builder1);
		setOfBuilder.add(builder2);
		setOfBuilder.add(builder3);
		setOfBuilder.add(builder4);
		System.out.println(setOfBuilder);
		System.out.println(builder3.equals(builder));
		System.out.println(setOfBuilder.size());
		
	}

}
