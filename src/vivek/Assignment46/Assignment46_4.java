/*Example 4:   
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/

package vivek.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Assignment46_4 {

	static void removeDuplicatesFromArraList(ArrayList<Integer> al) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(al);
		System.out.println(lhs);
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 2, 3, 8, 3, 5, 4, 6, 4, 7);
		ArrayList<Integer> al = new ArrayList<Integer>(list);
		Assignment46_4.removeDuplicatesFromArraList(al);
	}
}
