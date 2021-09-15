package nasir_ScodingTest_3;

import java.util.Arrays;

public class RemoveSpecificArray {
	void replaceArray(int[] input) {
		System.out.println("Before Removing Element = " + Arrays.toString(input));
	int removeIndex = 1;
	for(int index = removeIndex; index < input.length - 1; index++){
		input[index] = input[index+1];
	}
	}

	

	public static void main(String[] args) {
		RemoveSpecificArray removeSpecificArray= new RemoveSpecificArray();
		int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		removeSpecificArray.replaceArray(input);
		System.out.println("After Removing Element = " + Arrays.toString(input));

	}

}
