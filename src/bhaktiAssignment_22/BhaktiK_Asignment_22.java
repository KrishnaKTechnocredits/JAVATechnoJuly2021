/*//Assignment - 22 : 25th Aug'2021

Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
//output : 13

Character.isDigit(ch);
	Character.isUpperCase(ch);
	Character.isLowerCase(ch);
	Character.isLetter(ch);
	Character.ge
*/
package bhaktiAssignment_22;

import java.util.Scanner;

public class BhaktiK_Asignment_22 {
	
	//Program 1 : Find total digits in a given string. By using Character methods 
	int getTotalDigits(String str) {
		int digitCount=0;
		for (int index=0 ; index < str.length(); index++ ) {
			if(Character.isDigit(str.charAt(index))) {
				digitCount++;
			}
		}
		
		return digitCount;
	}
	
	//Program 2 : Find sum of all the digits in a given string
	
	int findSumOFDigit(String str) {
		int sum=0;
		for (int index=0; index< str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				sum+=Character.getNumericValue(str.charAt(index));
			}
		}
		return sum;
	}
	
	public static void main (String[] hh) {
		BhaktiK_Asignment_22 bhaktiK_Asignment_22 =new BhaktiK_Asignment_22();
		System.out.println("Enter String ");
		Scanner scanner = new Scanner(System.in);
		String srt = scanner.nextLine();
		
		System.out.println("Number of digits: "+ bhaktiK_Asignment_22.getTotalDigits(srt));
		System.out.println("Sum of digits: "+ bhaktiK_Asignment_22.findSumOFDigit(srt));
		
	}
}
