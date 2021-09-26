package genius;

import java.util.Arrays;

public class Assignment_27 {
	
	
	void arrayAreIdenticalOrNot(int[] arr1, int[] arr2) {
			if(Arrays.equals(arr1, arr2))
				System.out.println("Arrays are identical");
			else
				System.out.println("Arrays are not identical");
		}
	

	public static void main(String[] args) {
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,17,32};
		Assignment_27 assignment_27 = new Assignment_27();
		assignment_27.arrayAreIdenticalOrNot(arr1, arr2);

	}

}
