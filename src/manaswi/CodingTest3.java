package manaswi;
import java.util.Arrays;

public class CodingTest3
 {

	void getRemoveSpecificElementFromArray(int[] input, int element) 
	{
		int[] output = new int[input.length-1];
		int outputIndex = 0;
		for (int index = 0; index < input.length; index++)
			{
			if (input[index] != element)
				{
				output[outputIndex] = input[index];
				outputIndex++;
			}

		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args)
	{
		int input[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		CodingTest3 codingTest3 = new CodingTest3();
		codingTest3.getRemoveSpecificElementFromArray(input, 14);

	}
}