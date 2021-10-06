package shantanu.ArrayListPrograms_assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String[] names = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> listOfNames = new ArrayList<>(Arrays.asList(names));
		ArrayList<String> withoutDuplicates = new ArrayList<>();
		
		for(String name : listOfNames) {
			if(!withoutDuplicates.contains(name))
				withoutDuplicates.add(name);
		}
		System.out.println(withoutDuplicates);
	}
}
