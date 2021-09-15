package neha;

import java.util.Arrays;

/*WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}*/
public class ArrayCodingTest3 {
	int[] removeSpecificArrElement(int[] inpArr, int num) {
		int arrLength = inpArr.length;
		int[] outArr = new int[arrLength - 1];
		int nIndex = 0;
		for (int index = 0; index < arrLength; index++) {
			if (inpArr[index] != num) {
				outArr[nIndex] = inpArr[index];
				nIndex++;
			}
		}
		return outArr;
	}

	public static void main(String[] args) {
		ArrayCodingTest3 arrayCodingTest3 = new ArrayCodingTest3();
		int input[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int elementToRemove = 14;
		System.out.println("Output array after removing element " + elementToRemove + "-->"
				+ Arrays.toString(arrayCodingTest3.removeSpecificArrElement(input, elementToRemove)));
	}
}
