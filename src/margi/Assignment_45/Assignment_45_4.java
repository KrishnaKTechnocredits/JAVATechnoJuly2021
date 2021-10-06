package margi.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

/*program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]*/

public class Assignment_45_4 {

	ArrayList<String> getArrayList(String[] str) {
		ArrayList<String> input = new ArrayList<String>(Arrays.asList(str));
		ArrayList<String> output = new ArrayList<String>();
		for (String name : input) {
			if (!output.contains(name) && (name.startsWith("A") && name.length() > 6)) {
				output.add(name);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment_45_4 assignment_45_4 = new Assignment_45_4();
		String[] str = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav", "Mayur",
				"Amruta", "Credits", "Amruta", "AparnaTiwari" };
		System.out.println(assignment_45_4.getArrayList(str));
	}
}
