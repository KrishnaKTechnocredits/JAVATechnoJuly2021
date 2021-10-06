/*Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/

package amol_Vyas.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program_3 {

	static void isRemoveDuplicate(ArrayList<Integer> input) {
		Set<Integer> set = new LinkedHashSet(input);
		System.out.println(set);
		
	}
	
	public static void main(String[] args) {
		Integer[] input = { 1, 6, 2, 9, 3, 0, 2, 4,1,9 };
		ArrayList<Integer> arraylist = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(arraylist);
		isRemoveDuplicate(arraylist);
		}
}
