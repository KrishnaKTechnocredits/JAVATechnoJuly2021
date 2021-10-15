package dattaraj;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_45_P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"Techno","Dattaraj","Mayur","Dattaraj","Dattaraj","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		String str = "Dattaraj";
		Assignment_45_P3 p3 = new Assignment_45_P3();
		p3.getIndexOfAllOccurences(list, str);
	}
	
	void getIndexOfAllOccurences(ArrayList<String> list, String str) {
		System.out.println("input- "+list);
		System.out.println("Output: ");
		for(int index=0; index<list.size(); index++) {
			if(list.get(index)==str) {
				System.out.println("Index: " + index + " Value: " + list.get(index));
			}
		}
	}
	
}
