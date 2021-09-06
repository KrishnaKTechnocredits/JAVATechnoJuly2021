package chandani.chandani_codingtest_3;

import java.util.Arrays;

public class CodingTest3{

	int[] getArrayAfterRemovingANumber(int[] input, int num){
		int output[] = new int[input.length-1];
		int count = 0;
		for(int index = 0 ; index < input.length; index++) {
				if(input[index]!= num) {
					output[count] = input[(index)];
					count++;
				}
		}
		return output;
	}	
		

	public static void main(String[] args){
		CodingTest3 codingTest3 = new CodingTest3();	
		int[] arr = {25,14,56,15,36,56,77,18,29,49};
		int num = 14;
		System.out.println("After removing " + num + " from the given array  "
		+ Arrays.toString(arr) + " the output is : "  + Arrays.toString(codingTest3.getArrayAfterRemovingANumber(arr, num)));

	}	
}