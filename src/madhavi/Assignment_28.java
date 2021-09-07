package madhavi;

public class Assignment_28 {

	int findSmallestNumberFromArray(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	void nthHighest(int[] arr, int number) {
		int highestIndex, max = 0, startNumber = 0;
		int smallestnum = findSmallestNumberFromArray(arr);

		while (startNumber < number) {
			max = arr[0];
			highestIndex = 0;
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] > max) {
					max = arr[index];
					highestIndex = index;
				}
			}
			arr[highestIndex] = smallestnum;
			startNumber++;
		}
		System.out.println("Output: " + max);

		/*
		 * Alternative approach using for loop..
		 * 
		 * for(int j=0 ;j< number ; j++){ max = arr[0]; highestIndex = 0; for (int index
		 * = 0; index < arr.length; index++) { if (arr[index] > max) { max = arr[index];
		 * highestIndex = index; } } arr[highestIndex] = smallestnum; }
		 * 
		 */

	}

	public static void main(String[] args) {
		Assignment_28 assignment_28 = new Assignment_28();
		System.out.println("Find nth highest number from array:");
		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		int input = 3;
		assignment_28.nthHighest(arr, input);

		int[] arr1 = { -10, -23, -2, -11, -55, -43, -99 };
		assignment_28.nthHighest(arr1, input);

	}
}
