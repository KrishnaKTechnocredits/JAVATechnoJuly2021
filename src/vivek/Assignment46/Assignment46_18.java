/*Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).*/

package vivek.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_18 {

	static void removeObject(ArrayList<String> al) {
		al.remove("accenture");
		System.out.println(al);
	}

	public static void main(String[] args) {
		String[] input = { "vivek", "patil", "techno", "credits", "accenture" };
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(input));
		Assignment46_18.removeObject(al);
	}
}
