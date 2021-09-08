
package prerana;

import java.util.Arrays;

public class SimilarArray {

	void getsimilarArray(int arr1[], int arr2[]) {

		if(Arrays.equals(arr1, arr2)) 
			System.out.println("The array"+Arrays.toString(arr1)+" and array"+Arrays.toString(arr2)+" Are similar");
		else 
			System.out.println("The array"+Arrays.toString(arr1)+" and array "+Arrays.toString(arr2)+" Are not similar");

	}

	public static void main(String[] args) {
		SimilarArray sarray=new SimilarArray();
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17};
		sarray.getsimilarArray(arr1, arr2);

		int[] arr3 = {10,12,55,32,17,99};
		int[] arr4 = {10,12,55,32,17};
		sarray.getsimilarArray(arr3, arr4);

		int[] arr5 = {10,12,55,32,17};
		int[] arr6 = {10,12,55,32,17};
		sarray.getsimilarArray(arr5, arr6);

		int[] arr7 = {11,12,50,30,20};
		int[] arr8 = {10,12,50,32,20};
		sarray.getsimilarArray(arr7, arr8);

	}
}
