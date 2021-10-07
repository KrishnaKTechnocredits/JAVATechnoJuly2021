/*Assignment-45 : 2nd Oct

Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]
*/

package parthav.parthavD_Assignment45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program1RemoveDuplicates {

	void removeDuplicates(String[] arr) {
		List<String> listInput = new ArrayList<String>(Arrays.asList(arr));
		List<String> listOutput = new ArrayList<String>();
		for (String str : listInput) {
			if (!listOutput.contains(str)) {
				listOutput.add(str);
			}
		}

		System.out.println(listOutput);

	}

	public static void main(String[] args) {
		
		System.out.println("-------------Program1-----------------------------");
		String[] arr = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits",
				"Amruta" };
		Program1RemoveDuplicates newObject = new Program1RemoveDuplicates();
		newObject.removeDuplicates(arr);
		System.out.println("-------------Program2-----------------------------");
		String[] strArray = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta",
				"Credits", "Amruta" };
		Program2PrintDuplicates newObj = new Program2PrintDuplicates();
		newObj.printDuplicates(strArray);
		System.out.println("-------------Program3-----------------------------");
		String[] str = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav", "Mayur",
				"Amruta", "Credits", "Amruta" };
		Program3PrintIndex newObj1 = new Program3PrintIndex();
		newObj1.printIndexOfAllOccurrences(str, "Akanksha");		
		System.out.println("-------------Program4-----------------------------");
		String[] strArray1 = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav",
				"Mayur", "Amruta", "Credits", "Amruta", "AparnaTiwari" };
		Program4ReturnArrList newObj2 = new Program4ReturnArrList();
		System.out.println(newObj2.getArrayList(strArray1));
	}

}
