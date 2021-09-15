package precilla.assignment34;

import java.util.Arrays;

public class Program1 {
	public static void main(String[] args) {
		Program1 program=new Program1();
		int[] arr={1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		System.out.println("program 1 : place 0 after the triple which in sequence.");
		System.out.print("Input :"+Arrays.toString(arr));
		program.getTripleInSequence(arr);
		System.out.println("\nprogram 2 : place sum of triple after each triple which in sequence.");
		System.out.print("Input :"+Arrays.toString(arr));
		program.getTripleInSequenceSum(arr);
		System.out.println("\nFind first non repeating vowel character from given string");
		String input="aeapquawrpti";
		System.out.println("Input : "+input);
		program.getNonRepeatingVowel(input);
		
	}
	private void getNonRepeatingVowel(String word) {
		for(int index=0;index<word.length();index++){
			int count = 0;
			word=word.toLowerCase();
			for(int innerIndex=0;innerIndex<word.length();innerIndex++){
				if(word.charAt(index) == word.charAt(innerIndex)){
					if(word.charAt(innerIndex)=='a'||word.charAt(innerIndex)=='e'||word.charAt(innerIndex)=='i'||word.charAt(innerIndex)=='o'||word.charAt(innerIndex)=='u'){
						count++;
						if(count >1)
						break;
					}
				}
			}
			if(count == 1){
				System.out.println("Output: " + word.charAt(index));
			break;
			}
		
		}
	}
	
	private void getTripleInSequence(int[] arr3) {
		int count=0;
		for(int index=0;index<=arr3.length-3;index++) {
				if(arr3[index]+1==arr3[index+1]&&arr3[index]+2==arr3[index+2]) {
					count++;
				}
		}	
		int[] outCount=new int[arr3.length+count];
		int index=0;
			for(int index1=0;index1<arr3.length;index1++) {
				if(index1<=arr3.length-3) {
					if(arr3[index1]+1==arr3[index1+1]&&arr3[index1]+2==arr3[index1+2]) {
						outCount[index]=arr3[index1];
						index++;
						outCount[index]=arr3[index1+1];
						index++;
						outCount[index]=arr3[index1+2];
						index++;
						outCount[index]=0;
						index++;
						index1=index1+2;
					}
					else {
						outCount[index]=arr3[index1];
						index++;
					}	
				}
				else {
					outCount[index]=arr3[index1];
				}
			}
			
		System.out.println("\nOutput: "+Arrays.toString(outCount));
		}
	private void getTripleInSequenceSum(int[] arr3) {
		int count=0;
		for(int index=0;index<=arr3.length-3;index++) {
				if(arr3[index]+1==arr3[index+1]&&arr3[index]+2==arr3[index+2]) {
					count++;
				}
		}	
		int[] outCount=new int[arr3.length+count];
		int index=0;
		int sum=0;
			for(int index1=0;index1<arr3.length;index1++) {
				if(index1<=arr3.length-3) {
					if(arr3[index1]+1==arr3[index1+1]&&arr3[index1]+2==arr3[index1+2]) {
						outCount[index]=arr3[index1];
						index++;
						outCount[index]=arr3[index1+1];
						index++;
						outCount[index]=arr3[index1+2];
						index++;
						sum=arr3[index1]+arr3[index1+1]+arr3[index1+2];
						outCount[index]=sum;
						index++;
						index1=index1+2;
					}
					else {
						outCount[index]=arr3[index1];
						index++;
					}	
				}
				else {
					outCount[index]=arr3[index1];
				}
			}
			
		System.out.println("\nOutput :"+Arrays.toString(outCount));
		}
}
