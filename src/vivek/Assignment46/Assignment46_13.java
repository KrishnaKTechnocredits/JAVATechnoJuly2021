/*Example 13:
Remove all non prime numbers from given Set.
input : [19,12,18,17,23,22]
output : [19,17,23]*/

package vivek.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_13 {
	
	static void removeNonPrimeNumbers(ArrayList<Integer> al) {
		for (int index = 0; index < al.size(); index++) {
			if (!(isPrimeNumber(al.get(index)))) {
				al.remove(index);
				index--;
			}		
		}
		System.out.println(al);
	}
	
	static boolean isPrimeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index < num; index++)
			if (num % index == 0) {
				flag = false;
				break;
			}
		if (flag)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Integer[] input = {19,12,18,17,23,22};
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		Assignment46_13.removeNonPrimeNumbers(al);
	}
}
