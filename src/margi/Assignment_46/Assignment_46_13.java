package margi.Assignment_46;

import java.util.Arrays;
import java.util.LinkedHashSet;

/*Remove all non prime numbers from given Set.
input : [19,12,18,17,23,22]
output : [19,17,23]*/

public class Assignment_46_13 {

	boolean isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			} else
				flag = true;
		}
		return flag;
	}

	LinkedHashSet<Integer> getNonPrime(LinkedHashSet<Integer> set) {
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
		for (int num : set) {
			if (isPrime(num))
				numbers.add(num);
		}
		return numbers;
	}

	public static void main(String[] args) {
		Assignment_46_13 assignment_46_13 = new Assignment_46_13();
		Integer[] num = { 19, 12, 18, 17, 23, 22 };
		LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(num));
		System.out.println(assignment_46_13.getNonPrime(set));
	}
}
