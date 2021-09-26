/*Assignment - 30 : 8th Sep'2021
Program 3: Verify given number is an Palindrome number.
input : 12321
output : 12321 is an Palindrome number

input : 123
output : 123 is not an Palindrome number.
*/
package shraddha.Assignment30;

public class VerifyNumberIsPalidrome {
	public static void main(String[] args) {
		int inputNumber = 1232;
		System.out.println("Given Number is :- " + inputNumber);
		VerifyNumberIsPalidrome newObject = new VerifyNumberIsPalidrome();
		int reverse = newObject.reverseANumber(inputNumber);
		if (inputNumber == reverse)
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number is NOT a palindrome");
	}

	int reverseANumber(int inputNumber) {
		int revNumber = 0;
		while (inputNumber > 0) {
			revNumber = revNumber * 10 + inputNumber % 10;
			inputNumber = inputNumber / 10;
		}
		return revNumber;
	}
}
