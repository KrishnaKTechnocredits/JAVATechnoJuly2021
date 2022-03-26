package monali.codingTest_9;

public class ClosestNegativeNumber {
	/*
	 * Test - 9 : 21st Nov'2021 find closest negative number with respect to 8 int[]
	 * arr = {-3,11,123,-11,-9,-55,33,44}; output : -3
	 */

	private int getClosestNegativeNumber(int arr[]) {
		int temp = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (arr[index] < 0 && temp < arr[index]) {
				temp = arr[index];
			}
		}
		return temp;
	}

	public static void main(String[] args) {

		int[] arr = { -3, 11, 123, -11, -9, -55, 33, -8 };
		ClosestNegativeNumber closeNegativeNo = new ClosestNegativeNumber();
		System.out.println(closeNegativeNo.getClosestNegativeNumber(arr));
	}

}
