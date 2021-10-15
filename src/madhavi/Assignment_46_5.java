package madhavi;
//Remove the longest string from given Set.

import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment_46_5 {
	public static void main(String[] args) {
		Set<String> s1 = new LinkedHashSet<String>();
		s1.add("Mumbai");
		s1.add("Pune");
		s1.add("Delhi");
		s1.add("Gujarat");
		s1.add("Indore");
		System.out.println("An initial list of elements: " + s1);

		String output = "";
		int count = 0;
		for(String name : s1) {
			if (count < name.length()) { // check the length of the string...
				count = name.length();
				output = name;;
			}
		}
		System.out.println("LONGEST STRING FROM THE SET IS: "+output);
	}

}