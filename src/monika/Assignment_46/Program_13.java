/*Example 13:
Remove all non prime numbers from given Set.
input : [19,12,18,17,23,22]
output : [19,17,23]
 */
package monika.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program_13 {
	void getPrimeNumber(Set<Integer> set) {
		
		ArrayList<Integer> al=new ArrayList<Integer>(set);
		for(int index: al)
			if(!isPrimeNumber(index))
				set.remove(index);
		System.out.println("After removing all Prime Numbers from Set:"+set);
	}
	
	boolean isPrimeNumber(int number) {
		for(int index=2; index<number; index++) {
			if(number %index==0)
				return false;
					
		}
		return true;
	}
	public static void main(String[] args) {
		Program_13 program_13=new Program_13();
		Integer[] num = { 19, 12, 18, 17, 23, 22 };
		Set<Integer> set=new LinkedHashSet<Integer>(Arrays.asList(num));
		System.out.println("Given Set: "+set);
		program_13.getPrimeNumber(set);
	}

}
