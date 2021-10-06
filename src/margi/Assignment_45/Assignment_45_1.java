package margi.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

/*Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]
*/

public class Assignment_45_1 {

	ArrayList<String> removeDuplicates(String[] str) {
		ArrayList<String> input = new ArrayList<String>(Arrays.asList(str));
		ArrayList<String> output = new ArrayList<String>();
		for (String name : input) {
			if (!output.contains(name))
				output.add(name);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment_45_1 assignment_45_1 = new Assignment_45_1();
		String[] str = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits",
				"Amruta" };
		System.out.println(assignment_45_1.removeDuplicates(str));
	}
}
