/*
 Assignment - 22 : 25th Aug'2021

Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13
 */
package sayli_Vyavhare;

import java.util.Scanner;

public class DigitsInString {
	
	int  getTotalDigits(String str) {
		int count=0;
		for(int index=0;index<str.length();index++) {
			
			char ch=str.charAt(index);
			boolean isDigit=Character.isDigit(ch);
               if(isDigit)
            	   count++;
			}
		return count;
	}
	
	int getSumOfAllDigits(String str1) {
		int sumOfDigit=0;
        for(int index=0;index<str1.length();index++) {
        	char ch=str1.charAt(index);
            if(Character.isDigit(ch)) {
            	sumOfDigit += Character.getNumericValue(ch);
             }
        }
		return sumOfDigit ;
	}
	public static void main(String[] args) {
		System.out.println("Enter String: ");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		DigitsInString digitsinstring=new DigitsInString();
		System.out.println("Total digits in string :"+(digitsinstring.getTotalDigits(str)));
		
		System.out.println("-----------------------------------"+ "\n" + 
		"Enter String to find sum of digits in it: ");
		String str1=scanner.next();
		System.out.println("Sum of total digits in string :"+(digitsinstring.getSumOfAllDigits(str1)));
		scanner.close();
	}
}
