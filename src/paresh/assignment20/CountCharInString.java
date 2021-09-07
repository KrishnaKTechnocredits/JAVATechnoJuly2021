package paresh.assignment20;

/*Assignment-20 : 21st Aug'2021

Program 1: find frequency of given character from user defined string.
use scanner class to take word and character from user.
input : word -> technocredits
        ch -> e
output : e -> 2
Note : We dont have any method to take character from String. 
Solution : char ch = scanner.next().charAt(0); will help to capture character given by user.		
Explanation : scanner.next() returns String and on that string we are asking for first character using charAt(0) method.*/


import java.util.Scanner;

public class CountCharInString {
	void findUniqueChar(String str) {
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			int count =0;
			for(int index1=0; index1<str.length(); index1++) {
				if(str.charAt(index1) == ch)
					count ++;
			}
			if(count==1)
				System.out.println(str.charAt(index) + " -> " + count);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scanner.next();
		CountCharInString countCharInString = new CountCharInString();
		countCharInString.findUniqueChar(str);
		scanner.close();
	}
}