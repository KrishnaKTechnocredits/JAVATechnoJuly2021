/*Assignment - 30 : 8th Sep'2021
Program 1: Write a method to reverse a given number.
input : 1932
output : 2391
 
Program 2: Verify whether given number is Armstrong number.
input : 153
output : 153 is an Armstrong number
 
Q: what is Armstrong number ?
ans : An Armstrong number of three digits is an integer such that the sum of the cubes 
of its digits is equal to the number itself. 
For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
 
Program 3: Verify given number is an Palindrome number.
input : 12321
output : 12321 is an Palindrome number
 
input : 123
output : 123 is not an Palindrome number.
 
*
*/
package sayli_Vyavhare;

public class ArmstrongReverse_assign_30 {

	int getReverse(int num) {

		int reverse = 0, rem;
		while (num > 0) {
			rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num / 10;
		}
		return reverse;
	}

	void getPallindrome(int num) {

		int temp;
		temp = getReverse(num);

		if (temp == num)
			System.out.println(num + " is pallindrome");
		else
			System.out.println(num + " is not pallindrome");
	}

	int getArmstrong(int num) {

		int output = 0, sum = 0, temp = 0;
		while (num > 0) {

			temp = num % 10;
			output = temp * temp * temp;
			sum += output;
			num = num / 10;

		}

		return sum;
	}

	void isArmstrongNumber(int number) {

		if (getArmstrong(number) == number)
			System.out.println(number + " is armstrong number");
		else
			System.out.println(number + " is not a armstrong number");

	}

	public static void main(String[] args) {
		ArmstrongReverse_assign_30 reverse = new ArmstrongReverse_assign_30();
		System.out.println("Reverse number is: " + reverse.getReverse(1234));

		reverse.getPallindrome(12361);
		reverse.getPallindrome(121);

		reverse.isArmstrongNumber(153);
		reverse.isArmstrongNumber(364);

	}
}
