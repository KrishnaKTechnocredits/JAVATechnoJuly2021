package chirag.assignment46;

import java.util.ArrayList;
import java.util.Arrays;

//Return ArrayList of first 10 prime numbers in the range [100,500]

public class FindPrimeNumbersInRange {
	
	boolean numIsPrime(int num) {
		Boolean status = true;
		for(int index = 2;index < num;index++) {
			if(num % index == 0) {
				status=false;
				break;
			}
			else {
				status = true;
			}
		}
		return status;
	}
	
	void getPrimeNumberInRange(int start,int end,int range) {
		ArrayList<Integer> al = new ArrayList<>();
		int count=0;
		for(int index = start ; index < end ; index++) {
			if(count<range) {
				if(numIsPrime(index)) {
					al.add(index);
					count++;
				}
			}
		}

		System.out.println(al);
		
	}
	public static void main(String[] args) {
		FindPrimeNumbersInRange findPrimeNumbersInRange=new FindPrimeNumbersInRange();
		findPrimeNumbersInRange.getPrimeNumberInRange(100, 500, 10);
	}
}
