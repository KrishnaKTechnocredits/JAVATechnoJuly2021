/*
 * program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]

 */
package bhagyashree_Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45_4 {

	void getName(ArrayList<String> al) {
		ArrayList<String> output = new ArrayList<String>();
		for (String name : al) {
			if (name.startsWith("A") && name.length() > 6)
				if (!(output.contains(name)))
					output.add(name);
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String[] str = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav", "Mayur",
				"Amruta", "Credits", "Amruta", "AparnaTiwari" };
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(str));
		Assignment45_4 ass45 = new Assignment45_4();
		ass45.getName(al);
	}
}
