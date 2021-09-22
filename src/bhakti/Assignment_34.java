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

package bhakti;

import java.util.Arrays;

public class Assignment_34 {
	void placeZeroAfterTriples(int[] input) {
		//
		//input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		int countTriples=0;
		int newindex=2;
		for (int i=0; i < input.length-2; i++) {
			if (input[i]+1 == input[i+1] && input[i+1]+1== input[i+2]) {
				countTriples++;
			}	
		}
		int[] output= new int[input.length +countTriples];
		output[0]=input[0];
		output[1]=input[1];
		for(int index=2;index<input.length;index++) {
			output[newindex++]=input[index];
			if(input[index-1]==input[index-2]+1 && input[index]==input[index-1]+1) 
				output[newindex++]=0;
		}
		System.out.println(Arrays.toString(output));
	}
	
	//program 2 : place sum of triple after each triple which in sequence.
	
	void placeSumOafterTriples(int[] input) {
		int countTriples=0;
		int newindex=2;
		for (int i=0; i < input.length-2; i++) {
			if (input[i]+1 == input[i+1] && input[i+1]+1== input[i+2]) {
				countTriples++;
			}	
		}
		int[] output= new int[input.length +countTriples];
		output[0]=input[0];
		output[1]=input[1];
		for(int index=2; index< input.length; index++) {
			output[newindex++]=input[index];
			if(input[index-1]==input[index-2]+1 &&input[index]==input[index-1]+1) 
				output[newindex++]=input[index-1]+input[index-2]+ input[index];
		}
		System.out.println(Arrays.toString(output));
	}
	
	//program 3 : find first non repeating vowel character from given string.
	
	void nonpepeatingVowel(String str) {
		for (int i=0; i< str.length(); i++) {
			char ch= str.charAt(i);
			if (ch=='a' || ch=='e' || ch== 'i' || ch== 'o' || ch== 'u') {
				if(str.indexOf(ch)==str.lastIndexOf(ch)) {
					System.out.println(ch);
					break;
				}		
			}	
		}
	}
	public static void main(String[] ss) {
		int[] input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		String str="aeapqeuawrpti";
		Assignment_34 assignment_34 = new Assignment_34();
		assignment_34.placeZeroAfterTriples(input);
		assignment_34.placeSumOafterTriples(input);
		assignment_34.nonpepeatingVowel(str);
	}

}
