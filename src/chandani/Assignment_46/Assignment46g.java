/*Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].*/package chandani.Assignment_46;

import java.util.ArrayList;

public class Assignment46g {
	
	boolean isPrime(int num) {
		for (int index = 2; index < num / 2; index++)
			if (num % index == 0)
				return false;
		return true;
	}

	ArrayList<Integer> getPrimeNumber(int startIndex, int endIndex) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for (int index = startIndex; index < endIndex; index++) {
			if (isPrime(index) & count < 10) {
				list.add(index);
				count++;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Assignment46g assignment46g = new Assignment46g();
		
		System.out.println("First 10 prime numbers in the range 100 to 200 is " + assignment46g.getPrimeNumber(100,200) );
	}
	
}
