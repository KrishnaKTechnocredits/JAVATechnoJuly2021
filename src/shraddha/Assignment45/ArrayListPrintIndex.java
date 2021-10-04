/*Assignment-45 : 2nd Oct
program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4
*/
package shraddha.Assignment45;

import java.util.ArrayList;

public class ArrayListPrintIndex {
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Techno");
		listOfNames.add("Akansha");
		listOfNames.add("Mayur");
		listOfNames.add("Chandni");
		listOfNames.add("Akansha");
		listOfNames.add("Amruta");
		listOfNames.add("Chandni");
		listOfNames.add("Parthav");
		listOfNames.add("Mayur");
		listOfNames.add("Amruta");
		listOfNames.add("Credits");
		listOfNames.add("Akansha");
		System.out.println(listOfNames);

		for (int index = 0; index < listOfNames.size(); index++) {
			String name = listOfNames.get(index);
			if (name == "Akansha")
				System.out.println(index);
		}
	}

}
