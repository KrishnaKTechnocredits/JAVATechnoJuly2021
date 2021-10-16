/*Example 13:
Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [19,17,23]*/
package chandani.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment46l {
	
	void getPrimeNum(Set<Integer> input) {

		ArrayList<Integer> list = new ArrayList<Integer>(input);
		for (int index : list)
			if (!isPrimeNum(index))
				input.remove(index);

		System.out.println("Non Prime Numbers " + input);
	}

	boolean isPrimeNum(int num) {

		for (int index = 2; index < num; index++) {
			if (num % index == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		Assignment46l assignment46l = new Assignment46l();
		Set<Integer> input = new LinkedHashSet<Integer>(Arrays.asList(19, 12, 18, 17, 23, 22));
		System.out.println("Input set " + input);
		assignment46l.getPrimeNum(input);

	}

}
