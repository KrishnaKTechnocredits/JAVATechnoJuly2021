package bhagyashree;

import java.util.Arrays;

public class CodingTest4 {

	void placeZerosEnd(int[] array)

	{
		int[] output = new int[array.length];
		int count = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index]!= 0) {

				output[count] = array[index];
				count++;
			}
		}
		
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] input = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };
		CodingTest4 test4 = new CodingTest4();
		System.out.println("All zeros placed at end: ");
		test4.placeZerosEnd(input);

	}

}
