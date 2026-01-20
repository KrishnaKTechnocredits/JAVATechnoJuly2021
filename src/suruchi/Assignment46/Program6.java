/*Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/

package suruchi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Program6 {

	void getSecondHighestNum(Integer[] input) {
		TreeSet<Integer> list1 = new TreeSet<Integer>(Arrays.asList(input));
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1);
		System.out.println("The second highest number in the array is " + (list2.get(list2.size() - 2)));
	}

	public static void main(String[] args) {
		Program6 program6 = new Program6();

		Integer[] inputArr = { 10, 20, 30, 55, 66, 77, 66, 20, 100, 98 };
		
		System.out.println("Array is: " + Arrays.toString(inputArr));
		program6.getSecondHighestNum(inputArr);
	}
}