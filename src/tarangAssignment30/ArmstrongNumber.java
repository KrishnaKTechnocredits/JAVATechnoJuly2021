package tarangAssignment30;

/*Program 1: Write a method to reverse a given number.
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
(Optional) Program 4 : verify given number is a perfect number or not.
(Optional) Program 5 : verify given number is a perfect square.
*/
public class ArmstrongNumber {

	int reverseNumber(int input) {
		int output = 0;
		while (input > 0) {
			int num = input % 10;
			output = output * 10 + num;
			input = input / 10;
		}
		return output;
	}

	void armstrongNumber(int input) {
		int sum = 0;
		int temp = 0;
		int num = input;
		while (input > 0) {
			temp = input % 10;
			sum = sum + (temp * temp * temp);
			input = input / 10;
		}
		if (num == sum) {
			System.out.println(num + " is an Armstrong Number");
		} else {
			System.out.println(num + " is not an Armstrong Number");
		}
	}

	void isPallindrome(int input) {
		if (input == reverseNumber(input)) {
			System.out.println(input + " is a pallindrome");
		} else {
			System.out.println(input + " is not a pallondrome");
		}
	}

	void isPerfectNumber(int input) {
		int sum = 0;
		for (int num = 1; num < input; num++) {
			if (input % num == 0) {
				sum = sum + num;
			}
		}
		if (input == sum) {
			System.out.println(input + " is a perfect number");
		} else {
			System.out.println(input + " is not a perfect number");

		}
	}

	void isPerfectSquare(int input) {
		boolean flag = false;
		for (int num = 1; num < input; num++) {
			if (input % num == 0 && ((num * num) == input)) {
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		if (flag) {
			System.out.println(input + " is a perfect square");
		} else {
			System.out.println(input + " is not a perfect square");
		}
	}

	public static void main(String[] args) {
		ArmstrongNumber arm = new ArmstrongNumber();
		System.out.println("Reverse of a given number: " + arm.reverseNumber(1932));
		arm.armstrongNumber(153);
		arm.isPallindrome(12321);
		arm.isPerfectNumber(25);
		arm.isPerfectNumber(56);
		arm.isPerfectNumber(28);
		arm.isPerfectSquare(78);
		arm.isPerfectSquare(36);

	}

}
