package arti_G_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/
public class SecondLargestNumber {

	public static void main(String[] args) {
		int input[] = { 3, 35, 45, 68, 60, 90, 34, 100 };
		System.out.println("Input array is : " + Arrays.toString(input));
		Set<Integer> set = new TreeSet<Integer>();
		for (int index = 0; index < input.length; index++)
			set.add(input[index]);
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		System.out.println("The second largest number is : " + (list.get(list.size() - 2)));
	}
}
