/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4*/
package shreya_assignment_45_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIndex {
	void printIndex(ArrayList<String> names) {
		System.out.println("index of all occurances of Akanksha. :");
		for(int index = 0; index < names.size(); index++) {
			if(names.get(index).equals("Akanksha"))
				System.out.print(index + " ");
		}
		
	}

	public static void main(String[] args) {
		
		FindIndex findIndex = new FindIndex();
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"));
		System.out.println("Input list " + names);
		findIndex.printIndex(names);


	}

}
