package shantanu.arrayListPrograms_assignment46;

import java.util.LinkedHashSet;

/*Remove all non prime numbers from given Set.*/
public class RemoveNonPrimeNumbers {
	boolean isPrime(int num) {
		boolean flag = false;
		for(int index = 2; index <= num/2; index++) {
			if(num % index == 0)
				flag = false;
			else
				flag = true;
		}
		return flag;
	}
	LinkedHashSet<Integer> getPrimeSet(LinkedHashSet<Integer> setOfNumbers){
		LinkedHashSet<Integer> primeSet = new LinkedHashSet<>();
		for(int num : setOfNumbers) {
			if(isPrime(num))
				primeSet.add(num);
		}
		return primeSet;
	}
	public static void main(String[] args) {
		//19,12,18,17,23,22
		LinkedHashSet<Integer> setOfNumbers = new LinkedHashSet<>();
		setOfNumbers.add(19);
		setOfNumbers.add(12);
		setOfNumbers.add(18);
		setOfNumbers.add(17);
		setOfNumbers.add(23);
		setOfNumbers.add(22);
		
		RemoveNonPrimeNumbers removeNonPrimeNumbers = new RemoveNonPrimeNumbers();
		System.out.println("Set after removing non-prime numbers:");
		System.out.println(removeNonPrimeNumbers.getPrimeSet(setOfNumbers));
		
		
	}
}
