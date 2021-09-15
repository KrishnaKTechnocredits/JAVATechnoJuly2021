package siddharth;
import java.util.*;
public class CodingTest3 {

	void removeGivenElement(int[] array, int element) {
		int output = 0;
		int[] outputarr = new int[array.length - 1];
		for (int index = 0; index < array.length; index++) {

			if (array[index] != element) {
				outputarr[output] = array[index];
				output++;
			}
		}
		System.out.println("Array after removing specific element: " + Arrays.toString(outputarr));

	}

	public static void main(String[] args) {
		CodingTest3 test3 = new CodingTest3();
		int[] input = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		test3.removeGivenElement(input, 14);

	}

}
