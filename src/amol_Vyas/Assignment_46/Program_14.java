/*Example 13:
Write a program to convert Array to List.*/

package amol_Vyas.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Program_14 {

	static List<Integer> convertArrayToList(int[] input) {
		List<Integer> output = new ArrayList();
		for (int num : input) {
			output.add(num);
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 19, 12, 18, 17, 23, 22 };
		System.out.println(convertArrayToList(input));
	}
}
