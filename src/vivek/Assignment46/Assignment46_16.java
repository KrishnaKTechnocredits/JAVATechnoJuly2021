/*Example 16:
Write a program to traverse(or iterate) HashSet.*/

package vivek.Assignment46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Assignment46_16 {
	
	static void iterateHashSet(HashSet<String> hs) {
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		String[] input = {"vivek", "patil", "techno", "credits"};
		HashSet<String> hs = new HashSet<String>(Arrays.asList(input));
		Assignment46_16.iterateHashSet(hs);
	}
}
