/*Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum */
package chandani.Assignment_32;

import java.util.Arrays;

public class Assignment32 {

	void getIncreasingTriplets(int[] input) {
		
		int count = 0;
		int num;
		int sum;
		int maxSum = 0;
		int maxIndex = 0;
		for(int index = 0; index < input.length - 2; index++) {
			num = input[index]; 
			if(num+1 == input[index+1]) {
				if(num+2 == input[index+2]) {
					count++;
					System.out.println("Triplet numbers in increasing order : " + input[index] + ","
							+ input[index +1] + "," + input[index + 2]);
					sum = input[index] + input[index+1] + input[index+2];
					
					System.out.println("Sum of triplets is : " + sum);
					
					if(sum > maxSum) {
						maxSum = sum;
						maxIndex = index;
					}
				}
			}
		}
		System.out.println("\n" + "Count of sequential triplets " + count);
		System.out.println( "\n" + "Triplet "+ input[maxIndex]+", "
				+ ""+ input[maxIndex+1]+", "+ input[maxIndex+2] + 
				" of consecutive numbers in the given array \n" 
				+ Arrays.toString(input) + " has max sum " + maxSum);
	}
	
	
	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		int [] arr = {10,64,65,66,23,24,25,26,61,62};
		assignment32.getIncreasingTriplets(arr);
		
	}
}
