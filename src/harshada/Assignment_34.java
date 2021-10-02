/* Assignment - 34 : 11th Sep'2021
	program 1 : place 0 after the triple which in sequence.

	input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
	output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];

			 
	program 2 : place sum of triple after each triple which in sequence.

	input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
	output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];
	
	program 3 : find first non repeating vowel character from given string.

*/

package harshada;

import java.util.Arrays;

public class Assignment_34 {

	void p1_placeZeroAfterTriplet(int input[]) {

		// find the number of triplets
		int tCount = 0;
		for (int i = 0; i < input.length - 2; i++) {
			int num1 = input[i];
			int num2 = input[i + 1];
			int num3 = input[i + 2];

			if (num2 == num1 + 1 && num3 == num2 + 1) {
				tCount++;
			}
		}

		System.out.println("Triplets are : " + tCount);

		// calcualte the size of new array as input.lenth + tcount
		int size = input.length;
		int output[] = new int[(size + tCount)];
		int tempIndex = 2; // to keep the track
		output[0] = input[0];
		output[1] = input[1];

		for (int index = 2; index < input.length; index++) { // start from 2 because 0 and 1 element is already stored
																// manually

			output[tempIndex++] = input[index]; // store input[2] at output[2] and then increment index

			if (input[index - 1] == input[index - 2] + 1 && input[index] == input[index - 1] + 1)
				// if input of 1 is = input of 0+1 && input of 2 is = input of 1+1
				output[tempIndex++] = 0; // then place 0 at next location
		}
		System.out.println("Array after placing ZERO if triplet "+ Arrays.toString(output)+ "\n");
	}

	void p2_placeSumAfterTriplet(int input[]) {

		int tripletCount = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index + 1] == input[index] + 1 && input[index + 2] == input[index + 1]+1) {
				tripletCount++;
			}
			
		}
		System.out.println("Triplets are : " + tripletCount);
		
		int size = input.length + tripletCount;
		int output[] = new int[size];
		int tempIndex = 2;
		output[0] = input[0];
		output[1] = input[1];
		
		output[0]=input[0];
		output[1]=input[1];
		for(int index=2; index< input.length; index++) {
			output[tempIndex++]=input[index];
			if(input[index-1]==input[index-2]+1 &&input[index]==input[index-1]+1) 
				output[tempIndex++]=input[index-1]+input[index-2]+ input[index];
		}
		System.out.println("Array after placing SUM if triplet " + Arrays.toString(output)+"\n");
	}

	void p3_nonpepeatingVowel(String str) {
		for (int i=0; i< str.length(); i++) {
			char ch= str.charAt(i);
			if (ch=='a' || ch=='e' || ch== 'i' || ch== 'o' || ch== 'u') {
				if(str.indexOf(ch)==str.lastIndexOf(ch)) {
					System.out.println("First Non Repeating Character is =" + ch);
					break;
				}		
			}	
		}
	}
	
	public static void main(String a[]) {
		Assignment_34 obj = new Assignment_34();
		int input[] = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 }; // 11 + 3 = 14
		System.out.println("Output of Progarm 1 ");
		System.out.println("Array Elements are : " + Arrays.toString(input));
		obj.p1_placeZeroAfterTriplet(input);
		int input1[] = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		//output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];
		System.out.println("Output of Progarm 2 ");
		System.out.println("Array Elements are : " + Arrays.toString(input1));
		obj.p2_placeSumAfterTriplet(input1);
		System.out.println("Output of Progarm 3 ");
		obj.p3_nonpepeatingVowel("harsohada");
	}
}