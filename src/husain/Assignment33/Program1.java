/*
 Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]
 */

package husain.Assignment33;

import java.util.Arrays;

public class Program1 {

	void loopArray(int arr[]) {
		int count = 0;
		int output[] = new int[arr.length];

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0)
				count++;
		}

		for (int index = 0; index < output.length; index++) {
			if (arr[index] != 0) {
				output[count] = arr[index];
				count++;
			}
		}

		System.out.println("The output array is " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program1 obj = new Program1();
		int arr[] = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		System.out.println("The input array is " + Arrays.toString(arr));
		obj.loopArray(arr);

	}

}
