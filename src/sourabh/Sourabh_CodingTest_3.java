package sourabh;

import java.util.Arrays;

public class Sourabh_CodingTest_3 {
	
	public static void main(String[] args){
		int input[] = {25,14,56,15,36,56,77,18,29,49}; 
		System.out.println("Before Removing Element = " + Arrays.toString(input));
		
		int removeIndex = 1;
		for(int index = removeIndex; index < input.length - 1; index++){
			input[index] = input[index+1];
		}
		
		System.out.println("After Removing Element = " + Arrays.toString(input));
	}

}
