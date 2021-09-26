/*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end. 
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]*/

package vivek.Assignment33;

import java.util.Arrays;

public class Assignment33_3 {

	void rearrangeArray(int[] arr) {
		int[] output = new int[arr.length];
		int cnt = 0;
		int cntZeroes = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < 0) {
				output[cnt] = arr[index];
				cnt++;
			}
			if (arr[index] == 0) {
				cntZeroes++;
			}
		}
		cnt = cnt + cntZeroes;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				output[cnt] = arr[index];
				cnt++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment33_3 assignment33_3 = new Assignment33_3();
		int[] arr = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		assignment33_3.rearrangeArray(arr);
	}
}
