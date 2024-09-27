package chirag.assignment46;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*Remove all non prime numbers from given Set.
input : [19,12,18,17,23,22]
output : [19,17,23]*/

public class RemoveAllNonPrimeNumFromSet {
	
	void removeNonPrimeFromSet(LinkedHashSet<Integer> num) {
		LinkedHashSet<Integer> list=new LinkedHashSet<>();
		for(int number : num) {
			if(number % 2 ==0) {
				System.out.println(number + " is not prime");
			}
			else {
				list.add(number);
			}
		}
		System.out.println(list+" is prime numbers");
	}
	public static void main(String[] args) {
		RemoveAllNonPrimeNumFromSet removeAllNonPrimeNumFromSet = new RemoveAllNonPrimeNumFromSet();
		Integer [] input = {19,12,18,17,23,22};
		List<Integer> list = Arrays.asList(input);
		LinkedHashSet<Integer> set=new LinkedHashSet<>(list);
		removeAllNonPrimeNumFromSet.removeNonPrimeFromSet(set);
	}
}
