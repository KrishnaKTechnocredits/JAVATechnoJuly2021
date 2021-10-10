package technocredits1.collectionDemo;

import java.util.Set;
import java.util.TreeSet;

public class Example19 {

	public static void main(String[] args) {
		Set<String> hs = new TreeSet<String>();
		hs.add("Madhvi");
		hs.add("Anikiet");
		System.out.println(hs.add("Umakant"));
		hs.add("Tanmoy");
		hs.add("Shantanu");
		hs.add("Umakant");
		hs.add("Umakant");
		hs.add("Umakant");
		
		System.out.println(hs);
	}
}

