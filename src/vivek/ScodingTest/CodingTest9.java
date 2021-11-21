/*Test - 9 : 21st Nov'2021
find closest negative number with respect to 0
int[] arr = {-3,11,123,-11,-9,-55,33,44};
output : -3

PR #101 -> time : 15 mins

Branch name - Varun_coding_test_9
*/

package vivek.ScodingTest;

public class CodingTest9 {

	public void getClosestNegativeNoToZero(int[] arr) {

		int maxNo = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxNo && arr[index] < 0) {
				maxNo = arr[index];
			}
		}
		System.out.println(maxNo);
	}

	public static void main(String[] args) {
		CodingTest9 codingtest9 = new CodingTest9();
		int[] arr = { -3, 11, 123, -11, -9, -55, 33, 44 };
		codingtest9.getClosestNegativeNoToZero(arr);
	}
}
