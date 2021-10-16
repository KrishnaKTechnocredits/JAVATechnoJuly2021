/*Programming Questions - Collections : 4th Oct'2021
Example 13:
Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [19,17,23]
*/
package shraddha.Assignment46;

import java.util.LinkedHashSet;

public class RemoveNonPrimeNumbersFromSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> hset = new LinkedHashSet<>();
		hset.add(19);
		hset.add(12);
		hset.add(18);
		hset.add(17);
		hset.add(23);
		hset.add(22);
		System.out.println(hset);
		System.out.println(removeNonPrime(hset));
	}

	static LinkedHashSet<Integer> removeNonPrime(LinkedHashSet<Integer> hset) {
		LinkedHashSet<Integer> outputSet = new LinkedHashSet<>();
		for (Integer num : hset) {
			boolean isPrime = true;
			for (int index = 2; index < num; index++) {
				if (num % index == 0)
					isPrime = false;
			}
			if (isPrime)
				outputSet.add(num);
		}
		return outputSet;
	}
}
