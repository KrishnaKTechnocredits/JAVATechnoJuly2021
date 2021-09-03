package bhakti_CodingTest;

import java.util.Arrays;

public class CodingTest_3 {
	
	void deleteElementFromArray(int[] input, int element) {
		int occurace=0;
		int x=0;
		
		for (int index=0; index< input.length; index++) {
			if (input[index]==element)
				occurace++;
		}
		int[] output= new int[input.length-occurace];
		
		for (int index1=0;index1< input.length; index1++) {
			if (input[index1]!=element) {
				output[x]=input[index1];
				x++;
			}
		}
		
		System.out.println("Input array "+ Arrays.toString(input) );
		System.out.println("New array "+ Arrays.toString(output));
		
	}
	
	public static void main(String[] d) {
		int input[] = {25, 14, 56, 15, 36, 14, 77, 18, 29, 49};
		int element= 14;
		CodingTest_3 codingTest_3= new CodingTest_3();
		codingTest_3.deleteElementFromArray(input, element);
	}

}
