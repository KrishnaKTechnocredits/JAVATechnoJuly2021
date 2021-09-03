package Sourabh_Assignment_27;

import java.util.Arrays;

public class ArrayIdenticalOrNot {

	void arrayAreIdenticalOrNot(int[] numarr1, int[] numarr2) {

		if(Arrays.equals(numarr1, numarr2))
			System.out.println("Given Arrays are Identical");
		else
			System.out.println("Given Arrays are Not Identical");
	}


	public static void main(String[] args) {
		ArrayIdenticalOrNot arrayidenticalornot = new ArrayIdenticalOrNot();

		int[] arr1 = {10,12,55,32,17,99};
		int[] arr2 = {10,12,55,32,17};

		arrayidenticalornot.arrayAreIdenticalOrNot(arr1, arr2);

		int[] array1 = {10,12,55,32,17};
		int[] array2 = {10,12,55,32,17};

		arrayidenticalornot.arrayAreIdenticalOrNot(array1, array2);
	}
}
