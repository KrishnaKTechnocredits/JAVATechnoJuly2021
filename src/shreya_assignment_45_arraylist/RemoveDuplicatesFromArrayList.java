/*Assignment-45 : 2nd Oct
Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]
*/
package shreya_assignment_45_arraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromArrayList {
	void removeDuplicates(ArrayList<String> names) {
		for (int index = 0; index < names.size(); index++) {
			if (names.indexOf(names.get(index)) != names.lastIndexOf(names.get(index)))
				names.remove(names.lastIndexOf(names.get(index)));
		}

		System.out.print("Output : "+names);
	}
	public static void main(String[] args) {
		RemoveDuplicatesFromArrayList removeDuplicatesFromArrayList=new RemoveDuplicatesFromArrayList();
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Techno", "Mayur", "Chandni", "Amruta", "Chandni",
				"Parthav", "Mayur", "Amruta", "Credits", "Amruta"));
		System.out.println("Input : " + names);
		removeDuplicatesFromArrayList.removeDuplicates(names);

	}

}
