/*
 * Assignment - 34 : 11th Sep'2021
program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];

		 
program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];
 */
package swati.Assignment34;

import java.util.Arrays;

public class Assignments34 {

	void placeZeroAfterTriple(int[] input) {
		int count=0;
		int number=0;
		int temp=0;
		for(int index=0;index<input.length-2;index++) {
			number=input[index];
			if(number+1==input[index+1]) {
				if(number+2==input[index+2]) {
					count++;
				}
			}
		}
		int total=input.length+count;
		int[] output=new int[total];
		
		for(int index=0;index<input.length;index++) {
			number=input[index];
			output[temp++]=input[index];
			if(index<input.length-2) {
			if(number+1==input[index+1]) {
				if(number+2==input[index+2]) {
					output[temp++]=input[index+1];
					output[temp++]=input[index+2];
					output[temp++]=0;
					index=index+2;
				}
			}
			
		}
		}
		System.out.println("Program1 Output"+Arrays.toString(output));
	}
	
	void placeSumAfterEachTripplet(int[] input) {
		int count=0;
		int number=0;
		int temp=0;
		for(int index=0;index<input.length-2;index++) {
			number=input[index];
			if(number+1==input[index+1]) {
				if(number+2==input[index+2]) {
					count++;
				}
			}
		}
		int total=input.length+count;
		int[] output=new int[total];
		
		for(int index=0;index<input.length;index++) {
			number=input[index];
			output[temp++]=input[index];
			if(index<input.length-2) {
			if(number+1==input[index+1]) {
				if(number+2==input[index+2]) {
					output[temp++]=input[index+1];
					output[temp++]=input[index+2];
					output[temp++]=input[index]+input[index+1]+input[index+2];
					index=index+2;
				}
			}
			
		}
		}
		System.out.println("Program2 Output"+Arrays.toString(output));
	}
	
	public static void main(String[] a) {
		Assignments34 a1=new Assignments34();
		int[] input={1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		a1.placeZeroAfterTriple(input);
		a1.placeSumAfterEachTripplet(input);
	}
}
