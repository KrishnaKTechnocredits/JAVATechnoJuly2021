package Sourabh_Assignment_28;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondHighestNumber {

	// 1st solution :
	void findSecondHighestNum(int[] numarr) {

		int maxNum = 0, secondMaxNum = 0;

		for (int index = 0; index < numarr.length; index++) {

			if (numarr[index] > maxNum) {
				secondMaxNum = maxNum;
				maxNum = numarr[index];
			} 
			else if (secondMaxNum < numarr[index]) {
				secondMaxNum = numarr[index];
			}
		}
		System.out.println("\nSecond Highest Number from given Array is : " + secondMaxNum);
	}

	// 2nd solution :
	void findSecondMaxNum(int[] numarr) {
		int maxNum = 0, maxNumIndex = 0, secondMaxNum = 0, secondMaxNumIndex = 0;

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

		System.out.println("\nArray after Making Maximum Number Index as 0 is: " + Arrays.toString(numarr));

		// Finding Second MaxNum
		for (int index1 = 0; index1 < numarr.length; index1++) {

			if (numarr[index1] > secondMaxNum) {
				secondMaxNum = numarr[index1];
				secondMaxNumIndex = index1;
			}
		}
		System.out.println("\nSecond Highest Number from given Array is : " + secondMaxNum + " and its index is : "
				+ secondMaxNumIndex);
	}

	public static void main(String[] args) {
		// int[] arr = {10,23,2,11,55,43,99};

		FindSecondHighestNumber find = new FindSecondHighestNumber();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array : ");
		int size = sc.nextInt();

		System.out.println("Enter Array elements : ");
		int[] element = new int[size];

		for (int index = 0; index < element.length; index++) {
			element[index] = sc.nextInt();
		}

		System.out.println("Array of Integer number is : " + Arrays.toString(element));

		System.out.println("-------------------------------------------------------");

		find.findSecondHighestNum(element);

		System.out.println("-------------------------------------------------------");

		find.findSecondMaxNum(element);
		sc.close();
	}
}