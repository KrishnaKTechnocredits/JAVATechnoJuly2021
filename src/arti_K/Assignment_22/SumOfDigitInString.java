/* Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts"  
output : 13
 */

package arti_K.Assignment_22;

public class SumOfDigitInString {
	
	int findSumofDigit(String str) {
		int sum = 0;
		for(int index=0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String str = "Te11ch2no3cr4edi2ts" ;
		SumOfDigitInString sumofdigit = new SumOfDigitInString();
		System.out.println("Sum of Digits in given string is : "+sumofdigit.findSumofDigit(str));
	}
}
