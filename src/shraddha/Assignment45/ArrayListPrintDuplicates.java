/*Assignment-45 : 2nd Oct
Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]
*/
package shraddha.Assignment45;

import java.util.ArrayList;

public class ArrayListPrintDuplicates {
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Techno");
		listOfNames.add("Mayur");
		listOfNames.add("Chandni");
		listOfNames.add("Amruta");
		listOfNames.add("Chandni");
		listOfNames.add("Parthav");
		listOfNames.add("Mayur");
		listOfNames.add("Amruta");
		listOfNames.add("Credits");
		listOfNames.add("Amruta");
		System.out.println(listOfNames);

		ArrayList<String> outputList = new ArrayList<String>();

		int listSize = listOfNames.size();
		for (int index = 0; index < listSize; index++) {
			String name = listOfNames.get(index);
			if (!(index == listOfNames.indexOf(name)) && !(outputList.contains(name))) {
				outputList.add(listOfNames.get(index));
			}
		}
		System.out.println(outputList);
	}
}
