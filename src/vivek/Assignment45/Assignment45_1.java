/*Program 1: remove duplicates from arraylist, it should have only single occurance 
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]*/

package vivek.Assignment45;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45_1 {

	static void removeDuplicates(List<String> list) {
		for (int index = 0; index < list.size(); index++) {
			if (!(list.indexOf(list.get(index)) == index)) {
				list.remove(index);
				index--;
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		String[] arr = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits",
				"Amruta" };
		List<String> list = Arrays.asList(arr);
		ArrayList<String> al = new ArrayList<String>(list);
		Assignment45_1.removeDuplicates(al);
	}
}
