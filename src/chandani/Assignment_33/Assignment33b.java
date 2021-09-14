package chandani.Assignment_33;

import java.util.Arrays;

public class Assignment33b {
	
	int[] movePositiveNumbersToEnd(int [] input){
		
	    int output[] = new int[input.length];
	    int count = 0;

	    for(int index = 0; index < input.length; index++) {
	    	if(input[index] < 0 && input[index] != 0) {
	    		output[index] = input[index];
	    	    count++;
	    	}
	     }
	    int innerCount = 0;
	    
	    for (int index = 0; index < input.length; index++) {
	    	if(input[index] != 0 && input[index] >= 0 ){
	    	    output[count] = input[index];
	    	    count++;
	    	}else {
	    		output[innerCount] = input[index];
	    		innerCount++;
	    	}
	    		
	    }
	    return output;
	}
	
	public static void main(String[] args) {
		Assignment33b assignment33b = new Assignment33b();
		int arr[] = {1,-3,-2,11,44,55,-76,33,12};
		System.out.println("After shifting positive numbers to the end and \nnegative numbers in the beginning in the given array " + Arrays.toString(arr) + "\nthe output is " + Arrays.toString(assignment33b.movePositiveNumbersToEnd(arr)));
	}
}