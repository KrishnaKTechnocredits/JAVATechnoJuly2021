/*Example 9 : 
Write a program to return Union of two ArrayList without duplicates.
input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]
output : [10,19,33,44,12,99,110,11]
*/

package vivek.Assignment46;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Assignment46_9 {

	static void UnionArrayList(Integer[] arr1, Integer[] arr2) {
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>(Arrays.asList(arr1));
		LinkedHashSet<Integer> lhs2 = new LinkedHashSet<Integer>(Arrays.asList(arr2));
		lhs1.addAll(lhs2);
		System.out.println(lhs1);
	}

	public static void main(String[] args) {
		Integer[] input1 = { 10, 19, 33, 44, 12 };
		Integer[] input2 = { 19, 99, 110, 11, 10 };
		Assignment46_9.UnionArrayList(input1, input2);
	}
}
