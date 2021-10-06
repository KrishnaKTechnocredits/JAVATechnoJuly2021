package shantanu.ArrayListPrograms_assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnArrayList {
	ArrayList<String> newArrayList(ArrayList<String> listOfNames){
		ArrayList<String> manipulatedList = new ArrayList<> ();
		for(String name : listOfNames) {
			if(name.startsWith("A") && name.length() > 6) {
				if(!manipulatedList.contains(name))
					manipulatedList.add(name);
			}
		}
		return manipulatedList;
	}
	public static void main(String[] args) {
		ReturnArrayList returnArrayList = new ReturnArrayList();
		String[] names = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		ArrayList<String> listOfNames = new ArrayList<>(Arrays.asList(names));
		
		System.out.println(returnArrayList.newArrayList(listOfNames));
	}
}
