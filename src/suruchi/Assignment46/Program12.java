/*Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/

package suruchi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Program12 {

	ArrayList<Integer> removeZeros(ArrayList<Integer> input) {
		Iterator<Integer> itr = input.iterator();
		while (itr.hasNext()) {
			if (itr.next() == 0)
				itr.remove();
		}
		return input;
	}

	public static void main(String[] args) {
		Program12 program12 = new Program12();

		Integer[] input = { 10, 0, 0, 1, 0, 3, 0, 2, 6 };

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(input));

		System.out.println("Arraylist is: " + list);
		System.out.println("Arraylist after zeroes removed: "+ program12.removeZeros(list));
	}
}