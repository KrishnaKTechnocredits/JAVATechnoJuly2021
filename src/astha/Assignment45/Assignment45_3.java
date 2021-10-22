/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
     	4*/

package astha.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45_3 {

	void printIndex(ArrayList<String> names) {
		System.out.println("Index of all occurrences of Akanksha :");
		for(int index = 0; index < names.size(); index++) {
			if(names.get(index).equals("Akanksha"))
				System.out.print(index + " ");
		}
	}
	
	public static void main(String[] args) {
		Assignment45_3 assignment45_3 = new Assignment45_3();
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"));
		System.out.println("Input list " + names);
		assignment45_3.printIndex(names);
	}
}
