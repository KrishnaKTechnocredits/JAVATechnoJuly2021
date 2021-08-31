/*Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13

 * */

package bhagyashree;

public class Assignment22 {
	int count = 0;

	int getCountOfDigitinString(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				// String temp=Character.isDigit(ch)+"";
				// int digit=Integer.parseInt(temp);
				count++;
			}
		}
		return count;
	}

	int getSumOfDigitsinString(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				// String temp=Character.isDigit(ch)+"";
				// int digit=Integer.parseInt(temp);
				// sum+=digit;
				sum += Character.getNumericValue(ch);

			}

		}
		return sum;

	}

	public static void main(String[] args) {
		// String str="Te1ch2no3cr4ed3it4s";
		Assignment22 assignment22 = new Assignment22();
		System.out.println("Count of Digits available in a giiven string: "
				+ assignment22.getCountOfDigitinString("Te1ch2no3cr4ed3it4s"));

		System.out.println(
				"Sum of Digits available in given string: " + assignment22.getSumOfDigitsinString("Te1ch2no3cr4ed3it4s"));
	}
}
