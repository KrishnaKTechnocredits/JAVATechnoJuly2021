/*Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6
*/

package shyam;

public class TotalDigitsInGivenString {
	
	public static void main(String[] args) {
		
		String inputString = "Te1ch2no3cr4ed3it4s";
		
		System.out.println("Input String is :- " + inputString);
		System.out.println("Total digits found in input String is :- "
				+ new TotalDigitsInGivenString().getTotalDigits(inputString));
		
	}

	int getTotalDigits(String inputString) {
		int totalDigits = 0;
		for (int index = 0;index<inputString.length();index++) {
			if(Character.isDigit(inputString.charAt(index)))
				totalDigits ++;
		}
		
		return totalDigits;
	}
}
