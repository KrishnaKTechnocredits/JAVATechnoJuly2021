/*
 *Example 13:
Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [19,17,23]

 */
package husain.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Program13 {

	void getPrimeNum(Set<Integer> set) {

		ArrayList<Integer> list = new ArrayList<Integer>(set);
		for (int index : list)
			if (!isPrimeNum(index))
				set.remove(index);

		System.out.println("The modified set after removing all non prime numbers is " + set);
	}

	boolean isPrimeNum(int num) {

		for (int index = 2; index < num; index++) {
			if (num % index == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program13 obj = new Program13();
		Set<Integer> set = new LinkedHashSet<Integer>(Arrays.asList(19, 12, 18, 17, 23, 22));
		System.out.println("Input set " + set);
		obj.getPrimeNum(set);

	}

}
