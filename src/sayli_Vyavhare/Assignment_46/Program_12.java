/*Example 12 :
Remove all zeros from given ArrayList.
 
input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/
package sayli_Vyavhare.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_12 {

	static void removeAllZeros(Integer[] input) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		for (Integer num : list) {
			if (num != 0) {
				list1.add(num);
			}

		}
		System.out.println("After removing all zeros arraylist is :" + list1);

	}

	public static void main(String[] args) {

		Integer[] input = { 10, 0, 0, 1, 0, 3, 0, 2, 6 };
		removeAllZeros(input);
	}

}
