package arti_G_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

/*Example 9 : 
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]
output : [10,19,33,44,12,99,110,11]*/
public class UnionOfArrayList {

	public static void main(String[] args) {
		Integer[] input1 = {10, 19, 33, 44, 12};
		Integer[] input2 = {19, 99, 110, 11,10};
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(input1));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(input2));
		list2.removeAll(list1);
		list1.addAll(list2);
		System.out.println(list1);
	}

}
