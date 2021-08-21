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
		 h -> 1*/

package anuja;
import java.util.Scanner;

class Assignment_20 {

	void getFrequencyOfGivenCharacter(String word,char ch) {
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(ch==word.charAt(i)) {
				count++;
			}
		}
		System.out.println("Frequency of character "+  ch + " is "+count);
	}

	void getFreqOfEachChar(String input ) {
		for(int i=0;i<input.length();i++) {
			if(i==input.indexOf(input.charAt(i))) {
				char ch=input.charAt(i);
				calculateFreq(ch,input);
			}
		}
	}

	void calculateFreq(char ch,String input) {
		int count=0;
		for(int i=0;i<input.length();i++) {
			if(ch==input.charAt(i))
				count++;
		}
		System.out.println("Frequency of character "+  ch + " is "+count);
	}

	void getUniqueChar(String input) {
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			int count=0;
				for(int j=0;j<input.length();j++) {
					if(input.charAt(j)==ch)
					count++;
				}
			if(count==1)
				System.out.println(ch);
		}
	}

	void getDuplicateChar(String input) {
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			int count=0;
			for(int j=0;j<input.length();j++) {
				if(input.charAt(j)==ch)
					count++;
			}
			if(count>1 && i==input.indexOf(input.charAt(i)))
				calculateFreq(ch,input);
		}
	}

	public static void main(String[] args) {
		Assignment_20 assignment_20=new Assignment_20();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter word:");
		String word=scanner.next();
		System.out.println("Enter character:");
		char ch=scanner.next().charAt(0);
		assignment_20.getFrequencyOfGivenCharacter(word,ch);
		System.out.println("******************");
		System.out.println("Program 2");
		assignment_20.getFreqOfEachChar("hello");
		System.out.println("******************");
		System.out.println("Program 3");
		assignment_20.getUniqueChar("aakanksha");
		System.out.println("******************");
		System.out.println("Program 4");
		assignment_20.getDuplicateChar("aakanksha");
	}
}