package margi.Assignment_27;

import java.util.Arrays;

public class Assignment_27_3 {
	
	//to find 2 arrays are identical or not
	void compareArr(int[] arr1, int[] arr2) {
		if(Arrays.equals(arr1, arr2))
			System.out.println("Arrays are identical");
		else
			System.out.println("Arrays are not identical");
	}
			
	public static void main(String[] args) {
		Assignment_27_3 assignment_27_3 = new Assignment_27_3();
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,99,32,17};
		assignment_27_3.compareArr(arr1,arr2);
	}
}
