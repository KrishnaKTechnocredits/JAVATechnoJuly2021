package margi.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]*/

public class Assignment_45_2 {

	ArrayList<String> printDuplicates(String[] str) {
		ArrayList<String> input = new ArrayList<String>(Arrays.asList(str));
		ArrayList<String> output = new ArrayList<String>();
		for (String name : input) {
			if (!output.contains(name) && (input.indexOf(name) != input.lastIndexOf(name))) {
				output.add(name);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment_45_2 assignment_45_2 = new Assignment_45_2();
		String[] str = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits",
				"Amruta" };
		System.out.println(assignment_45_2.printDuplicates(str));
	}
}
