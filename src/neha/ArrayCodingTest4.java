package neha;

import java.util.Arrays;

/*Test 4: Shift all digits of an array to last indices of an array
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
int[] ouput : {1,6,2,3,4,5,0,0,0,0,0};*/
public class ArrayCodingTest4 {
	int[] shiftZeroesToRightInArray(int[] input) {
		int aLength = input.length;
		int[] output = new int[aLength];
		int shiftCount = 0;
		int nIndex = 0;
		for (int i = 0; i < aLength; i++) {
			if (input[i] != 0) {
				output[nIndex] = input[i];
				nIndex++;
			} else {
				output[aLength - 1 - shiftCount] = input[i];
				shiftCount++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayCodingTest4 arrayCodingTest4 = new ArrayCodingTest4();
		int[] arr = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };
		System.out.println("Array after shifting zeroes to right is: "
				+ Arrays.toString(arrayCodingTest4.shiftZeroesToRightInArray(arr)));
	}
}
