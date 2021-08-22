package bhagyashree;

public class Assignment14 {

	int minnumber;
	int maxnumber;

	int getMaxNumber(int[] array) {
		int max = array[0];
		for (int index = 0; index < array.length; index++) {
			if (array[index] > max) {
				max = array[index];
				maxnumber = max;
			}
		}
		return max;
	}// find max number from array

	int getMinNumber(int[] array) {
		int min = array[0];
		for (int index = 0; index < array.length; index++) {
			if (array[index] < min) {
				min = array[index];
				minnumber = min;
			}
		}
		return minnumber;

	}// find min number from array

	int getDifference() {
		return (maxnumber - minnumber);
	}// print difference between max number and min number

	int getEvenOddDifference(int[] array) {
		int maxEven = 0;
		int maxOdd = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] % 2 == 0) {
				if (array[index] > maxEven)
					maxEven = array[index];
			} else if (array[index] > maxOdd)
				maxOdd = array[index];

		}
		if (maxOdd - maxEven > 0)
			return maxOdd - maxEven;
		else
			return maxEven - maxOdd;
	}

	public static void main(String[] arg) {
		int[] input = { 2, 44, 23, 55, 99, 23, 22, 1 };
		Assignment14 assignment14 = new Assignment14();
		System.out.println("Maximum number from array is: " + assignment14.getMaxNumber(input));

		System.out.println("Minimum number from array is: " + assignment14.getMinNumber(input));

		System.out.println("Difference between max number and min number is:" + assignment14.getDifference());

		System.out.println("Difference between Maximum Odd number and Maximum Even number is: "
				+ assignment14.getEvenOddDifference(input));
	}
}
