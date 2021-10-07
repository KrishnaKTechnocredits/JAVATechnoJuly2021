/* Assignment 46 - Collections : 4th Oct'2021
Example 17: Write a program to add element at particular index of ArrayList? */

package akanksha_Jain.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_17 {

	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println("Input- " + Arrays.toString(input));
		al.add(5, 77);
		System.out.println("List after adding element at particular index- " + al);
	}
}