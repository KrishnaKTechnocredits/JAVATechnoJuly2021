package margi.Assignment_27;

import java.util.Arrays;

public class Assignment_27_2 {
	
	//to find 2 arrays are identical or not
	void compareArr(int[] arr1, int[] arr2) {
		if(Arrays.equals(arr1, arr2))
			System.out.println("Arrays are identical");
		else
			System.out.println("Arrays are not identical");
	}
		
	public static void main(String[] args) {
		Assignment_27_2 assignment_27_2 = new Assignment_27_2();
		int[] arr1 = {10,12,55,32,17,99};
		int[] arr2 = {10,12,55,32,17};
		assignment_27_2.compareArr(arr1,arr2);
	}
}
