package margi.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/*Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/

public class Assignment_46_6 {

	int processSet(Integer[] num) {
		TreeSet<Integer> set = new TreeSet<>(Arrays.asList(num));
		ArrayList<Integer> output = new ArrayList<>(set);
		int largest = output.get(output.size()-2);
		return largest;
	}

	public static void main(String[] args) {
		Assignment_46_6 assignment_46_6 = new Assignment_46_6();
		Integer[] num = { 67, 76, 98, 51, 48, 6, 15, 23 };
		System.out.println(Arrays.toString(num));
		System.out.println("Second Largest Number: " + assignment_46_6.processSet(num));
	}
}
