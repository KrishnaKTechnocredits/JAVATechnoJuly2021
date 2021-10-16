/*Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [19,17,23]*/

package suruchi.Assignment46;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Program13 {

	LinkedHashSet<Integer> removeNonPrimeNumbers(LinkedHashSet<Integer> input) {
		Iterator<Integer> iterator = input.iterator();
		Program7 assignment = new Program7();
		while (iterator.hasNext()) {
			if (!assignment.checkNumberIsPrime(iterator.next()))
				iterator.remove();
		}
		return input;
	}

	public static void main(String[] args) {
		Program13 program13 = new Program13();

		LinkedHashSet<Integer> input = new LinkedHashSet<Integer>();
		input.add(19);
		input.add(12);
		input.add(18);
		input.add(17);
		input.add(23);
		input.add(22);

		System.out.println("Set is: " + input);
		System.out.println("Set after removing all non-prime numbers is: " + program13.removeNonPrimeNumbers(input));
	}
}