/*program 2 : place sum of triple after each triple which in sequence.
input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];*/

package vivek.Assignment34;

import java.util.Arrays;

public class Assignment34_2 {

	void sumAfterEachTriplet(int[] arr) {
		int tripletsCnt = 0;
		int cnt = 0;
		for (int index = 0; index < arr.length - 2; index++) {
			if (arr[index] + 1 == arr[index + 1] && arr[index] + 2 == arr[index + 2])
				tripletsCnt++;
		}
		int[] output = new int[arr.length + tripletsCnt];
		for (int index = 0; index < arr.length; index++) {
			if (index < arr.length - 2) {
				if (arr[index] + 1 == arr[index + 1] && arr[index] + 2 == arr[index + 2]) {
					output[cnt++] = arr[index];
					output[cnt++] = arr[index + 1];
					output[cnt++] = arr[index + 2];
					output[cnt++] = arr[index] + arr[index + 1] + arr[index + 2];
					index = index + 2;
				} else {
					output[cnt] = arr[index];
					cnt++;
				}
			} else {
				output[cnt] = arr[index];
				cnt++;
			}
		}
		System.out.println("Output array is " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment34_2 assignment34_2 = new Assignment34_2();
		int[] arr = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		assignment34_2.sumAfterEachTriplet(arr);
	}
}
