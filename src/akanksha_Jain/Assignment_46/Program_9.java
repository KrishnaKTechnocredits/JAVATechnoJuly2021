/* Assignment 46 - Collections : 4th Oct'2021
Example 9 : Write a program to return Union of two ArrayList without duplicates.
input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]
output : [10,19,33,44,12,99,110,11] */

package akanksha_Jain.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_9 {

	public static void main(String[] args) {
		Integer[] input1 = {10, 19, 33, 44, 12};
		Integer[] input2 = {19, 99, 110, 11,10};
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(input1));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(input2));
		list2.removeAll(list1);
		list1.addAll(list2);
		System.out.println(list1 + " is the union of two lists- " + Arrays.toString(input1) + " and " + Arrays.toString(input2));
	}
}