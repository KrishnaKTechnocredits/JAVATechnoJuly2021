/* Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13 */

package akshay;

import java.util.Scanner;

public class SumofDigit {

	int getDigitSum(String input) {
		int sum = 0;
		char ch = 0;
		for(int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if(Character.isDigit(ch))
				sum = Character.getNumericValue(ch) + sum;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		//String str = "Te1ch2no3cr4ed3it4s";
		SumofDigit sum = new SumofDigit();
		TotalDigit total = new TotalDigit();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		System.out.println("Sum of digit in given string: " +sum.getDigitSum(str));
	}
	
}
