/*Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/

package amol_Pawar.assignment_46;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Program_8 {

	void getNegativeNum(Integer[] arr) {
		List<Integer> list = new LinkedList(Arrays.asList(arr));
		List<Integer> inputList = new LinkedList();
		for (Integer num : list) {
			if (num < 0 && !inputList.contains(num)) {
				inputList.add(num);
			}
		}
		System.out.println("Negative numbers from given list"+list+" are : "+inputList);
	}

	public static void main(String[] args) {
		Program_8 program_8 = new Program_8();
		Integer arr[] = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		program_8.getNegativeNum(arr);

	}

}
