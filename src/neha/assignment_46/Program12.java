package neha.assignment_46;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*Example 13:
Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [19,17,23]*/
public class Program12 {
	Set<Integer> removeNonPrimeNumbers(Set<Integer> setList) {
		Set<Integer> output = new LinkedHashSet<Integer>();
		Iterator<Integer> itr = setList.iterator();
		while (itr.hasNext()) {
			int num = itr.next();
			if ((IsNumPrime(num)))
				output.add(num);
		}
		return output;
	}

	private boolean IsNumPrime(int num) {
		int cnt = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				cnt++;
				break;
			}
		}
		if (cnt == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Program12 program12 = new Program12();
		Integer[] num = { 19, 12, 18, 17, 23, 22 };
		Set<Integer> set = new LinkedHashSet<Integer>(Arrays.asList(num));
		System.out.println(program12.removeNonPrimeNumbers(set));
	}
}
