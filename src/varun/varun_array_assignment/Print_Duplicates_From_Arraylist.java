/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]
*/
package varun.varun_array_assignment;

import java.util.ArrayList;

public class Print_Duplicates_From_Arraylist {

	void printDuplicate(ArrayList<String> str) {
		ArrayList<String> output = new ArrayList<String>();
		for (int index = 0; index < str.size(); index++) {
			String name = str.get(index);
			if (str.indexOf(name) != str.lastIndexOf(name)) {
				if (str.indexOf(name) == index)
					output.add(name);
			}
		}
		System.out.println("Duplicates values are "+output);
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno");
		al.add("Mayur");
		al.add("Chandni");
		al.add("Varun");
		al.add("Amruta");
		al.add("Chandni");
		al.add("Parthav");
		al.add("Mayur");
		al.add("Amruta");
		al.add("Credits");
		al.add("Amruta");
		al.add("Varun");
		Print_Duplicates_From_Arraylist print_Duplicates_From_Arraylist =  new Print_Duplicates_From_Arraylist();
		print_Duplicates_From_Arraylist.printDuplicate(al);
		
	}
}
