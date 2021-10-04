package shantanu.ArrayListPrograms_assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class IndexOfAllOccurences {
	public static void main(String[] args) {
		String[] names = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> listOfNames = new ArrayList<>(Arrays.asList(names));
		
		for(int index = 0; index < listOfNames.size()-1; index++) {
			if(listOfNames.get(index).equals("Akanksha"))
				System.out.println(index);
		}
	}
}
