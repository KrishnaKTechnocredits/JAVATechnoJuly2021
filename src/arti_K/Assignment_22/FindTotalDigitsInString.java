/*Assignment - 22 : 25th Aug'2021

Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6
 */

package arti_K.Assignment_22;

public class FindTotalDigitsInString {
	
	int findDigitCount(String input) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "Te1ch2no3cr4ed3it4s";
		FindTotalDigitsInString totaldigit = new FindTotalDigitsInString();
		System.out.println("Total count of digits in given string is : "+totaldigit.findDigitCount(str));
	}
}
