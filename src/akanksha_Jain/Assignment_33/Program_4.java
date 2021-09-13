/* program 4 : find the triple which in sequence and having maximum sum

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12 */

package akanksha_Jain.Assignment_33;

import java.util.Arrays;

public class Program_4 {

	String findMaxSumTripleSeq(int[] arr) {
		int maxSum=0;
		int[] output = new int[3];
		for(int index=0; index<arr.length-2; index++) {
			int sum=0;
			if(arr[index+1]==arr[index]+1 && arr[index+2]==arr[index+1]+1) {
				sum = sum + arr[index] + arr[index+1] + arr[index+2];
				if(sum > maxSum) {
					maxSum = sum;
					output[0]= arr[index];
					output[1]= arr[index+1];
					output[2]= arr[index+2];
				}
			}
		}
		return Arrays.toString(output);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		Program_4 program4 = new Program_4();
		System.out.println("The triple sequence having max sum= " + program4.findMaxSumTripleSeq(arr));
	}		
}
