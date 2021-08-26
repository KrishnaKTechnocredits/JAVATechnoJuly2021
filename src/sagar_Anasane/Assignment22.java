/*Assignment - 22 : 25th Aug'2021

Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13*/

package sagar_Anasane;

public class Assignment22 {
	int cnt = 0;
	int sum = 0;
	int totalDigitsInGivenString(String str) {
		for(int index = 1; index <str.length();index ++) {
			char ch = str.charAt(index);
			boolean isDigit = Character.isDigit(ch);
			if(isDigit)
			cnt ++;
		}
		System.out.println("Total Digits in Given String : " + cnt);
		return cnt;
	}
	
	int sumOfAllDigitsInGivenString(String str) {
		for(int index =1; index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("\n"+"Sum of all Digits in Given String : " + sum);
		return sum;
	}
	
	public static void main(String args[]) {
		String str1 = "Te1ch2no3cr4ed3it4s";
		String str2 = "Te11ch2no3cr4edi2ts";
		Assignment22 assignment22 = new Assignment22();
		assignment22.totalDigitsInGivenString(str1);
		assignment22.sumOfAllDigitsInGivenString(str2);
		
	}
}
