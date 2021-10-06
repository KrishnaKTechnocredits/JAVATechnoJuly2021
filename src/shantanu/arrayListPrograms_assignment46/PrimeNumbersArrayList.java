package shantanu.arrayListPrograms_assignment46;

import java.util.ArrayList;

/*Return ArrayList of first 10 prime numbers in the range [100,500].*/
public class PrimeNumbersArrayList {
	boolean isPrime(int num) {
		boolean flag = false;
		for(int start = 2; start <= num/2; start++) {
			if(num % start == 0)
				flag = false;
			else
				flag = true;
		}
		return flag;
	}
	ArrayList<Integer> getPrimeNumbers(int start, int end){
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		int count = 0;
		for(int num = start; num <= end; num++) {
			if(isPrime(num) && count < 10) {
				primeNumbers.add(num);
				count++;
			}
		}
		return primeNumbers;
	}
	public static void main(String[] args) {
		PrimeNumbersArrayList primeNumbersArrayList = new PrimeNumbersArrayList();
		System.out.println("First 10 prime numbers between 100 and 500 are:");
		System.out.println(primeNumbersArrayList.getPrimeNumbers(100,500));
	}
}
