/*
 Assignment - 22 : 25th Aug'2021
Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6
Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13
 */
package atul_K.Assignments.Ass22;

public class Assignment22 {

	int digitsFromString(String str) {
		int cnt =0;
		for (int index =0; index < str.length();index++) {
			if (Character.isDigit(str.charAt(index))) {
				cnt++;
			}
		}
		return cnt;
	}
	
	int getSumOfAllDigitFromString(String str) {
		int sum = 0;
		for (int index =0; index < str.length();index++) {
			if (Character.isDigit(str.charAt(index))) {
				sum+= Character.getNumericValue(str.charAt(index));
			}
		}
		return sum;
	}
	
	public static void main(String [] args) {
		String str = "Te11ch2no3cr4edi2ts";
		Assignment22 ass22 = new Assignment22();
		System.out.println(ass22.digitsFromString(str));//program1
		System.out.println(ass22.getSumOfAllDigitFromString(str));//program2
		}
}
