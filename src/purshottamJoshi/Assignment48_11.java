/*program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.*/

package purshottamJoshi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment48_11 {
	
	void findDuplicateElements(Integer[] input) {
		List<Integer> al = new ArrayList(Arrays.asList(input));
		System.out.println("Duplicate elements from arrayList :");
		for (int index = 0; index < al.size(); index++) {
			if (al.lastIndexOf(al.get(index)) != al.indexOf(al.get(index))) {
				
				al.remove(al.get(index));
				System.out.println(al.get(index));
			}
		}
	}

	public static void main(String[] args) {
		Integer[] input = { 10, 99, 28, 7, 6, 99, 10,33,53 };
		new Assignment48_11().findDuplicateElements(input);
	}
}
