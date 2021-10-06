/*Assignment-45 : 2nd Oct

Program : remove all occurrences of Amruta
input : ["Techno","Chandni","Amruta","Parthav", "Mayur","Amruta","Credits","Amruta"]
output :  ["Techno","Chandni","Parthav", "Mayur","Credits"]

Program 1: remove duplicates from arraylist, it should have only single occurance
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
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]*/
package chandani.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>() ;
		
		names.add("Techno");
		names.add("Chandni");
		names.add("Amruta");
		names.add("Parthav");
		names.add("Mayur");
		names.add("Amruta");
		names.add("Credits");
		names.add("Amruta");
		
		
		ArrayList<String> temp = new ArrayList<String>(names);
		
		for (String name : names) {
			if(name.contains("Amruta")) {
				temp.remove(name);
			}
	}
	System.out.println("After removing Amruta from given Array list string " + Arrays.asList(names) + "\n the output is " + temp);
}
}
