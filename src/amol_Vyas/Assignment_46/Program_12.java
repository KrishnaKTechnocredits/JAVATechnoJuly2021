/*Example 12:
Remove all non prime numbers from given Set.
input : [19,12,18,17,23,22]
output : [19,17,23]*/

package amol_Vyas.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Program_12 {

	static Set<Integer> printNonPrimeNumbers(Set<Integer> set) {
		Set<Integer> set1 = new TreeSet();
		for (int num : set) {
			if (num % 2 == 0)
				set1.add(num);
		}
		set.removeAll(set1);
		return set;
	}

	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		Set<Integer> arrayList = new TreeSet<Integer>(Arrays.asList(input));
		System.out.println(printNonPrimeNumbers(arrayList));
	}
}
