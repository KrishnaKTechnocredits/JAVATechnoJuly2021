/*
 Example 9 :
Write a program to return Union of two ArrayList without duplicates.
input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]
 
output : [10,19,33,44,12,99,110,11] */
package sayli_Vyavhare.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_9 {

	static void unionOfArrayList(Integer[] input1, Integer[] input2) {

		ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(input1));
		ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(input2));
		al2.removeAll(al1);
		al1.addAll(al2);

		System.out.println("Union of two ArrayList without duplicates" + al1);

	}

	public static void main(String[] args) {
		Integer[] input1 = { 10, 19, 33, 44, 12 };
		Integer[] input2 = { 19, 99, 110, 11,10 };

		unionOfArrayList(input1, input2);

	}

}
