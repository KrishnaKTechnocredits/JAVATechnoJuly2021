
/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]*/
package shalaka.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicatesFromArraylist {
	void PrintDuplicates(ArrayList<String> list) {
		System.out.println("Input: " + list);
		ArrayList<String> outputList = new ArrayList<String>();
		for (int index = 0; index < list.size(); index++) {
			String str = list.get(index);
			if (list.indexOf(str) != list.lastIndexOf(str)) {
				if (!outputList.contains(str))
					outputList.add(str);
			}
		}
		System.out.println("Output: " + outputList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits",
				"Amruta" };
		DuplicatesFromArraylist duplicatesFromArraylist = new DuplicatesFromArraylist();
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		duplicatesFromArraylist.PrintDuplicates(list);
	}

}
