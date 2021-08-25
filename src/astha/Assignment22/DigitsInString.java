/* Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13*/

package astha.Assignment22;

public class DigitsInString {

	int getNumberOfDigits(String input) {
		int count = 0;
		int sum = 0;
		for(int index=0; index<input.length(); index++) {
			if(Character.isDigit(input.charAt(index))) {
				count++;
				sum += Character.getNumericValue(input.charAt(index));
			}
		}
		
		System.out.println("The count of digits present in the given string "+ input +" is : " + count);
		return sum;
	}
	
	public static void main(String[] args) {
		DigitsInString digitInString = new DigitsInString();
		System.out.println("The sum of digits present in the given string is : " +digitInString.getNumberOfDigits("Te11ch2no3cr4edi2ts"));
	}

}
