package neha.assignment_46;

import java.util.LinkedList;
import java.util.List;

/*Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/
public class Program8 {
	List<Integer> removeDuplicatesFromGivenArray(int[] arr) {
		List<Integer> list = new LinkedList<Integer>();
		for (int i : arr) {
			// Add each element into the set
			if (!(list.contains(i)) && i < 0)
				list.add(i);
		}
		return list;
	}

	public static void main(String[] args) {
		Program8 program8 = new Program8();
		int[] num = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		System.out.println(program8.removeDuplicatesFromGivenArray(num));
	}
}
