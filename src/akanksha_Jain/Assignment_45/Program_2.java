/* Assignment-45 : 2nd Oct’2021
Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"] */

package akanksha_Jain.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_2 {
	
	void removeAllDuplicatesFreqElements(ArrayList<String> list) {
		System.out.println("All the elements having frequency more than 1 from input- ");
		System.out.println(list);
		ArrayList<String> outputList = new ArrayList<String>();
		for(int index=0; index<list.size(); index++) {
			 if(list.indexOf(list.get(index))!=list.lastIndexOf(list.get(index))) {
				if(!outputList.contains(list.get(index))) {
					outputList.add(list.get(index));
				}
			}
		}
		System.out.println("Output- " + outputList);
	}

	public static void main(String[] args) {
		String[] input = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		Program_2 p2 = new Program_2();
		p2.removeAllDuplicatesFreqElements(list);
	}
}