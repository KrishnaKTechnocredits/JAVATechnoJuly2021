/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]*/


package astha.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignemnt45_2 {

	void printDuplicates(ArrayList<String> nameList) {
		System.out.println("List of duplicate names are: ");
		for (int index = 0; index < nameList.size(); index++) {
			if (nameList.indexOf(nameList.get(index)) != nameList.lastIndexOf(nameList.get(index)))
				if (index == nameList.indexOf(nameList.get(index)))
					System.out.print(nameList.get(index) + " ");
		}
	}
	
	public static void main(String[] args) {
		Assignemnt45_2 assignment45_2 = new Assignemnt45_2();
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Techno", "Akanksha", "Mayur", "Chandni",
				"Akanksha", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits", "Amruta", "AparnaTiwari"));
		System.out.println("Input list " + names);
		assignment45_2.printDuplicates(names);
	}
}
