package varun.varun_array_assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Name_Starts_withA_Having_Length_MoreThan_6chars {
	
	void nameStartsWithAhavingLengthMorethan6(ArrayList<String> str) {
		ArrayList<String> outputList = new ArrayList<String>();
		for(String name : str) {
			if(name.startsWith("A") && name.length()>6)
				if(!outputList.contains(name))
					outputList.add(name);
		}
		System.out.println("Output: " + outputList);
	}
	
	public static void main(String[] args) {
		String[] input = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		ArrayList_Name_Starts_withA_Having_Length_MoreThan_6chars arrayList_Name_Starts_withA_Having_Length_MoreThan_6chars = new ArrayList_Name_Starts_withA_Having_Length_MoreThan_6chars();
		arrayList_Name_Starts_withA_Having_Length_MoreThan_6chars.nameStartsWithAhavingLengthMorethan6(list);
	}
}
