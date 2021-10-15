/*program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.*/

package amol_Vyas.Assignment_48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_11 {

	static void findDuplicateNumberUsingArrayList(Integer[] input) {
		List<Integer> list = new ArrayList(Arrays.asList(input));
		for (int index = 0; index < list.size(); index++) {
			if (list.lastIndexOf(list.get(index)) != list.indexOf(list.get(index))) {
				System.out.print(list.get(index) + " ");
				list.remove(list.get(index));
			}
		}
	}

	public static void main(String[] args) {
		Integer[] input = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		findDuplicateNumberUsingArrayList(input);
	}
}
