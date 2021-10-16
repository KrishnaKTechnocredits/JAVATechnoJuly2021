
/*Example 13:
Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [19,17,23]*/
package shreya_assignment_46_Collections_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program13 {
	void getNonPrimeNumber(Set<Integer> input) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(input);
		for(int num1 : list1)
			if(!isPrime(num1)) {
				input.remove(num1);
			}
		System.out.println("After removing non-prime numbers from set : "+input);
	}
	
	boolean isPrime(int num) {
		for(int index=2;index<num;index++) {
			if(num%index==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Program13 program13 = new Program13();
		Integer[] arr = {19,12,18,17,23,22};
		Set<Integer> set = new LinkedHashSet<Integer>(Arrays.asList(arr));
		System.out.println("Input : "+set);
		program13.getNonPrimeNumber(set);
	}

}
