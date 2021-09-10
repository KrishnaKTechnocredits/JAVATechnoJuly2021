package siddharth;

public class Assignment_27 {
	void compareArrays(int[] arr1, int[] arr2) {
		boolean status = true;
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] == arr2[index])
					continue;
				else {
					status = false;
					break;
				}
			}
			if (status)
				System.out.println("Identical array");
			else
				System.out.println("Non identical array");
		} else
			System.out.println("Non identical array");
	}

	public static void main(String[] args) {
		Assignment_27 assignment27 = new Assignment_27();
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		assignment27.compareArrays(arr1, arr2);
		int[] arr3 = { 10, 12, 55, 32, 17, 99 };
		int[] arr4 = { 10, 12, 55, 32, 17 };
		assignment27.compareArrays(arr3, arr4);
		int[] arr5 = { 10, 12, 55, 32, 17 };
		int[] arr6 = { 10, 12, 99, 32, 17 };
		assignment27.compareArrays(arr5, arr6);
	}
}
