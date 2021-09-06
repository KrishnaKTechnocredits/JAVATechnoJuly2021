package monali.Assignment_28;
/*Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55*/

public class SecondMaxNumber {

	int findSecondHighestNumber(int[] arr) {
		int max = arr[0], secondMax = arr[1];

		for (int index = 2; index < arr.length; index++) {
			if (arr[index] > max) {
				secondMax = max;
				max = arr[index];

			}
		}

		return secondMax;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		SecondMaxNumber secondmax = new SecondMaxNumber();
		System.out.println("Second Highest Number in array : "+ secondmax.findSecondHighestNumber(arr));

	}

}
