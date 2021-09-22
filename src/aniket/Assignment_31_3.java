package aniket;

/*Program 3:
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25             	 24,25,26         	64,65,66*/

public class Assignment_31_3 {

	int getTriplet(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length - 2; index++) {
			if (arr[index] == arr[index + 1] - 1 && arr[index] == arr[index + 2] - 2)
				count++;

		}
		return count;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		System.out.println("The number of triplet in the given array is : " + new Assignment_31_3().getTriplet(arr));

	}
}
