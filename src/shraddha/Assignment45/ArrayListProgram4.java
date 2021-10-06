/*Assignment-45 : 2nd Oct
program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]
*/
package shraddha.Assignment45;

import java.util.ArrayList;

public class ArrayListProgram4 {
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
	listOfNames.add("AparnaTiwari");
	System.out.println(listOfNames);
	
	ArrayList<String> outputList = new ArrayList<String>();
	for (int index = 0; index < listOfNames.size(); index++) {
		String name = listOfNames.get(index);
		if (name.startsWith("A") && name.length() > 6 && !outputList.contains(name))
			outputList.add(name);
	}
	System.out.println("ArrayList which contains name starts with A and having length more than 6 chars :- "+outputList);
}
}
