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
package elizabeth;
import java.util.Arrays;

class Assignment34{
	
	int tripletCount(int[] input){
		int count=0;
		for(int index=0;index<input.length-2;index++){
			if(input[index]==input[index+1]-1 && input[index]==input[index+2]-2){
				count++;
			}
		}
		return count;
	}
	
	int[] placeZeroAfterTriplet(int[] input){
		int temp=2;
		int[] output= new int[input.length+tripletCount(input)];
		output[0]=input[0];
		output[1]=input[1];
		for(int index=2;index<input.length;index++){
			output[temp++]=input[index];
			if(input[index-1]==input[index-2]+1 && input[index]==input[index-1]+1){
				output[temp++]=0;
			}
		}
		
		return output;
	}
	
	int[] placeSumAfterTriplet(int[] input){
		int temp=2;
		int[] output= new int[input.length+tripletCount(input)];
		output[0]=input[0];
		output[1]=input[1];
		for(int index=2;index<input.length;index++){
			output[temp++]=input[index];
			if(input[index-1]==input[index-2]+1 && input[index]==input[index-1]+1){
				output[temp++]=input[index]+input[index-1]+input[index-2];
			}
		}
		
		return output;
	}
	
	void getFirstNonRepeatingVowel(String input){
		char ch=' ';
		boolean flag=false;
		for(int index=0;index<input.length();index++){
			ch=input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch)){
				if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
					flag=true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("First non-repeating vowel is " +ch);
		}
	}
	
	public static void main(String[] args){
		
		Assignment34 assignment34=new Assignment34();
		int[] input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		System.out.println(Arrays.toString(assignment34.placeZeroAfterTriplet(input)));
		System.out.println(Arrays.toString(assignment34.placeSumAfterTriplet(input)));
		assignment34.getFirstNonRepeatingVowel("aeapquawrpti");
	}
}