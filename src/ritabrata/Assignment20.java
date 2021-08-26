/*Assignment-20 : 21st Aug'2021
Program 1: find frequency of given character from user defined string.
use scanner class to take word and character from user.
input : word -> technocredits
        ch -> e
output : e -> 2
Note : We don't have any method to take character from String. 
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
		 h -> 1  */

package ritabrata;
import java.util.Scanner;
public class Assignment20 {
	private static Scanner scanner;

	int getFreqOfUserDefStr(String word, char ch) {
		int count=0;
		for(int index=0; index<word.length(); index++) {
			if (word.charAt(index)==ch)
				count++;
		}
		System.out.println("In word "+ word+ ", count of "+ch+ " is ->: "+ count);
		return count;
	}

	void printFreqEachChar(String input) {
		for(int index=0; index<input.length(); index++) {
			if(index== input.indexOf(input.charAt(index))) 
				getFreqOfUserDefStr(input, input.charAt(index));
		}
	}

	void printUniqueChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
				getFreqOfUserDefStr(input, input.charAt(index));
		}
	}

	void printDuplicateChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.lastIndexOf(input.charAt(index))>input.indexOf(input.charAt(index)) )
				if(index == input.indexOf(input.charAt(index)))
					getFreqOfUserDefStr(input, input.charAt(index));
		}
	}

	public static void main(String[] args) {
		Assignment20 test= new Assignment20();
		scanner = new Scanner(System.in);
		System.out.println("Enter the new word: ");
		String input= scanner.nextLine();
		System.out.println("Enter the charecter: ");
		char ch= scanner.nextLine().charAt(0);
		test.getFreqOfUserDefStr(input, ch);
		System.out.println("Get frequency of all charecter: ");
		System.out.println("Enter String");	
		test.printFreqEachChar(scanner.nextLine());
		System.out.println("Get frequency of unique charecter: ");
		System.out.println("Enter String");
		test.printUniqueChar(scanner.nextLine());
		System.out.println("Get frequency of duplicate charecter: ");
		System.out.println("Enter String");
		test.printDuplicateChar(scanner.nextLine());
	}
}