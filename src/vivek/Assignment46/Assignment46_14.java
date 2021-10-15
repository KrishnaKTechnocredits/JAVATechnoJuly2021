/*Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.
*/

package vivek.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Assignment46_14 {

	static void iterateUsingEnhancedForLoop(ArrayList<String> al) {
		for (String str:al) {
			System.out.println(str);
		}
	}
	
	static void iterateUsingIterator(ArrayList<String> al) {
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args) {
		String[] input = {"vivek", "patil", "techno", "credits"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(input)); 
		Assignment46_14.iterateUsingEnhancedForLoop(al);
		Assignment46_14.iterateUsingIterator(al);
	}
}
