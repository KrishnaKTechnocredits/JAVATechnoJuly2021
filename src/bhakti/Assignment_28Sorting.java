/*Assignment - 28 : 4th Sep'2021 

Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43*/

package bhakti;

import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;

public class Assignment_28Sorting {
	
	 
	
	//2 make array sorted 
	void getarrySorted(int[] input, int num) {
		
		int[] inputSRT=new int[input.length];
		for (int index=0; index<input.length; index++) {
			inputSRT[index]=input[index];
		}
		
		int [] output= new int[inputSRT.length];
		int max=inputSRT[0];
		
		
		for (int x=0; x< output.length; x++) {
		
			for (int index=0; index< input.length; index++) {
				if (inputSRT[index]>max) {
					max=inputSRT[index];
				}
			}
			output[x]=max;	
			for (int index=0; index< inputSRT.length; index++) {
				if (inputSRT[index]==max) 
					inputSRT[index]=0;
			}
			max=0;
		    
		}
		System.out.println(Arrays.toString(output));
		
		System.out.println("Max " +num+ " is "+output[num-1]);
		
	}
	
	
	 

	public static void main(String[] jh) {
		Assignment_28Sorting assignment_28= new Assignment_28Sorting();
		int[] arry = {10,55,43,99};
		assignment_28.getarrySorted(arry, 2);
		assignment_28.getarrySorted(arry, 1);
		assignment_28.getarrySorted(arry, 3);
	}
	
}
