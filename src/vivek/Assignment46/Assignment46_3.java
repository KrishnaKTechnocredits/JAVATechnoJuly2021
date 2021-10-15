/*Example 3 : 
Write a program to remove duplicate from ArrayList (without using set).*/

package vivek.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment46_3 {

	static void removeDuplicatesFromArraylist(ArrayList<Integer> al) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for (int index = 0; index < al.size(); index++) {
			if (al.indexOf(al.get(index)) == index) {
				al1.add(al.get(index));
			}
		}
		System.out.println(al1);
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 2, 3, 8, 3, 5, 4, 6, 4, 7);
		ArrayList<Integer> al = new ArrayList<Integer>(list);
		Assignment46_3.removeDuplicatesFromArraylist(al);
	}
}
