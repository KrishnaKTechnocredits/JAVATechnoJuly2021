/*Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/
package monika.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Program_6 {
	static int getSecondLargestNumber(Integer[] num) {
		TreeSet<Integer> numSet=new TreeSet<>(Arrays.asList(num));
		ArrayList<Integer> output=new ArrayList<>(numSet);
		int sLargest=output.get(output.size()-2);
		return sLargest;
	}

	public static void main(String[] args) {
		Integer[] numbers={ 1, 3, 4, 5, 6, 7, 8, 9, 13};
		System.out.println(Arrays.toString(numbers));
		System.out.println("Second largest number is - "
			    + getSecondLargestNumber(numbers));
	}
}
