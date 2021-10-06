//Return ArrayList of first 10 prime numbers in the range [100,500].

package astha.Assignment46;

import java.util.ArrayList;

public class Assignment7 {

	boolean checkNumberIsPrime(int number) {
		boolean isPrime = true;
		for (int index = 2; index <number; index++) {
			if (number % index == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
		}

	ArrayList<Integer> getPrimeNumberInRange(int startIndex, int endIndex){
		ArrayList<Integer> listOfPrimeNum = new ArrayList<Integer>();
		for(int index= startIndex; index<= endIndex; index++) {
			if(checkNumberIsPrime(index))
				listOfPrimeNum.add(index);
		}
		return listOfPrimeNum;
	}
	
	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		System.out.println("The list of prime number in the range : ");
		System.out.println(assignment7.getPrimeNumberInRange(100,500));
		
		
	}
}
