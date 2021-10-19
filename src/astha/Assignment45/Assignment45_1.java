/*Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]
 
Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]
 
program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
     	4
 
program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]                           	
output : [Akanksha, AparnaTiwari]
 */

package astha.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45_1 {

	ArrayList<String> removeDuplicates(ArrayList<String> nameList) {
		for (int index = 0; index < nameList.size(); index++) {
			if(nameList.indexOf(nameList.get(index)) != nameList.lastIndexOf(nameList.get(index)))
				nameList.remove(nameList.lastIndexOf(nameList.get(index)));
		}

		return nameList;
	}

	public static void main(String[] args) {
		Assignment45_1 assignment45_1 = new Assignment45_1();
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Techno", "Mayur", "Chandni",
				 "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits", "Amruta"));
		System.out.println("Input list " + names);
		System.out.println("Names list before removing duplicates : " + names);
		System.out.println("Names list after removing duplicates : " + assignment45_1.removeDuplicates(names));
	}
}
