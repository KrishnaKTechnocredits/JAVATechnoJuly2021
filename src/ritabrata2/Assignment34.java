/*Assignment - 34 : 11th Sep'2021

program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];

		 
program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];
		 

program 3 : find first non repeating vowel character from given string.
input : aeapquawrpti
output : u
*/


package ritabrata2;

import java.util.Arrays;

public class Assignment34 {
	int sum=0;
	int getCountOfSets(int[] input) {
		int count=0;
		for(int index=0;index<input.length-2;index++) {
			if(input[index+1]*2==input[index]+input[index+2]) {
				sum= input[index]+input[index+1]+input[index+2];
				count++;
			}
		}
		return count;
	}
	
	void placeZero(int[] input) {
		System.out.println("The input string is: "+Arrays.toString(input));
		int[] output= new int[input.length+ getCountOfSets(input)];
		int index=0;
		for(int i=0;i<input.length;i++) {
			if(i<input.length-2) {
				if(input[i+1]*2==input[i]+input[i+2]) {
					output[index]=input[i];
					index++;
					output[index]=input[i+1];
					index++;
					output[index]=input[i+2];
					index++;
					output[index]=0;
					index++;
					i=i+2;
				}
				else {
					output[index]=input[i];
					index++;
				}
			}
			else
			{
			output[index]=input[i];
			}	
		}
		System.out.println("The output after adding zero after set is: "+Arrays.toString(output));	
	}
	
	void placeSum(int[] input) {
		System.out.println("The input string is: "+Arrays.toString(input));
		int[] output= new int[input.length+ getCountOfSets(input)];
		int index=0;
		for(int i=0;i<input.length;i++) {
			if(i<input.length-2) {
				if(input[i+1]*2==input[i]+input[i+2]) {
					output[index]=input[i];
					index++;
					output[index]=input[i+1];
					index++;
					output[index]=input[i+2];
					index++;
					output[index]=sum;
					index++;
					i=i+2;
					}
				else {
					output[index]=input[i];
					index++;
				}
			}
			else
			{
			output[index]=input[i];
			}	
		}
		System.out.println("The output after adding sum of set is: "+Arrays.toString(output));
	}
	
	void getFirstNonRepeatVowel(String input) {
		char out=' ';
		for(int index=0; index<input.length();index++) {
			char op= input.charAt(index);
			if(op=='a'||op=='e'||op=='i'||op=='o'||op=='u') {
				if(index==input.lastIndexOf(op)) {
					out=op;
					break;
				}
			}
		}
		System.out.println("The first non repeated vowel of the String "+input+" is: "+out);
		
	}
	
	
	public static void main(String[] args) {
		Assignment34 test= new Assignment34();
		int[] arr = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		test.placeZero(arr);
		System.out.println("-------------------------------------------------------------------------------");
		test.placeSum(arr);
		System.out.println("-------------------------------------------------------------------------------");
		test.getFirstNonRepeatVowel("aeapquawrpti");
	}

}
