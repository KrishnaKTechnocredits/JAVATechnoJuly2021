package dattaraj;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_45_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		Assignment_45_P2 p2 = new Assignment_45_P2();
		p2.removeAllDuplicatesFreqElements(list);
	}
	
	void removeAllDuplicatesFreqElements(ArrayList<String> list) {
		System.out.println("input- "+list);
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
	
}
