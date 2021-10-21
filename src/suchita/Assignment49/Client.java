package suchita.Assignment49;
// Assignment 49
//Client class

import java.util.HashSet;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		
		Builder builder1 = new Builder("ABC", "ABCDE10101", 15, 100);
		Builder builder2 = new Builder("DEF", "DEFGH20202", 10, 75);
		Builder builder3 = new Builder("ABC", "ABCDE10101", 10, 100);
		Builder builder4 = new Builder("GHI", "GHIJK30303", 25, 150);
		Builder builder5 = new Builder("ABC", "ABCDE40404", 15, 100);

		Set<Builder> set = new HashSet<Builder>();
		set.add(builder1);
		set.add(builder2);
		set.add(builder3);
		set.add(builder4);
		set.add(builder5);

		System.out.println("The number of unique builder information is " + set.size());

	}

}