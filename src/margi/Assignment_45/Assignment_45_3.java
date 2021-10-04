package margi.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4*/

public class Assignment_45_3 {

	void printIndex(String[] str) {
		ArrayList<String> input = new ArrayList<String>(Arrays.asList(str));
		for (int index = 0; index < input.size(); index++) {
			if (input.get(index).equals("Akanksha")) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_45_3 assignment_45_3 = new Assignment_45_3();
		String[] str = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav", "Mayur",
				"Amruta", "Credits", "Amruta" };
		assignment_45_3.printIndex(str);
	}
}
