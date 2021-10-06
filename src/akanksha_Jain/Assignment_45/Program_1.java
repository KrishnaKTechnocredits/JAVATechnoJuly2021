/* Assignment-45 : 2nd Oct’2021
Program 1: remove duplicates from arraylist, it should have only single occurrence
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"] */

package akanksha_Jain.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_1 {
	
	void removeAllDuplicates(ArrayList<String> list) {
		System.out.println("All the elements having duplicates removed from input- ");
		System.out.println(list);
		ArrayList<String> outputList = new ArrayList<String>();
		for(String name : list) {
			if(!outputList.contains(name)) {
				outputList.add(name);
			}
		}
		System.out.println("Output- " + outputList);
	}
	
	public static void main(String[] args) {
		String[] input = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		Program_1 p1 = new Program_1();
		p1.removeAllDuplicates(list);
	}
}