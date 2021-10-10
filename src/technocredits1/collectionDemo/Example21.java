package technocredits1.collectionDemo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example21 {

	public static void main(String[] args) {
		Set<String> hs = new LinkedHashSet<String>();
		hs.add("Madhvi");
		hs.add("Anikiet");
		hs.add("Tanmoy");
		hs.add("Shantanu");
		hs.add("Umakant");
		hs.add("Umakant");
		hs.add("Umakant");
		
		ArrayList<String> listOfNames = new ArrayList<String>(hs);
		System.out.println("First :" + listOfNames.get(0));
		System.out.println("Last : " + listOfNames.get(hs.size()-1));
		System.out.println(listOfNames);
		
	}
}

