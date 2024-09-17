package suchita.Assignment51;
// assignment 51

// Client class

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client implements Comparator<Builder> {

	public static void main(String[] args) {
		
		Builder builder1 = new Builder("ABC", "ABCDE10101", 15, 100);
		Builder builder2 = new Builder("DEF", "DEFGH20202", 10, 75);
		Builder builder3 = new Builder("JKL", "JKLMN50505", 12, 100);
		Builder builder4 = new Builder("GHI", "GHIJK30303", 25, 150);
		Builder builder5 = new Builder("MNO", "MNOPQ40404", 15, 125);

		List<Builder> list = new ArrayList<Builder>();
		list.add(builder1);
		list.add(builder2);
		list.add(builder3);
		list.add(builder4);
		list.add(builder5);
		Collections.sort(list, new BuilderTest());
		System.out.println("\n"+list);

		Collections.sort(list, new Client().reversed());
		System.out.println("\n"+list);

	}

	@Override
	public int compare(Builder obj1, Builder obj2) {
		
		return obj1.totalCompletedProject - obj2.totalCompletedProject;
	}

}