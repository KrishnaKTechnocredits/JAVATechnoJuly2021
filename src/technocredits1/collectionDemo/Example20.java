package technocredits1.collectionDemo;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example20 {

	public static void main(String[] args) {
		Set<String> hs = new LinkedHashSet<String>();
		hs.add("Madhvi");
		hs.add("Anikiet");
		hs.add("Tanmoy");
		hs.add("Shantanu");
		hs.add("Umakant");
		hs.add("Umakant");
		hs.add("Umakant");
		
		System.out.println(hs);
		String output = "";
		int count = 0;
		for(String name : hs) {
			output = name;
			count++;
			if(count == hs.size()-1)
				break;
		}
		
		
		System.out.println(output);
	}
}

