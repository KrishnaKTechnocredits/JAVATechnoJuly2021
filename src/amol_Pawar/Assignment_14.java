package amol_Pawar;

public class Assignment_14 {

	int getMaxNumFromArray(int[] arr) {
		int maxNum = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (maxNum <= arr[index])
				maxNum = arr[index];
		}
		System.out.println("Maximum value in given array is : " + maxNum);
		return maxNum;
	}

	int getMinNumFromArray(int[] arr) {
		int minNum = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (minNum >= arr[index])
				minNum = arr[index];
		}
		System.out.println("Minimum value in given array is : " + minNum);
		return minNum;
	}

	void getDifferenceMinAndMaxValue(int max, int min) {
		int diff = max - min;
		System.out.println("Difference between maximum num " + max + " and minimum num " + min + " is : " + diff);
	}

	void getDiffMaxOddMaxEvenNum(int[] arr) {
		int even = arr[0];
		int odd = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				if (even < arr[index])
					even = arr[index];
			} else {
				if (odd < arr[index])
					odd = arr[index];
			}
		}
		if (even > odd) {
			int maxDifference = even - odd;
			System.out.println("difference between max even number " + even + " and max odd number " + odd + " is: "
					+ maxDifference);
		} else {
			int maxDifference = odd - even;
			System.out.println("difference between max odd number " + odd + " and max even number " + even + " is: "
					+ maxDifference);
		}
	}

	public static void main(String[] args) {
		Assignment_14 assignment_14 = new Assignment_14();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		int maxValue = assignment_14.getMaxNumFromArray(input);
		int minValue = assignment_14.getMinNumFromArray(input);
		assignment_14.getDifferenceMinAndMaxValue(maxValue, minValue);
		int[] input1 = { 1, 11, 44, 23, 55, 99, 23, 22 };
		assignment_14.getDiffMaxOddMaxEvenNum(input1);
	}
}
