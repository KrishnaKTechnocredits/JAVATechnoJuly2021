/* 
Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family */

package harshada.Assignment_37;

import java.util.Arrays;

public class SecondLargestWord {
	
	void getHighestLengthString(String input) {
		
		String inputArray[]=input.split(" ");
		int strlen=0;
		int indexofmax=0;
		
		for(int i=0; i< inputArray.length ; i++) {
		
			if(inputArray[i].length() > strlen ) {
				strlen=inputArray[i].length();
				indexofmax=i;
			}
		}
		inputArray[indexofmax]=" ";
		//System.out.println(Arrays.toString(inputArray));
		getSecongHighestLengthString(inputArray);
	}
	
	static void getSecongHighestLengthString(String[] inputArray) {
		
		int strlen2=0;
		int indexofsecondmax=0;
		
		for(int i=0; i< inputArray.length ; i++) {
			
			if(inputArray[i].length() > strlen2 ) {
				strlen2=inputArray[i].length();
				indexofsecondmax=i;
			}
		}
		
		System.out.println("Word having SECOND HIGHEST LENGTH is " + inputArray[indexofsecondmax]);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondLargestWord obj=new SecondLargestWord();
		String input="Welcome to the family";
		System.out.println("INPUT string is : "+ input);
		obj.getHighestLengthString(input);
	
	}

}
