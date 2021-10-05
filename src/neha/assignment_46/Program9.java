package neha.assignment_46;

import java.util.ArrayList;
import java.util.List;

/*Example 9 : 
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]*/
public class Program9 {
	List<Integer> unionOfArrayLists(int[] arr1, int[] arr2) {
		List<Integer> al1 = new ArrayList<Integer>();
		List<Integer> al2 = new ArrayList<Integer>();
		for (int i : arr1) {
			// Add each element into the set
			al1.add(i);
		}
		for (int i : arr2) {
			// Add each element into the set
			al2.add(i);
		}
		al2.removeAll(al1); // remove common elements from list 2
		al1.addAll(al2); // add unique elements from list 2 to list 1
		return al1;
	}

	public static void main(String[] args) {
		Program9 program9 = new Program9();
		int[] arr1 = { 10, 19, 33, 44, 12 };
		int[] arr2 = { 19, 99, 110, 11, 10 };
		System.out.println(program9.unionOfArrayLists(arr1, arr2));
	}
}
