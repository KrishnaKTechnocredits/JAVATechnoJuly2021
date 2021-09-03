package devendra_Assignment_27;

import java.util.Arrays;

public class Assignment27_ArraysIdenticalOrNot {
	void arrayCompare(int arr1[], int arr2[]) {
		boolean flag = false;
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] == arr2[index])
					flag = true;
				else {
					flag = false;
					break;
				}
			}
		} else
			flag = false;
		if (flag)
			System.out.println(" Ans. = Identical Arrays ");
		else
			System.out.println(" Ans. = Non-Identical Arrays ");
	}

	public static void main(String[] args) {
		Assignment27_ArraysIdenticalOrNot arrays = new Assignment27_ArraysIdenticalOrNot();
		/*-Identical Array-*/
		int[] arr1 = { 10, 12, 55, 32, 17 };
		System.out.println(" 1st Array : " + Arrays.toString(arr1));
		int[] arr2 = { 10, 12, 55, 32, 17 };
		System.out.println(" 2nd Array : " + Arrays.toString(arr2));
		arrays.arrayCompare(arr1, arr2);
		/*-Non-Identical Array-*/
		int[] arr3 = { 10, 12, 55, 32, 17, 99 };
		System.out.println("----------------------\n 3rd Array : " + Arrays.toString(arr3));
		int[] arr4 = { 10, 12, 55, 32, 17 };
		System.out.println(" 4th Array : " + Arrays.toString(arr4));
		arrays.arrayCompare(arr3, arr4);
		/*-Non-Identical Array-*/
		int[] arr5 = { 10, 12, 55, 32, 17 };
		System.out.println("----------------------\n 5th Array : " + Arrays.toString(arr5));
		int[] arr6 = { 10, 12, 99, 32, 17 };
		System.out.println(" 6th Array : " + Arrays.toString(arr6));
		arrays.arrayCompare(arr5, arr6);
	}	
}