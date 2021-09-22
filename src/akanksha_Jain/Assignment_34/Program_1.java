/* Assignment - 34 : 11th Sep'2021
program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];
*/

package akanksha_Jain.Assignment_34;

import java.util.Arrays;

public class Program_1 { 
	
	int getTripleSeqCount(int[] arr) {
		int count=0;
		for(int index=0; index<arr.length-2; index++) {
			if(arr[index+1]==arr[index]+1 && arr[index+2]==arr[index+1]+1) {
				count ++;
			}
		}
		return count;
	}
	
	void addZeroAfterTripleSeq(int[] arr) {
		int[] output = new int[arr.length+getTripleSeqCount(arr)];
		int outputIndex = 2;
		output[0]=arr[0];
		output[1]=arr[1];
		for(int index=2;index<arr.length;index++) {
			output[outputIndex++]=arr[index];
			if(arr[index-1]==arr[index-2]+1 && arr[index]==arr[index-1]+1) 
				output[outputIndex++]=0;
		}
    	System.out.println("After triplets seqeunce, adding zeros in given array " +Arrays.toString(arr) + "\nThe output is " +Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		Program_1 program1 = new Program_1();
		program1.addZeroAfterTripleSeq(arr);
	}		
}