/*Program 2: place all negative numbers at the beginning and all positive numbers at the end. 
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]*/

package vivek.Assignment33;

import java.util.Arrays;

public class Assignment33_2 {
	
	void positiveNoAtEnd(int[] arr) {
		int[] output = new int[arr.length];
		int cnt = 0;
		for (int index=0; index < arr.length; index++) {
			if (arr[index]<0) {
				output[cnt] = arr[index];
				cnt++;
			}
		}
		for (int index=0; index < arr.length; index++) {
			if (arr[index]>0) {
				output[cnt] = arr[index];
				cnt++;
			}
		}
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		Assignment33_2 assignment33_2 = new Assignment33_2();
		int[] arr = {1,-3,-2,11,44,55,-76,33,12};
		assignment33_2.positiveNoAtEnd(arr);
	}
}
