/*Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13
*/
package umakant;

public class Assignment22 {

	int getDigitCount(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				count++;
		}
		return count;
	}

	int getDigitCountUsingAscii(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if ((input.charAt(index)) >= 48 && (input.charAt(index)) <= 57)
				count++;
		}
		return count;
	}

	int getSumOfDigitCount(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				sum += Character.getNumericValue(input.charAt(index));
		}
		return sum;
	}

	int getSumOfDigitCountUsingAscii(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if ((input.charAt(index)) >= 48 && (input.charAt(index)) <= 57)
				sum += (input.charAt(index) - 48);
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment22 assignment = new Assignment22();
		System.out.println("******Using Inbuilt Method*********");
		System.out.println(assignment.getDigitCount("Te1ch2no3cr4ed3it4s"));
		System.out.println(assignment.getSumOfDigitCount("Te11ch2no3cr4edi2ts"));
		System.out.println("******Using Ascii Values*********");
		System.out.println(assignment.getDigitCountUsingAscii("Te1ch2no3cr4ed3it4s"));
		System.out.println(assignment.getSumOfDigitCountUsingAscii("Te11ch2no3cr4edi2ts"));
	}

}
