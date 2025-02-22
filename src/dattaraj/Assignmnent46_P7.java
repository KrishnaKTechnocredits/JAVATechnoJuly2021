package dattaraj;

import java.util.ArrayList;

public class Assignmnent46_P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignmnent46_P7 pgm7 = new Assignmnent46_P7();
		System.out.println("The list of prime number in the range : ");
		System.out.println(pgm7.getPrimeNumberInRange(100,500));
	}

	ArrayList<Integer> getPrimeNumberInRange(int i, int j) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listOfPrimeNum = new ArrayList<Integer>();
		for (int j2 = i; j2 <= j; j2++) {
			if(checkNumberIsPrime(j2)) {
				listOfPrimeNum.add(j2);
			}
		}
		return listOfPrimeNum;
	}
	
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

}
