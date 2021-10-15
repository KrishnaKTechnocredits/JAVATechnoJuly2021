//Return ArrayList of first 10 prime numbers in the range [100,500].
package amol_Pawar.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Program_7 {
	boolean getPrimeNumbers(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			} else {
				flag = true;

			}
		}
		return flag;
	}

	void getFirstTenPrimeNum(int startIndex, int endIndex) {

		int count = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int index = startIndex; index <= endIndex; index++) {

			if (getPrimeNumbers(index) && count < 10) {

				list.add(index);
				count++;
			}

		}
		System.out.println("First 10 Prime numbers between "+startIndex+" and "+endIndex+" are: "+list);
	}

	public static void main(String[] args) {
		Program_7 program_7 = new Program_7();
		int startIndex = 100;
		int endIndex = 500;
		program_7.getFirstTenPrimeNum(startIndex, endIndex);

	}

}
