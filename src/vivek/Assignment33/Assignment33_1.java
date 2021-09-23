/*Program 1 : shift all non zeros at the end. 
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]*/

package vivek.Assignment33;

import java.util.Arrays;

public class Assignment33_1 {

	void shiftNonZeroesAtEnd(int[] arr) {
		int[] output = new int[arr.length];
		int cnt = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0)
				cnt++;
		}
		for (int index2 = 0; index2 < arr.length; index2++) {
			if (arr[index2] != 0) {
				output[cnt] = arr[index2];
				cnt++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment33_1 assignment33_1 = new Assignment33_1();
		int[] arr = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		assignment33_1.shiftNonZeroesAtEnd(arr);
	}
}
