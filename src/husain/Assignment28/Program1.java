/*Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55
*/

package husain.Assignment28;

import java.util.Arrays;

public class Program1 {

	void secondHighest(int arr[]) {

		int maxNum = 0;
		int secondMaxNum = 0;

		if (arr[0] > arr[1]) {
			maxNum = arr[0];
			secondMaxNum = arr[1];
		} else {
			maxNum = arr[1];
			secondMaxNum = arr[0];
		}

		for (int index = 2; index < arr.length; index++) {
			if (arr[index] > maxNum) {
				secondMaxNum = maxNum;
				maxNum = arr[index];
			} else if (arr[index] > secondMaxNum)
				secondMaxNum = arr[index];
		}

		System.out.println(
				"The second highest number in the given array " + Arrays.toString(arr) + " is: " + secondMaxNum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 obj = new Program1();
		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		obj.secondHighest(arr);

	}

}
