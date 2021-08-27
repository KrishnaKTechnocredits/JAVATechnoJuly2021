package swati.Assignment22;

import java.util.*;
public class FindTotalDigitAndSumOfAllDigits {
	
	void FindTotalDigits(String inputStr) {
		int count=0;
		for(int index=0;index<inputStr.length();index++) {
			if(Character.isDigit(inputStr.charAt(index))) {
				count++;
			}
		}
	System.out.println("\nTotal digits in "+inputStr+" is:"+ count);
	}
	
	void sumOfTotalDigits(String inputStr) {
		int sum=0;
		for(int index=0;index<inputStr.length();index++) {
			if(Character.isDigit(inputStr.charAt(index))) {
				
				sum=sum+Character.getNumericValue((inputStr.charAt(index)));
			}
		}
		System.out.println("\nSum of all the digits in "+inputStr+" is:"+ sum);
	}
	
	public static void main(String[] arg) {
		FindTotalDigitAndSumOfAllDigits totalDSum =new FindTotalDigitAndSumOfAllDigits();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to find total digits in a given string:");
		String inputString=scan.next();
		totalDSum.FindTotalDigits(inputString);
		System.out.println("\nEnter String to find Sum of all the digits in a given string:");
		inputString=scan.next();
		totalDSum.sumOfTotalDigits(inputString);
	}

}
