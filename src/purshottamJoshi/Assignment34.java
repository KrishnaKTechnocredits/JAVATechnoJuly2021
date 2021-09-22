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

package purshottamJoshi;

import java.util.Arrays;

class Assignment34{

	void placeZeroAfterTriplet(int[] input){
		int count=0;
		for(int index=0; index < input.length-2; index++){
			if((input[index]==input[index+1]-1) && (input[index+1]==input[index+2]-1)){
				count++;
			}
		}
		int[] output = new int[input.length+count];
		int innerIndex=0;
		for(int index=0; index < input.length; index++){
			if((index < input.length -2) && (input[index]==input[index+1]-1) && (input[index+1]==input[index+2]-1))	{
				output[innerIndex] = input[index];
				output[innerIndex+1] = input[index+1];
				output[innerIndex+2]=input[index+2];
				output[innerIndex+3]=0;
				innerIndex+=4;
				index +=2;
				
			}else{
				output[innerIndex]=input[index];
				innerIndex++;
			}
		}
		System.out.println("Place Zeros After Triplet in Sequence : "+Arrays.toString(output));
	}
	
	void placeSumAfterTriplet(int[] input){
		int tripletCount=0;
		for(int index=0; index < input.length-2; index++) {
			if((input[index]==input[index+1]-1) && (input[index+1] ==input[index+2]-1))	
				tripletCount++;
		}
		int[] output = new int[input.length+tripletCount];
		int outputIndex =0;
		for(int index=0; index < input.length; index++){
			if(index < input.length-2 && (input[index]==input[index+1]-1) && (input[index+1] ==input[index+2]-1)){
				output[outputIndex]=input[index];
				output[outputIndex+1]=input[index+1];
				output[outputIndex+2]=input[index+2];
				output[outputIndex+3]=input[index]+input[index+1]+input[index+2];
				outputIndex +=4;
				index +=2;
			}else{
				output[outputIndex]=input[index];
				outputIndex++;
			}
		}
		System.out.println("Place Sum of Triplet After Triplet in Sequence : "+Arrays.toString(output));
			
	}
	char findFirstNonRepeatingCharacter(String word) {
		char nonRepeatVowelChar = ' ';
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') && word.indexOf(ch) == word.lastIndexOf(ch)) {
				nonRepeatVowelChar = ch;
				break;
			}
		}
		return nonRepeatVowelChar;
	}
	
	public static void main(String[] args){
		int[] arr= {11,12,13,5,9,40,46,4,5,6,1};
		Assignment34 assignment34 = new Assignment34();
		assignment34.placeZeroAfterTriplet(arr);
		assignment34.placeSumAfterTriplet(arr);
		System.out.println("First Non Repeating Char : "+assignment34.findFirstNonRepeatingCharacter("purushottam"));
		
	}
}