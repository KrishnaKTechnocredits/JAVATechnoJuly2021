//Freq of repeated characters by user in a user defined string
package suchita;

import java.util.Scanner;

class Assignment20_4 {

	int getCharCount(String input,char ch) {
		int count = 0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index) == ch)
			count++;
		}
		System.out.println("In input " +"'" +input +"'"+ " the freq of " + ch + ": " + count );
		return count;
		
	}
	
	void printFreqOfEachChar(String input) {
		for(int index=0;index<input.length();index++) {
			if(index==input.indexOf(input.charAt(index))) {
			if(input.indexOf(input.charAt(index)) < input.lastIndexOf(input.charAt(index)))
			getCharCount(input,input.charAt(index));
		}
		}
	}
	
	public static void main(String[] args) {
		
		Assignment20_4 assignment = new Assignment20_4();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :: ");
		String str = scanner.nextLine();
		assignment.printFreqOfEachChar(str);
	}	
}