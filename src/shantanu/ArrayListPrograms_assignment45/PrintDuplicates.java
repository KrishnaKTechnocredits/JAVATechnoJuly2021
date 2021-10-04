package shantanu.ArrayListPrograms_assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintDuplicates {
	public static void main(String[] args) {
		String[] names = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> listOfNames = new ArrayList<>(Arrays.asList(names));
		ArrayList<String> duplicates = new ArrayList<>();
		for(String name : listOfNames) {
			if(listOfNames.indexOf(name)!=listOfNames.lastIndexOf(name)) {
				if(!duplicates.contains(name))
					duplicates.add(name);
			}
		}
		System.out.println(duplicates);
	}
}
