/*Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].*/
package shalaka.Assignment46;

import java.util.ArrayList;

public class Program7 {
	boolean isPrime(int number) {
		boolean flag = true;
		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	ArrayList<Integer> getPrimeNoInGivenRange(int startNum, int endNum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int index = startNum; index <= endNum; index++) {
			if (isPrime(index))
				list.add(index);
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program7 program7 = new Program7();
		System.out.println(program7.getPrimeNoInGivenRange(100, 500));
	}

}
