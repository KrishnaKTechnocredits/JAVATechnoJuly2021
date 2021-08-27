/*
 Surprise coding test : 26th Aug 2021

WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52

Hint: 6+9+16+4+17 = 52

And I am going to review your code after the session time.
Do not disappoint me.

Timing : 7:45 am to 8:30 am

All the best.
Branch name : yourName_ScodingTest_1
 */
package harshada;

import java.util.Scanner;

public class SumOfDigitsInString {

	int calculateSumOfDigitsInString(String inputStr) {
		int sum=0;
		
		for(int index=0;index<inputStr.length();index++) {
			//for(int index=0; index<input[index].length(); index++) {
				if (Character.isDigit(inputStr.charAt(index)))
					sum += Character.getNumericValue(inputStr.charAt(index));		
			}
		return sum;
	}
		
	int calculateSumOfDigitsInArray(String[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			sum += calculateSumOfDigitsInString(input[index]);
		}
		System.out.println(sum);
		return sum;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigitsInString sumOfDigitsInString1=new SumOfDigitsInString();
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a String : ");
		String input[] = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		sumOfDigitsInString1.calculateSumOfDigitsInArray(input);
	}

}
