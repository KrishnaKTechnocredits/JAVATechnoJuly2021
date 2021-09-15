/*Test 4 : Shift all Zero's at the end of the array. 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};*/

package vivek.ScodingTest;

import java.util.Arrays;

public class CodingTest4 {

	int[] shiftZeroesAtEnd(int[] arr) {
		int[] output = new int[arr.length];
		int cnt = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				output[cnt] = arr[index];
				cnt++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		CodingTest4 codingTest4 = new CodingTest4();
		int[] arr = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };
		System.out.println(Arrays.toString(codingTest4.shiftZeroesAtEnd(arr)));
	}
}
