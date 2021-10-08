/*Example 17:
Write a program to add element at particular index of ArrayList?
*/

package vivek.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_17 {

	static void addElement(ArrayList<String> al, int index) {
		al.add(index, "techno");
		System.out.println(al);
	}

	public static void main(String[] args) {
		String[] input = { "vivek", "patil", "credits" };
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(input));
		Assignment46_17.addElement(al, 2);
	}
}
