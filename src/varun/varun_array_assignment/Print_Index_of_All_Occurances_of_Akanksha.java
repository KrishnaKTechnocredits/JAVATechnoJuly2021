/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4*/

package varun.varun_array_assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Print_Index_of_All_Occurances_of_Akanksha {

	void getIndexOfAllOccurences(ArrayList<String> list, String name) {
		System.out.println("Index of all occurances of Akanksha from input- ");
		for(int index=0; index<list.size(); index++) {
			if(list.get(index)==name) {
				System.out.println("Index: " + index + " Value: " + list.get(index));
			}
		}
	}
	
	public static void main(String[] args) {
		String[] input = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		Print_Index_of_All_Occurances_of_Akanksha print_Index_of_All_Occurances_of_Akanksha = new Print_Index_of_All_Occurances_of_Akanksha();
		print_Index_of_All_Occurances_of_Akanksha.getIndexOfAllOccurences(list, "Akanksha");
	}
}
