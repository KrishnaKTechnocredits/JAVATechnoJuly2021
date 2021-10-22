package suchita.Assignment50;
// Assignment 50

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		Builder builder1 = new Builder("ABC", "ABCDE10101", 15, 100);
		Builder builder2 = new Builder("DEF", "DEFGH20202", 10, 75);
		Builder builder3 = new Builder("JKL", "JKLMN50505", 10, 100);
		Builder builder4 = new Builder("GHI", "GHIJK30303", 25, 150);
		Builder builder5 = new Builder("MNO", "MNOPQ40404", 15, 125);

		List<Builder> list = new ArrayList<Builder>();
		list.add(builder1);
		list.add(builder2);
		list.add(builder3);
		list.add(builder4);
		list.add(builder5);
		Collections.sort(list);
		System.out.println(list);

	}

}