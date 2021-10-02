/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4*/

package vivek.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment45_3 {

	static void printIndex(ArrayList<String> list, String name) {
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).equals(name)) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		String[] input = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav",
				"Mayur", "Amruta", "Credits", "Amruta" };
		List<String> list = Arrays.asList(input);
		ArrayList<String> al = new ArrayList<String>(list);
		Assignment45_3.printIndex(al, "Akanksha");
	}
}
