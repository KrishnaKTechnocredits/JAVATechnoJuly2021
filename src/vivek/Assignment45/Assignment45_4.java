/*program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]
*/
package vivek.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment45_4 {

	static ArrayList<String> processData(ArrayList<String> list) {
		ArrayList<String> list1 = new ArrayList<String>();
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).charAt(0) == 'A' && list.get(index).length() > 6)
				if (list.indexOf(list.get(index)) == index)
					list1.add(list.get(index));
		}
		return list1;
	}

	public static void main(String[] args) {
		String[] input = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav",
				"Mayur", "Amruta", "Credits", "Amruta", "AparnaTiwari" };
		List<String> list = Arrays.asList(input);
		ArrayList<String> al = new ArrayList<String>(list);
		System.out.println(Assignment45_4.processData(al));
	}
}
