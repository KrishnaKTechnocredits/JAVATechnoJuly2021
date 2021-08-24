package gauravk.Assignment_20;
/*
 * Assignment-20 : 21st Aug'2021

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
import java.util.Scanner;

public class FrequencyOfEachCharacterInString {
	
	void getStringData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the word of your choice.");
		String str = sc.next();
		processData(str);
	}
	
	void processData(String s) {
		for(int i=0; i<s.length(); i++) {
			if(i==s.indexOf(s.charAt(i))) {
				int c=0;
				char ch = s.charAt(i);
				if(i==s.indexOf(s.charAt(i))) {
					for(int j=0; j<s.length();j++) {
						if(s.charAt(j)==ch)
							c++;
					}
				}
				System.out.println(ch+"-->"+c);
			}
		}
	}
	
	public static void main(String[] args) {
		new FrequencyOfEachCharacterInString().getStringData();
	}
}
