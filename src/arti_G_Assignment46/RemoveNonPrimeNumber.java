package arti_G_Assignment46;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*Example 13:
Remove all non prime numbers from given Set.
input : [19,12,18,17,23,22]
output : [19,17,23]*/
public class RemoveNonPrimeNumber {

	static Set<Integer> removeNonPrimeNumber(Set<Integer> set) {
		Set<Integer> set1 = new TreeSet();
		for (int num : set) {
			if (num % 2 == 0) {
				set1.add(num);
			}
		}
		set.removeAll(set1);
		return set;
	}

	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		Set<Integer> list = new TreeSet<Integer>(Arrays.asList(input));
		System.out.println(removeNonPrimeNumber(list));

	}

}
