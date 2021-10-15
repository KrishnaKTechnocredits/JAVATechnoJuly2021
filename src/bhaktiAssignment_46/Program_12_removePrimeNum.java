
/*Example 12:
Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [19,17,23]*/


package bhaktiAssignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_12_removePrimeNum {
	
	static boolean isPrime(int n) {
		boolean flag= true;
		for (int i=2; i <= n/2; i++) {
			if (n%i==0)
				flag= false;
				break;
		}
		return flag;
	}
	
	static void removeNonPrimeNumber(ArrayList<Integer> input) {
		for (int i=0; i < input.size(); i++) {
			if (!isPrime(input.get(i))) {
				input.remove(input.get(i));
				i--;
			}		
		}
		System.out.println(input);
		
		
	}
	
	public static void main(String[] args) {
		Integer[] num= {19,12,18,17,23,22};
		ArrayList<Integer> input= new ArrayList(Arrays.asList(num));
		removeNonPrimeNumber(input);
	}
}
