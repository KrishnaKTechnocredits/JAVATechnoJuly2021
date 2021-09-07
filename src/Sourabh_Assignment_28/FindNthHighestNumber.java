package Sourabh_Assignment_28;

import java.util.Arrays;

public class FindNthHighestNumber {

	// Finding nth max number :
	int[] findSecondMaxNum(int[] numarr) {

		int maxNum = 0, maxNumIndex = 0;

		// Finding MaxNum
		int index = 0;
		for (; index < numarr.length; index++) {

			if (numarr[index] > maxNum) {
				maxNum = numarr[index];
				maxNumIndex = index;
			}
		}
		System.out.println("\nMaximum Number from given Array is : " + maxNum + " and its index is : " + maxNumIndex);

		// Making maxnum index as 0
		numarr[maxNumIndex] = 0;

		return numarr;
	}

	void takeArray(int[] numarr, int n) {

		int nthMaxnum = 0, nthMaxNumIndex = 0, count = 1;
		for (int index = 0; index < numarr.length; index++) {

			if (index < n) {
				numarr = findSecondMaxNum(numarr);
				System.out.println("Array after Making Maximum Number Index as 0 is : " + Arrays.toString(numarr));
				System.out.println("______________________________________________________________________________");
				count++;
			}
		}

		// Finding nth MaxNum
		for (int index = 0; index < numarr.length; index++) {

			if (numarr[index] > nthMaxnum) {
				nthMaxnum = numarr[index];
				nthMaxNumIndex = index;
			}
		}
		System.out.println("\n" + count + "rd highest number from in array is : " + nthMaxnum + " and its index is : "+ nthMaxNumIndex);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 55, 2, 11, 23, 43, 99 };
		int n = 2;

		System.out.println("\nGiven Array is : int[] arr = { 10, 23, 2, 11, 55, 43, 99 }");
		System.out.println("-----------------------------------------------------------------------------");
		FindNthHighestNumber nthhighestnum = new FindNthHighestNumber();
		nthhighestnum.takeArray(arr, n);
	}
}
