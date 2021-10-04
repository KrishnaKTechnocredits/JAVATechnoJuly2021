package aniket;

public class Assignment_32 {
	void getTriplet(int[] arr) {
		int sum = 0;
		int count = 0;
		int consNumSum = 0;
		int consIndex = 0;

		for (int index = 0; index < arr.length - 2; index++) {
			if (arr[index] + 1 == arr[index + 1] && arr[index + 1] + 1 == arr[index + 2]) {
				count++;
				sum = arr[index] + arr[index + 1] + arr[index + 2];
				// System.out.println(arr[index]);

				if (sum > consNumSum) {
					consNumSum = sum;
					consIndex = index;

				}
			}

		}
		System.out.println("Total count of consecutive number is : " + count);
		System.out.println(arr[consIndex] + "," + arr[consIndex + 1] + "," + arr[consIndex + 2]
				+ " is a triplet having max sum is " + consNumSum);

		// return sum;

	}

	public static void main(String[] args) {

		int[] arr = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };
		Assignment_32 assignment_32 = new Assignment_32();
		assignment_32.getTriplet(arr);

		// System.out.println(new Assignment_32_1().getTriplet(arr));
	}
}
