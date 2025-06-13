/*Test - 9 : 21st Nov'2021
find closest negative number with respect to 8 
int[] arr = {-3,11,123,-11,-9,-55,33,44};
output : -3

PR #101 -> time : 15 mins

Branch name - Varun_coding_test_9*/

package parthav;

import java.util.ArrayList;

public class parthavD_coding_test_9 {
	ArrayList<Integer> list = new ArrayList<>();

	int getNumberClosestToZero(int[] arr) {
		getNegativeNumberArray(arr);
		int closestNumber = list.get(0);
		for (int index = 1; index < list.size(); index++) {
			if (closestNumber < list.get(index))
				closestNumber = list.get(index);
		}

		return closestNumber;
	}

	void getNegativeNumberArray(int[] arr) {

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < 0)
				list.add(arr[index]);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 11, -3, 123, -11, -9, -55, 33, 44 };
		System.out.println("The number closest to 0 in the passed array is: ");
		System.out.println(new parthavD_coding_test_9().getNumberClosestToZero(arr));

	}

}