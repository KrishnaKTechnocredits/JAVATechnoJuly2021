/*Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13*/

package avinash.stringassignment;

import java.util.Scanner;

public class TotalDigitAndSumOfAllDigits {
	
	int totalDigitofGivenNumber(String input) {
		int count = 0;
		for (int index=0; index<input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				count++;
			}
		}
		return count;
	}
	
	int SumOfDigits(String input) {
		int sum = 0;
		for (int index=0; index<input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				sum+=Character.getNumericValue(input.charAt(index));	
			}
		}
		return sum;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalDigitAndSumOfAllDigits totalDigitAndSumOfAllDigits = new TotalDigitAndSumOfAllDigits();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the given string");
		String input1 = scanner.next();
		int totalNumber = totalDigitAndSumOfAllDigits.totalDigitofGivenNumber(input1);
		System.out.println("Total number of "+input1+" numeric digits count is: "+totalNumber);
		System.out.println("********************");
		System.out.println("Enter the given string");
		String input2 = scanner.next();
		int sum = totalDigitAndSumOfAllDigits.SumOfDigits(input2);
		System.out.println("Sum of given "+input2+" all the digits is "+sum);
		
	}

}
