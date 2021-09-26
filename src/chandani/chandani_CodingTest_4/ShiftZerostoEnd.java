/* Test 4 : 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0}; */

package chandani.chandani_CodingTest_4;

import java.util.Arrays;


public class ShiftZerostoEnd {
	
	int[] getArrayAfterShiftingZerosToEnd(int[] input){
		
	    int count = 0;
	    int output[] = new int[input.length];
			for(int index = 0 ; index < input.length ; index++) {
				if (input[index] != 0) {
		            output[count] = input[index];
					count++;
				}					
			}
				return output;
	       }	
				
		
		public static void main(String[] args){
			ShiftZerostoEnd codingTest4 = new ShiftZerostoEnd();	
			int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
			System.out.println("After shifting all zeros to end from the given array \n"
			+ Arrays.toString(arr) + " the output is : \n"  
			+ Arrays.toString(codingTest4.getArrayAfterShiftingZerosToEnd(arr)));
			
			}	
}
