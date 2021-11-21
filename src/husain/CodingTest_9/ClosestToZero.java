/*
 * Test - 9 : 21st Nov'2021
find closest negative number with respect to 8 
int[] arr = {-3,11,123,-11,-9,-55,33,44};
output : -3

PR #101 -> time : 15 mins

Branch name - Varun_coding_test_9
 */
package husain.CodingTest_9;

public class ClosestToZero {

	public Integer findClosestToZero(int arr[]) {

		int closestNum = 0;
		int difference = 0 - arr[0];

		for (int index = 1; index < arr.length; index++) {

			if (arr[index] < 0) {
				// difference = 0 - arr[index];
				if (difference >= 0 - arr[index])
					difference = 0 - arr[index];
				closestNum = -difference;
			}

		}

		return closestNum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -5,-3, 11, 123, -11, -9, -55, 33,-1, 44 };
		ClosestToZero obj = new ClosestToZero();
		System.out.println("The closest number to 0 is :"+obj.findClosestToZero(arr));

	}

}
