/*program 1 : place 0 after the triple which in sequence. 
input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];*/

package vivek.Assignment34;

import java.util.Arrays;

public class Assignment34_1 {

	void placeZeroAfterTriplets(int[] arr) {
		int tripletsCnt = 0, cnt = 0;
		for (int index = 0; index < arr.length - 2; index++) {
			if (arr[index] + 1 == arr[index + 1] && arr[index] + 2 == arr[index + 2]) {
				tripletsCnt++;
			}
		}
		int[] output = new int[arr.length + tripletsCnt];
		for (int index = 0; index < arr.length; index++) {
			if (index < arr.length - 2) {
				if (arr[index] + 1 == arr[index + 1] && arr[index] + 2 == arr[index + 2]) {
					output[cnt++] = arr[index];
					output[cnt++] = arr[index + 1];
					output[cnt++] = arr[index + 2];
					cnt++;
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
		Assignment34_1 assignment34_1 = new Assignment34_1();
		int[] arr = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		assignment34_1.placeZeroAfterTriplets(arr);
	}
}
