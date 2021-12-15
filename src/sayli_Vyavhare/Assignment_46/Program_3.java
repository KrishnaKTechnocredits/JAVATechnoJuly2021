/*Example 3 :
Write a program to remove duplicate from ArrayList (without using set).*/
package sayli_Vyavhare.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_3 {

	static void numDuplicate(Integer[] input) {
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> arr1 = new ArrayList<Integer>();

		for (int num : arr) {
			if (!arr1.contains(num)) 
				arr1.add(num);

		}
			System.out.println("After removing duplicate from ArrayList: " +arr1);
	}
		
	

	public static void main(String[] args) {
		Integer[] input1 = { 5, 66, 98, 7, 10, 5 };
		numDuplicate(input1);

	}

}
