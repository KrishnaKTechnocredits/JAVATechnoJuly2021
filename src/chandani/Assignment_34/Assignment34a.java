/*Assignment - 34 : 11th Sep'2021
program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];

		 
program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];
		 

program 3 : find first non repeating vowel character from given string.
input : aeapquawrpti
output : u*/
package chandani.Assignment_34;

import java.util.Arrays;

public class Assignment34a {
	
	int count = 0;
	int newindex = 2;
	int num;
	int index = 0;
	
	void getIncreasingTripletsCount(int[] input) {
	
		for(int index = 0; index < input.length - 2; index++) {
			num = input[index]; 
			if(num+1 == input[index+1]) {
				if(num+2 == input[index+2]) {
					count++;
					System.out.println("Triplet numbers in increasing order : " + input[index] + ","
							+ input[index +1] + "," + input[index + 2]);
				}
			}
		}
		System.out.println("\n" + "Count of sequential triplets " + count);

			
		int[] output =new int[input.length + count];
		output[0]=input[0];
		output[1]=input[1];
		for(index=2;index<input.length;index++) {
			output[newindex++]=input[index];
			if(input[index-1]==input[index-2]+1 && input[index]==input[index-1]+1) 
				output[newindex++]=0;
		}
    	System.out.println("\n" + "After adding zeros after sequential triplets from the given array " +Arrays.toString(input) + "\nthe output is " +Arrays.toString(output));

	}
	

	public static void main(String[] args) {
		Assignment34a assignment34a = new Assignment34a();
		int [] arr = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		assignment34a.getIncreasingTripletsCount(arr);

	}
}