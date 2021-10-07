/* Assignment 46 - Collections : 4th Oct'2021
Example 7 : Return ArrayList of first 10 prime numbers in the range [100,500]. */

package akanksha_Jain.Assignment_46;

import java.util.ArrayList;

public class Program_7 {
	int count = 0, cnt = 0;
	
	boolean findPrimeNumber(int number) {
		boolean status=true;
		for (int index=2; index<=number-1; index++) {
			if (number % index == 0 ) {
				status = false;
				break;
			}
		}
		if(status) {
			count ++;
			cnt ++;
		}
		return status;
	}
	
	void findPrimeNumberInRange(int startNumber, int endNumber) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int number=startNumber; number<=endNumber; number++) {
			if(findPrimeNumber(number) && cnt<=10) {
				al.add(number);
			}
		}
		System.out.println(al + " is the list of first 10 prime numbers in the range 100 to 500");
	}

	public static void main(String[] args) {
		Program_7 p7 = new Program_7();
		p7.findPrimeNumberInRange(100, 500);
	}
}