package dattaraj;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_45_P1 {
	
	public static void main(String[] args) {
		String[] input = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		Assignment_45_P1 p1 = new Assignment_45_P1();
		p1.removeAllDuplicates(list);
	}
	
	void removeAllDuplicates(ArrayList<String> list) {
		System.out.println("input- "+ list);
		ArrayList<String> outputList = new ArrayList<String>();
		for(String name : list) {
			if(!outputList.contains(name)) {
				outputList.add(name);
			}
		}
		System.out.println("Output- " + outputList);
	}
}
