/*Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6 */

package akshay;

import java.util.Scanner;

public class TotalDigit {

	int getDigitCount(String input) {
		int count = 0;
		char ch = 0;
		for(int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if(Character.isDigit(ch))
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		//String str = "Te1ch2no3cr4ed3it4s";
		TotalDigit total = new TotalDigit();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		System.out.println("Total digits in given string: " +total.getDigitCount(str));
	}
	
}
