package chandani_codingtest_3;

import java.util.Arrays;

public class CodingTest3{

		int[] getArrayAfterRemovingANumber(int[] input){
			int output[] = new int[input.length-1];
			output[0] = input[0];
			
			for(int index = 1 ; index < input.length-1; index++){
				output[index] = input[(index+1)];
			}
			return output;
		}	
			
	
		public static void main(String[] args){
			CodingTest3 codingTest3 = new CodingTest3();	
			int[] arr = {25,14,56,15,36,56,77,18,29,49};
			System.out.println("After removing " + arr[1] + " from the given array  "
			+ Arrays.toString(arr) + " the output is : "  + Arrays.toString(codingTest3.getArrayAfterRemovingANumber(arr)));

		}	
}