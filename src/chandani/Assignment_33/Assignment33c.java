package chandani.Assignment_33;

import java.util.Arrays;

public class Assignment33c {
   
int[] movePositiveNumbersToEnd(int [] input){
		
	    int output[] = new int[input.length];
	    int negativeCount = 0;
	    int zeroCount = 0;

	    for(int index = 0; index < input.length; index++) {
           if(input[index] < 0 && input[index] != 0) {
        	   
	    		output[negativeCount] = input[index];
	    		negativeCount++;
	    		
	    	}else if(input[index] == 0)
	    		
	    		zeroCount++;
           		
	     }
	  
	    int positiveCountBegins = negativeCount + zeroCount;
	    for (int index = 0; index < input.length; index++) {
	    	if(input[index] != 0 && input[index] >= 0 ){
	    	    output[positiveCountBegins] = input[index];
	    	    positiveCountBegins++;
	    	}	
	    }
	    return output;
	}
	
	public static void main(String[] args) {
		Assignment33c assignment33c = new Assignment33c();
		int arr[] = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		System.out.println("After shifting non zeros to end and negtive to the beginning \nin the given array  " + Arrays.toString(arr) + "\nthe output is " + Arrays.toString(assignment33c.movePositiveNumbersToEnd(arr)));
	}
}
