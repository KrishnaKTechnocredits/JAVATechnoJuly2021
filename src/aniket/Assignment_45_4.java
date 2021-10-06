package aniket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]*/

public class Assignment_45_4 {
	ArrayList<String> getNames(String[] str, String ch, int length) {
		ArrayList<String> output = new ArrayList<>();
		List<String> listname = new ArrayList<>(Arrays.asList(str));
		for (String name : listname) {
			if (name.startsWith(ch) && name.length() > 6) {
				if (!output.contains(name))
					output.add(name);

			}

		}
		return output;

	}

	// return output;

	public static void main(String[] args) {

		String[] input = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav",
				"Mayur", "Amruta", "Credits", "Amruta", "AparnaTiwari" };
		System.out.println(new Assignment_45_4().getNames(input, "A", 6));

	}
}
