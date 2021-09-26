/*Assignment - 30 : 8th Sep'2021
Program 1: Write a method to reverse a given number.
input : 1932
output : 2391

Program 2: Verify whether given number is Armstrong number.
input : 153
output : 153 is an Armstrong number

Q: what is Armstrong number ?
ans : An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.

Program 3: Verify given number is an Palindrome number.
input : 12321
output : 12321 is an Palindrome number

input : 123
output : 123 is not an Palindrome number.

(Optional) Program 4 : verify given number is a perfect number or not.

(Optional) Program 5 : verify given number is a perfect square.
*/

package amol_Vyas;

public class Assignment_30 {

	int getReverseNumber(int input) {
		int reverse = 0, reminder = 0;
		while (input > 0) {
			reminder = input % 10;
			reverse = (reverse * 10) + reminder;
			input = input / 10;
		}
		return reverse;
	}

	void isPalindromeNumber(int input) {
		if (input == getReverseNumber(input))
			System.out.println(input + " is palindrome number");
		else
			System.out.println(input + " is not palindrome number");

	}

	void isArmStrongNumber(int input) {
		int temp = input, reminder = 0, num = 0;
		while (input > 0) {
			reminder = input % 10;
			num = num + (reminder * reminder * reminder);
			input = input / 10;
		}
		if (temp == num) {
			System.out.println(temp + " is a Armstrong number");
		} else {
			System.out.println(temp + " is not a Armstrong number");
		}
	}

	void isPerfectNumber(int input) {
		int sum = 0;
		for (int index = 1; index < input; index++) {
			if (input % index == 0) {
				sum += index;
			}
		}
		if (sum == input)
			System.out.println(input + " is perfect Number");
		else
			System.out.println(input + " is not perfect Number");
	}

	void isPerfectSquare(int input) {
		int sqaure = (int) Math.sqrt(input);
		int output = sqaure * sqaure;
		if (output == input)
			System.out.println(input + " is perfect Sqaure");
		else
			System.out.println(input + " is not perfect square");

	}

	public static void main(String[] args) {
		Assignment_30 assignment_30 = new Assignment_30();
		System.out.println("Reverse of 321 number is " + assignment_30.getReverseNumber(321));
		System.out.println("Reverse of 1932 number is " + assignment_30.getReverseNumber(1932));
		assignment_30.isPalindromeNumber(12321);
		assignment_30.isPalindromeNumber(123);
		assignment_30.isArmStrongNumber(153);
		assignment_30.isArmStrongNumber(250);
		assignment_30.isPerfectNumber(28);
		assignment_30.isPerfectNumber(7);
		assignment_30.isPerfectSquare(64);
		assignment_30.isPerfectSquare(30);
	}
}
