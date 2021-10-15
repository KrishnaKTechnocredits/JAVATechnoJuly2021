package dattaraj;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_45_P4 {
	
	public static void main(String[] args) {
		String[] input = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		Assignment_45_P4 p4 = new Assignment_45_P4();
		p4.getNames(list);
	}
	
	void getNames(ArrayList<String> list) {
		System.out.println("ArrayList which contains names starts with A and having length more than 6 chars from input- ");
		System.out.println(list);
		ArrayList<String> outputList = new ArrayList<String>();
		for(String name : list) {
			if(name.startsWith("A") && name.length()>6)
				if(!outputList.contains(name))
					outputList.add(name);
		}
		System.out.println("Output: " + outputList);
	}
}
