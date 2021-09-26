package dattaraj;

import java.util.Arrays;

public class Assignment_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_27 assign27 = new Assignment_27();
		
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17};
		assign27.compareArray(arr1,arr2);
		
		int[] arr3 = {10,12,55,32,17,99};
		int[] arr4 = {10,12,55,32,17};
		assign27.compareArray(arr3,arr4);
		
		int[] arr5 = {10,12,55,32,17};
		int[] arr6 = {10,12,99,32,17};
		assign27.compareArray(arr5,arr6);
	}

	private void compareArray(int[] a1, int[] a2) {
		// TODO Auto-generated method stub
		//boolean matchFlag = false;
		if(a1.length==a2.length && Arrays.equals(a1, a2)) {
			System.out.println("identical");
		}else {
			System.out.println("Not identical");
		}
	}

}
