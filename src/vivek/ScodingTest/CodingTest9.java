/*Test - 9 : 21st Nov'2021
find closest negative number with respect to 0
int[] arr = {-3,11,123,-11,-9,-55,33,44};
output : -3

PR #101 -> time : 15 mins

Branch name - Varun_coding_test_9
*/

package vivek.ScodingTest;

import java.util.Arrays;

public class CodingTest9 {

	public void getClosestNegativeNoToZero(int[] arr) {
		int[] arr2 = new int[4];
		int cnt = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < 0) {
				arr2[cnt] = arr[index];
				cnt++;
			}
		}
		int maxNo = arr2[0];
		for (int index = 0; index < arr2.length; index++) {
			if (arr2[index] > maxNo) {
				maxNo = arr2[index];
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
