/*Example 13:
Remove all non prime numbers from given Set.
input : [19,12,18,17,23,22]
output : [19,17,23]*/
package sayli_Vyavhare.Assignment_46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program_13 {

	static void removeNonPrime(Integer[] input) {

		Set<Integer> set = new HashSet<Integer>(Arrays.asList(input));
		Set<Integer> output = new HashSet<Integer>();
		for (Integer num : set) {

			if (num % 2 == 0) {
				output.add(num);

			}
		}
		set.removeAll(output);
		System.out.println("After removing all non prime numbers from given Set is: " + set);

	}

	public static void main(String[] args) {

		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		removeNonPrime(input);

	}

}
