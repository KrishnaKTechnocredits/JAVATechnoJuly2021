/*Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13*/


package ritabrata;

import java.util.Scanner;
public class Assignment22 {
	private static Scanner scanner;
	int findTotalDigits(String input) {
		int count=0;
		for(int index=0; index<input.length();index++) {
			char ch= input.charAt(index);
			if(Character.isDigit(ch)) {
				count++;
			}		
		}
		System.out.println(count);
		return count;
	}
	
	int findSumOfDigits(String input) {
		int sum=0;
		
		for(int index=0; index<input.length();index++) {
			char ch= input.charAt(index);
			if(Character.isDigit(ch)) {	
				sum+= Character.getNumericValue(ch);
			}		
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		Assignment22 digit= new Assignment22();
		scanner = new Scanner(System.in);
		System.out.println("Enter the string to find the total number of digits present: ");
		String input= scanner.nextLine();
		System.out.println("Total number of digits in the string are: ");
		digit.findTotalDigits(input);
		System.out.println("Enter the string to find the sum off al the digits present: ");
		String input1= scanner.nextLine();
		System.out.println("Total sum of digits present in the string are: ");
		digit.findSumOfDigits(input1);
		
	}

}
