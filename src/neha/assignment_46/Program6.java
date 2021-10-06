package neha.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/
public class Program6 {
	void findSecondLargestNumberInArray(int[] num) {
		Set<Integer> setList = new TreeSet<Integer>();
		for (int i : num) {
			// Add each element into the set
			setList.add(i);
		}
		ArrayList<Integer> al = new ArrayList(setList);
		System.out.println(
				"Second largest number in given array" + Arrays.toString(num) + " is " + al.get(al.size() - 2));
	}

	public static void main(String[] args) {
		Program6 program6 = new Program6();
		int[] num = { 4, 67, 8, 90, 23, 34, 18, 9, 56 };
		program6.findSecondLargestNumberInArray(num);
	}
}
