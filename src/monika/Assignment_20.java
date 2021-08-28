/*---------------------------------------------------------------------------
 Program 1: find frequency of given character from user defined string.
use scanner class to take word and character from user.
input : word -> technocredits
        ch -> e
output : e -> 2

Note : We dont have any method to take character from String. 
Solution : char ch = scanner.next().charAt(0); will help to capture character given by user.		
Explanation : scanner.next() returns String and on that string we are asking for first character using charAt(0) method.

program 2: Find frequency of each character from user defined string.
input : word -> hello
output : h -> 1
         e -> 1
         l -> 2
         o -> 1

program 3: print unique characters from user defined string.
input : word -> aakanksha
output : n
         s
         h

program 4 : print duplicate characters with their frequency from user defined string.
input : word -> aakanksha
output : a -> 4
         k -> 2
		 n -> 1
		 s -> 1
		 h -> 1
--------------------------------------------------------------------------------*/

package monika;

import java.util.Scanner;

public class Assignment_20 {
	
	void getFreqOfGivenCharFromString(String input ,char ch) {
	
		int count=0;
		for(int index=0; index<input.length();index++) {
			if(input.charAt(index)==ch) 
				count++;
		}
		System.out.println("The count of Character'"+ch+"'in given string "+input+" is: "+count);
		
	}
	void getFreqOfEachCharcterFromString(String input) {
		for(int index=0;index<input.length();index++) {
			if(index==input.indexOf(input.charAt(index)))
				getFreqOfGivenCharFromString(input,input.charAt(index));
		}
	}
	void getFreqOfUniqueCharacterFromString(String input) {
		for(int index=0;index<input.length();index++) {
			if(input.indexOf(input.charAt(index))==input.lastIndexOf(input.charAt(index)))
				getFreqOfGivenCharFromString(input,input.charAt(index));
		}
	}
	
	void getFreqOfDuplicateCharacterFromString(String input) {
		for(int index=0;index<input.length();index++) {
			if(input.lastIndexOf(input.charAt(index)) > input.indexOf(input.charAt(index)))
				if(index==input.indexOf(input.charAt(index)))
					getFreqOfGivenCharFromString(input, input.charAt(index));
		}
	}
	public static void main(String[] args) {
		Assignment_20 assignment_20
		=new Assignment_20();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String:");
		String input=scanner.nextLine();
		System.out.println("Enter a Character:");
		char ch=scanner.nextLine().charAt(0);
		assignment_20.getFreqOfGivenCharFromString(input,ch);
		System.out.println("Enter String:");
		assignment_20.getFreqOfEachCharcterFromString(scanner.nextLine());
		System.out.println("Enter String:");
		assignment_20.getFreqOfUniqueCharacterFromString(scanner.nextLine());
		System.out.println("Enter String:");
		assignment_20.getFreqOfDuplicateCharacterFromString(scanner.nextLine());
		
		
		scanner.close();
		
		
	}

}
