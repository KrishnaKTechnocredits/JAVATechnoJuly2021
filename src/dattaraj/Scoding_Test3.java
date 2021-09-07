package dattaraj;

import java.util.Arrays;

public class Scoding_Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scoding_Test3 test3 = new Scoding_Test3();
		
		int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		
		int[] arr = test3.removeElement(arr1,14);
		System.out.println("Result Array: "+ Arrays.toString(arr));
		
	}

	int[] removeElement(int[] arr1, int i) {
		// TODO Auto-generated method stub
		int[] newArray = new int[arr1.length - 1];
		int k =0;
		for (int j = 0; j < arr1.length; j++) {
			if(arr1[j]==i) {
				continue;
			}
			newArray[k++] = arr1[j];
		}
		return newArray;
	}

}
