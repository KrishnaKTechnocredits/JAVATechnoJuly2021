package varun.varun_array_assignment;

public class IdenticalArray {
	void checkIdenticalArrays(int[] arr1, int[] arr2) {
		boolean flag = true;
		if (arr1.length != arr2.length) {
			System.out.println("Arrays are not identical");
		} else {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] == arr2[index])
					continue;
				else {
					flag = false;
					break;
				}

			}
			if (flag)
				System.out.println("Arrays are identical");
			else
				System.out.println("Arrays are not identical");
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {10,102,55,33,17};
		int[] arr2 = {10,12,55,33,17};
		
		int[] arr3 = {10,12,55,33,17};
		int[] arr4 = {10,12,55,33,17};
		IdenticalArray identicalArray = new IdenticalArray();
		identicalArray.checkIdenticalArrays(arr1,arr2);
		identicalArray.checkIdenticalArrays(arr3,arr4);
		
		
	}
}