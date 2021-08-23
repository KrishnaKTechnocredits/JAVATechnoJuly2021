/*Assignment-20 : 21st Aug'2021

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

*/


package bhakti;

import java.util.Scanner;

public class Assignment_20_String {
//Program 1: find frequency of given character from user defined string.	
	int getNumberOfcharInString(String srt, char ch) {
		int chCount=0;
		
		for (int index=0; index< srt.length(); index++) {
			if (srt.charAt(index)==ch)
				chCount++;
		}
		return chCount;
	}

//program 2: Find frequency of each character from user defined string.
	
	void getEachChFrequency(String arr) {
		System.out.println("Frequency of each character: ");
		arr =arr.toLowerCase();
		for (int index=0; index< arr.length() ; index++) {
			
			if (arr.indexOf(arr.charAt(index)) == index) 
			System.out.println(arr.charAt(index)+ "-->" +getNumberOfcharInString(arr, arr.charAt(index))); 
			
		}
		System.out.println("------------------");
		
	}
//	program 3: print unique characters from user defined string.
	
	void getUniqueChar(String input) {
		System.out.println("Below are unique characters ");
		boolean flag=true;
		for (int index=0;index< input.length(); index++) {
			 
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index))) {
				System.out.println(input.charAt(index));
				flag=false;
			}
		}
		if (flag == true)
			System.out.println("No unique character  ");
		System.out.println("-----------------------");
			
	}
//program 4 : print duplicate characters with their frequency from user defined string.
	void printDuplicateCharWithFrequency(String input) {
		boolean flag= true;
		System.out.println("Duplicate Characters and their fresquency: ");
		for (int index=0; index< input.length(); index++) {
			if(input.indexOf(input.charAt(index)) != input.lastIndexOf(input.charAt(index))) {
				getNumberOfcharInString(input, input.charAt(index));
				flag= false;
			}	
				
		}
		if (flag=true)
			System.out.println("No duplicate char present");
		
		
	}
		
	public static void main(String[] hfd) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string : ");
		String srt=scanner.nextLine();
		
		System.out.println("Enter Character : ");
		char ch = scanner.next().charAt(0); 
		Assignment_20_String assignment_20_String= new Assignment_20_String();
		System.out.println("Character "+ch+"occures :" +assignment_20_String.getNumberOfcharInString(srt, ch)+" times");
		assignment_20_String.getEachChFrequency(srt);
		assignment_20_String.getUniqueChar(srt);
		assignment_20_String.printDuplicateCharWithFrequency(srt);	
		
	}

}


/*
System.out.println(srt.indexOf('z'));// which print -1 as not avaiable
System.out.println(srt.indexOf('h'));// which print 1 as frist time at "1" index
System.out.println(srt.lastIndexOf('r')); //which gives last time index of that 
*/
