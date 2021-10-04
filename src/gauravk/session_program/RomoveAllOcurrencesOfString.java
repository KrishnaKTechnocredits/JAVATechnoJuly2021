package gauravk.session_program;

import java.util.ArrayList;

import shantanu.multipleOccurenceOfChar_assignment42.RemoveAllOccurences;

/*
 * Program : remove all occurrences of Amruta
input : ["Techno","Chandni","Amruta","Parthav", "Mayur","Amruta","Credits","Amruta"]
output :  ["Techno","Chandni","Parthav", "Mayur","Credits"]
 */
public class RomoveAllOcurrencesOfString {
	
	ArrayList removingAllOcurrencesOf(String str, ArrayList databaseOfNames) {
		//databaseOfNames.get(databaseOfNames.indexOf(str));
		while(databaseOfNames.contains(str)) {
			databaseOfNames.remove(str);
		}
		
		return databaseOfNames;
		
	}
	
	public static void main(String[] args) {
		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("Techno");
		namesList.add("Chandni");
		namesList.add("Amruta");
		namesList.add("Parthav");
		namesList.add("Mayur");
		namesList.add("Amruta");
		namesList.add("Credits");
		namesList.add("Amruta");
		System.out.println(namesList);
		RomoveAllOcurrencesOfString xyz = new RomoveAllOcurrencesOfString();
		System.out.println("Output: "+xyz.removingAllOcurrencesOf("Amruta",namesList));
		
	}
}
