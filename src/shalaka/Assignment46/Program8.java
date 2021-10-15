/*Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/
package shalaka.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Program8 {
	LinkedList<Integer> getNegativeNum(Integer[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		LinkedList<Integer> negNumList = new LinkedList<Integer>();
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index) < 0)
				if (index == list.lastIndexOf(list.get(index)))
					negNumList.add(list.get(index));
		}
		return negNumList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		Program8 program8 = new Program8();
		System.out.println("Negative numbers are: " + program8.getNegativeNum(arr));
	}

}
