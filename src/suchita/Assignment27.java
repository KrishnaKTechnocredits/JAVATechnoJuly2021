package suchita;

import java.util.Arrays;


// Find whether the given arrays are identicals or not.
class Assignment27 {

	void findIdenticalOrNot(int[] arr1,int[] arr2) {
		
		boolean flag = false;
		System.out.println("\n Given array1 = " + Arrays.toString(arr1) +"\n       array2 = " + Arrays.toString(arr2));
		
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] == arr2[index]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
		} else
			flag = false;
		
		if(flag)
			System.out.println("\n Identicals");
		else
			System.out.println("\n Not Identical");
	}
	
	public static void main(String[] args) {
		
		Assignment27 assignment = new Assignment27();
		int[] arr1 = {10,12,55,32,17}; int[] arr2 = {10,12,55,32,17};
		int[] arr3 = {10,12,55,32,17,99}; int[] arr4 = {10,12,55,32,17};
		int[] arr5 = {10,12,55,32,17}; int[] arr6 = {10,12,99,32,17};
		assignment.findIdenticalOrNot(arr1,arr2);
		assignment.findIdenticalOrNot(arr3,arr4);
		assignment.findIdenticalOrNot(arr5,arr6);
	}
}