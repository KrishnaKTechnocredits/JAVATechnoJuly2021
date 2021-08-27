/*Assignment 20:
 * Program 1: find frequency of given character from user defined string.
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
package sayli_Vyavhare;
import java.util.Scanner;

public class OccurrenceOfCharInString {

			int getCharCount(String input1,char ch) {
			
				int count = 0;
				for(int index=0;index<input1.length();index++) {
					if(input1.charAt(index) == ch)
						count++;
				}
				System.out.println("In word " + input1 + ", freq of " + ch + ":" + count);
				return count;
			}
			
			int printFreqOfEachChar(String input) {
				int count = 0;
				for(int index=0;index<input.length();index++) {
					if(index==input.indexOf(input.charAt(index))) 
						count=getCharCount(input,input.charAt(index));
				}
				return count;

			}
			
			int getUniqueCharacters(String input) {
				for(int index=0;index<input.length();index++) {
					char ch=input.charAt(index);
					if(input.indexOf(ch)==input.lastIndexOf(ch))
						getCharCount(input,ch);
				}
				
				return 0;	
			}
			
			int getDuplicateCharacters(String input) {
				for(int index=0;index<input.length();index++) {
					char ch=input.charAt(index);
					if(input.indexOf(ch)<input.lastIndexOf(ch)) {
						if(index==input.indexOf(ch))
							getCharCount(input,ch);
				}
			}
				return 0;	
		}
	
	public static void main(String[] args) {
		
		OccurrenceOfCharInString occurrenceOfCharInString=new OccurrenceOfCharInString();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Occurrence of given character" + "\n" +"Enter the string: ");
		String str=scanner.next();
		System.out.println("Enter the character: ");
		char ch=scanner.next().charAt(0);
		occurrenceOfCharInString.getCharCount(str,ch);
		
		
		System.out.println("---------------------------------------------------"+"\n" +
		"Occurrence of each character of provided string "+ "\n" + "Enter the string: ");
		String str1=scanner.next();
		occurrenceOfCharInString.printFreqOfEachChar(str1);
		
		System.out.println("---------------------------------------------------"+"\n" +
		"Unique character in given string "+ "\n" + "Enter the string: ");
		String str2=scanner.next();
		occurrenceOfCharInString.getUniqueCharacters(str2);

		System.out.println("---------------------------------------------------"+"\n" +
		"Duplicate character in given string "+ "\n" + "Enter the string: ");
		String str3=scanner.next();
		occurrenceOfCharInString.getDuplicateCharacters(str3);
		scanner.close();

	}
}
