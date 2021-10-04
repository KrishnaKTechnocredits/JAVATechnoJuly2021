/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]
*/
package vivek.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment45_2 {

	static ArrayList<String> printDuplicates(ArrayList<String> list) {
		ArrayList<String> list1 = new ArrayList<String>();
		for (int index = 0; index < list.size(); index++) {
			if (list.indexOf(list.get(index)) != list.lastIndexOf(list.get(index))) {
				if (list.indexOf(list.get(index)) == index)
					list1.add(list.get(index));
			}
		}
		return list1;
	}

	public static void main(String[] args) {
		String[] input = { "Techno", "Mayur", "Chandni", "Amruta", "Chandni", "Parthav", "Mayur", "Amruta", "Credits",
				"Amruta" };
		List<String> list = Arrays.asList(input);
		ArrayList<String> al = new ArrayList<String>(list);
		System.out.println(Assignment45_2.printDuplicates(al));
	}
}
