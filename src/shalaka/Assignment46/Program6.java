/*Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/
package shalaka.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Program6 {
	void getSecondLargestNo(Integer[] arr) {
		TreeSet<Integer> set = new TreeSet<Integer>(Arrays.asList(arr));
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		System.out.println("The second largest number from Given Array: " + list.get(list.size() - 2));
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 44, 30, 52, 57, 60, 95 };
		Program6 program6 = new Program6();
		program6.getSecondLargestNo(arr);
	}
}
