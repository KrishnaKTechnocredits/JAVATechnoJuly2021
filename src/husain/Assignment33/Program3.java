/*
 program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]

 */

package husain.Assignment33;

import java.util.Arrays;

public class Program3 {
	
	void loopArrays(int arr[]) {
		
		int output[] = new int[arr.length];
		int count = 0;
		int zeroCount =0;
		
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < 0) {
				output[count] = arr[index];
				count++;
			}
			else if(arr[index]==0)
				zeroCount++;
		}

		for (int index = 0; index < output.length; index++) {
			if (arr[index] > 0) {
				output[count+zeroCount] = arr[index];
				count++;
			}
		}

		System.out.println("The output array is " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 obj = new Program3();
		int arr[] = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		System.out.println("The input array is " + Arrays.toString(arr));
		obj.loopArrays(arr);

	}

}
