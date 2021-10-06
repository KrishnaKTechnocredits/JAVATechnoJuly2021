/*Assignment-45 : 2nd Oct

Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]
*/
package shraddha.Assignment45;

import java.util.ArrayList;

public class ArrayListRemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Techno");
		listOfNames.add("Mayur");
		listOfNames.add("Chandni");
		listOfNames.add("Amruta");
		listOfNames.add("Parthav");
		listOfNames.add("Mayur");
		listOfNames.add("Amruta");
		listOfNames.add("Credits");
		listOfNames.add("Amruta");

		System.out.println(listOfNames);
		int listSize = listOfNames.size();

		for (int index = 0; index < listSize; index++) {
			if (listOfNames.indexOf(listOfNames.get(index)) != index) {
				listOfNames.remove(index);
				index--;
				listSize--;
			}
		}

		System.out.println(listOfNames);
	}
}
