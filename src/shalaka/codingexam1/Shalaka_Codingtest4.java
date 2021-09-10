/*test 4 : 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};


Test 5 :
Find first 5 perfect numbers.
*/
package shalaka.codingexam1;

import java.util.Arrays;

public class Shalaka_Codingtest4 {
	int[] printZerosAtEnd(int arr[]) {
		int count = 0;
		int output[] = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				output[count] = arr[index];
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array after shifting zeros at the end: ");
		int[] arr = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };
		Shalaka_Codingtest4 shalaka_Codingtest4 = new Shalaka_Codingtest4();
		int[] output = shalaka_Codingtest4.printZerosAtEnd(arr);
		System.out.println(Arrays.toString(output));
	}

}
