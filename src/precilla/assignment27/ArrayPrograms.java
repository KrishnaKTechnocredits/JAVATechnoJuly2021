package precilla.assignment27;

import java.util.Arrays;

public class ArrayPrograms {
	void identicalArray(int[] array,int[] array1) {
		boolean identical=false;
		if(array.length==array1.length) {
			for(int index=0;index<array.length;index++) {
				if(array[index]==array1[index])
					identical=true;
				else {
					identical=false;
					break;
				}
			}
			if(identical)
				System.out.println("Output: Identical");
			else
				System.out.println("Output: Not identical");
		}
		else {
			System.out.println("Output: Not Identical");
		}	
	}

	public static void main(String[] args) {
		ArrayPrograms arrayPrograms=new ArrayPrograms();
		System.out.println("Program To find 2 arrays are identical or not.");
		int[] arr1 = {10,12,55,24,17};
		int[] arr2 = {10,12,55,24,17};
		System.out.println("\nInput 1: ");
		System.out.println("Array 1: "+Arrays.toString(arr1));
		System.out.println("Array 2: "+Arrays.toString(arr2));
		arrayPrograms.identicalArray(arr1,arr2);
		int[] array1 = {10,12,55,32,17,99};
		int[] array2 = {10,12,55,32,17};
		System.out.println("\nInput 2: ");
		System.out.println("Array 1: "+Arrays.toString(array1));
		System.out.println("Array 2: "+Arrays.toString(array2));
		arrayPrograms.identicalArray(array1, array2);
		int[] arr_1 = {10,12,55,32,17};
		int[] arr_2= {10,12,99,32,17};
		System.out.println("\nInput 3:");
		System.out.println("Array 1: "+Arrays.toString(arr_1));
		System.out.println("Array 2: "+Arrays.toString(arr_2));
		arrayPrograms.identicalArray(arr_1, arr_2);
	}

}
