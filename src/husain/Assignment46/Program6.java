/*
 * Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList
 */
package husain.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 12, 35, 43, 21, 90, 99, 87, 56 };
		System.out.println("Input array " + Arrays.toString(num));
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int index = 0; index < num.length; index++)
			set.add(num[index]);

		ArrayList<Integer> list = new ArrayList<Integer>(set);

		System.out.println("The second largest number in the given set is " + (list.get(list.size() - 2)));
	}

}
